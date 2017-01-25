package org.ycallec.gestform.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.ycallec.gestform.model.Formation;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;


public class FormationDAO {

	public static void saveFormation(Formation f) throws Exception {
		Connection connection = ConnectDB.getConnection();
		
		PreparedStatement stmCreateFormation;
		try {
				stmCreateFormation = connection.prepareStatement("INSERT INTO Formation (nom) VALUES (?);", Statement.RETURN_GENERATED_KEYS);
				stmCreateFormation.setString(1, f.getNom());
				
				stmCreateFormation.execute();
				
				ResultSet rs = stmCreateFormation.getGeneratedKeys();
				if (!rs.next()) {
					System.out.println("Au revoir...");
	                return;
	            }
				f.setId(rs.getInt(1));
				
				stmCreateFormation.close();
			}
		
		catch (SQLException e) {
        
		throw new Exception("error while creating personne " + e.getMessage());
		}
	}
	
	public static List<Formation> findAllFormation() {
		
		Connection connection = ConnectDB.getConnection();
        
        List<Formation> formations = new ArrayList<>();
        Statement stm;
        try {
            stm = connection.createStatement();

            String sql = "select * from Formation";
            ResultSet rs = stm.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String nom = rs.getString("nom");
                
                Formation f = new Formation(id, nom);
                
                formations.add(f);
            }
            rs.close();

        } catch (SQLException e) {
            throw new RuntimeException();
        }

        return formations;
        
}
	
	
}
