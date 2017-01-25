package org.ycallec.gestform.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import org.ycallec.gestform.model.Formation;
import org.ycallec.gestform.model.Stagiaire;

public class StagiaireDAO {

	public static void saveStagiaire(Stagiaire s) throws Exception {
        Connection connection = ConnectDB.getConnection();

        PreparedStatement stmCreatePersonne;
        PreparedStatement stmCreateStagiaire;
        try {
            connection.setAutoCommit(false);

            stmCreatePersonne = connection.prepareStatement("INSERT INTO Personne (nom, prenom) VALUES(?, ?);", Statement.RETURN_GENERATED_KEYS);
            stmCreatePersonne.setString(1, s.getNom());
            stmCreatePersonne.setString(2, s.getPrenom());

            stmCreatePersonne.execute();

            ResultSet rs = stmCreatePersonne.getGeneratedKeys();
            if (!rs.next()) {
                throw new Exception("humm cannot get generated personne id");
            }
            s.setId(rs.getInt(1));

            stmCreateStagiaire = connection.prepareStatement("INSERT INTO Stagiaire (matricule, id_personne, id_formation) VALUES(?, ?, ?);");
            stmCreateStagiaire.setInt(2, s.getId());
            stmCreateStagiaire.setInt(1, s.getMatricule());           
            stmCreateStagiaire.setInt(3, s.getFormation().getId());
            stmCreateStagiaire.execute();

            connection.commit();
            stmCreatePersonne.close();
            stmCreateStagiaire.close();

        } catch (SQLException e) {
            connection.rollback();
            throw new Exception("error while creating personne " + e.getMessage());
        }
    }

	
	public static List<Stagiaire> findAllStagiaire() {
			
			Connection connection = ConnectDB.getConnection();
	        
	        List<Stagiaire> stagiaires = new ArrayList<>();
	        Statement stm;
	        try {
	            stm = connection.createStatement();
	
	            String sql = "select * from Stagiaire s INNER JOIN Personne p on s.id_personne=p.id INNER JOIN Formation f on s.id_formation=f.id" ;
	            ResultSet rs = stm.executeQuery(sql);
	
	            while (rs.next()) {
	            	String nom = rs.getString("p.nom");
	            	String prenom = rs.getString("p.prenom");
	            	int id = rs.getInt("id");
	                int matricule = rs.getInt("matricule");
	                
	                
	                
	                Stagiaire s = new Stagiaire(nom, prenom,id ,matricule);
	                
	                stagiaires.add(s);
	            }
	            rs.close();
	
	        } catch (SQLException e) {
	            throw new RuntimeException();
	        }
	
	        return stagiaires;
        
}
	
}
