package org.ycallec.gestform;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.ycallec.gestform.dao.FormationDAO;
import org.ycallec.gestform.dao.StagiaireDAO;
import org.ycallec.gestform.model.Fen;
import org.ycallec.gestform.model.Fenetre;
import org.ycallec.gestform.model.Formation;
import org.ycallec.gestform.model.FormationTableModel;
import org.ycallec.gestform.model.Stagiaire;



public class Index {

	static Scanner sc = new Scanner(System.in);
	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {
		char reponse = 'o';
		int menu = 0;
		int code = 0;
		List<Stagiaire> al = new ArrayList<>();
		Stagiaire s = null;
		
		Fen fen = new Fen();
		fen.setVisible(true);
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		while (reponse == 'o' || reponse =='n') {
//
//			System.out.println("=============================");
//			System.out.println("|   MENU SELECTION DEMO     |");
//			System.out.println("=============================");
//			System.out.println("| Options:                  |");
//			System.out.println("|   1. Ajouter stagiaire    |");
//			System.out.println("|   2. Afficher liste       |");
//			System.out.println("|   3. Ajouter une formation|");
//			System.out.println("|   4. Exit                 |");
//			System.out.println("=============================");
//
//			System.out.println("Entrez votre choix : ");
//
//			menu = Integer.parseInt(sc.nextLine());
//
//			if (menu == 1) {
//				
//				while (reponse == 'o') {
//
//					System.out.println("Veuillez saisir le nom du stagiaire: ");
//					String nomStagiaire = sc.nextLine();
//					System.out.println("Veuillez saisir le prénom du stagiaire: ");
//					String prenomStagiaire = sc.nextLine();  
//					System.out.println("Veuillez saisir le matricule: ");
//					int matricule = Integer.parseInt(sc.nextLine());
//					System.out.println("Veuillez choisir le numéro de la formation: ");
//					List<Formation> formations = FormationDAO.findAllFormation();
//						for (Formation form : formations) {
//							System.out.println(form.getId() + " " + form.getNom());
//						}
//						int id = Integer.parseInt(sc.nextLine());
//						Formation f = null;
//						for (Formation form : formations) {
//							if (form.getId() == id) {
//								f = form;
//								break;
//							}
//						}
//					
//					StagiaireDAO.saveStagiaire(new Stagiaire(nomStagiaire, prenomStagiaire,1 , matricule , f  ));
//	
//				}
//			}
//
//			else if (menu == 2) {
//				System.out.println("Lol");
//			}
//
//			else if (menu == 3) {
//				System.out.println("Veuillez saisir le nom de la formation: ");
//				String formation = sc.nextLine();
//				FormationDAO.saveFormation(new Formation(0,formation));
//			}
//			
//			else if (menu == 4) {
//				
//			}
//			
//			else {
//				System.out.println("Au revoir...");
//				break;
//			}
//
//		}
//
//		
	}

}
