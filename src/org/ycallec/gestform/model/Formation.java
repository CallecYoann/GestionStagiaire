package org.ycallec.gestform.model;

import java.util.ArrayList;
import java.util.List;

public class Formation {

	private Integer id;
	String nom;
	List<Stagiaire> al = new ArrayList<>();
	


	public Formation(Integer id, String nom) {
		super();
		this.id = id;
		this.nom = nom;
	}
	
	public Formation(Integer id, String nom, List<Stagiaire> al) {
		super();
		this.id = id;
		this.nom = nom;
		this.al = al;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public List<Stagiaire> getAl() {
		return al;
	}

	public void setAl(List<Stagiaire> al) {
		this.al = al;
	}

	
	@Override
	public String toString() {
		return "" + nom + "";
	}


	
}
