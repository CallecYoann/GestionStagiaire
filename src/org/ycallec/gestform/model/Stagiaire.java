 package org.ycallec.gestform.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Stagiaire extends Personne implements Serializable {


	int matricule ;
	Formation formation;
	List<Formation> formations = new ArrayList<>();
	
	public Stagiaire(String nom, String prenom, int id, int matricule
			) {
		super(nom, prenom);
		this.id = id;
		this.matricule = matricule;
		
	}

	public Stagiaire(String nom, String prenom, int id, int matricule,
			Formation formation) {
		super(nom, prenom);
		this.id = id;
		this.matricule = matricule;
		this.formation = formation;
	}

	
	
	public Stagiaire(String nom, String prenom, int matricule,
			Formation formation) {
		super(nom, prenom);
		this.matricule = matricule;
		this.formation = formation;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public int getMatricule() {
		return matricule;
	}

	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	public Formation getFormation() {
		return formation;
	}

	public void setFormation(Formation formation) {
		this.formation = formation;
	}
	
	
	
	
	

	
	
	
}
