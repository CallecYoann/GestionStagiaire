package org.ycallec.gestform.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Personne {
	
	int id;
	String nom;
	String prenom;
	
	public Personne(String nom, String prenom) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		
	}

	

	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String toString() {
		return this.nom + " " + this.prenom;
	}
	
}
