package org.ycallec.gestform.model;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GraphicsConfiguration;
import java.awt.GridLayout;
import java.awt.HeadlessException;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import javax.swing.JScrollPane;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.List;

import javax.swing.AbstractAction;
import javax.swing.Action;

import org.ycallec.gestform.dao.FormationDAO;
import org.ycallec.gestform.dao.StagiaireDAO;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextField;
 
public class Fenetre extends JFrame {
	private JPanel pannel = new JPanel();
	private JButton bouton = new JButton("Mon bouton");
	private JTable tableStagiaire;
	private JTable table;
	private JTable table_1;
	private JTable table_2;
	private JTextField textField;
	private JTextField saisieNomFormation;
	FormationTableModel ftm;
	
	public Fenetre(){      
	    this.setTitle("Ma première fenêtre Java");
	    this.setVisible(true);
	    this.setSize(610,500);
	    this.setLocationRelativeTo(null);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    getContentPane().setLayout(null);
	    
	    JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
	    tabbedPane.setBounds(0, 12, 610, 471);
	    getContentPane().add(tabbedPane);
	    
	    JPanel panel = new JPanel();
	    tabbedPane.addTab("Formation", null, panel, null);
	    panel.setLayout(null);
	    
	    JButton btnCreerUneFormation = new JButton("Créer une formation");
	    btnCreerUneFormation.setBounds(404, 71, 177, 25);
	    panel.add(btnCreerUneFormation);
	    
	    JScrollPane scrollPane_1 = new JScrollPane();
	    scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollPane_1.setBounds(12, 35, 366, 414);
	    panel.add(scrollPane_1);
	    
	    table_1 = new JTable();
	    scrollPane_1.setColumnHeaderView(table_1);
	    ftm = new FormationTableModel(FormationDAO.findAllFormation());
	    table_1.setModel(ftm);
	    
//	    saisieNomFormation = new JTextField();
//	    saisieNomFormation.setBounds(394, 28, 200, 31);
//	    saisieNomFormation.setText("Nom de la formation");
//	    saisieNomFormation.addFocusListener(new FocusListener(){
//	    	@Override
//            public void focusGained(FocusEvent e){
//                saisieNomFormation.setText("");
//            }
//	    	@Override
//	    	public void focusLost(FocusEvent e){
//	    		if(saisieNomFormation.getText().equals("Nom de la formation")){
//	    			
//	    			saisieNomFormation.setText("Nom de la formation");
//	    			
//	    		}
//	    	}
//	    });
	    panel.add(saisieNomFormation);
	    saisieNomFormation.setColumns(10);
	    
	    
	    
	    
	    
	    
	    
//	    btnCreerUneFormation.addActionListener(new ActionListener() {
//	    	public void actionPerformed(ActionEvent arg0) {
//	    		//JOptionPane jop = new JOptionPane();
//	    		//String nomFormation = JOptionPane.showInputDialog(null, "Veuillez saisir le nom de la nouvelle formation", "Création de formation", JOptionPane.QUESTION_MESSAGE);
//	    		
//	    		String nomFormation = saisieNomFormation.getText();
//	    		try {
//	    			Formation newForm = new Formation(0,nomFormation);
//	    			FormationDAO.saveFormation(newForm);
//	    			ftm.addFormation(newForm);
//	    			ftm.fireTableDataChanged();
//	    		} catch (Exception e) {
//	    			// TODO Auto-generated catch block
//	    			e.printStackTrace();
//	    		}
//	    	}
//	    	
//	    });
	   
	    
	    JPanel panel_1 = new JPanel();
	    tabbedPane.addTab("Stagiaire", null, panel_1, null);
	    panel_1.setLayout(null);
	    
	    JButton btnListeStagiaires = new JButton("Liste des stagiaires");
	    btnListeStagiaires.setBounds(403, 43, 175, 25);
	    panel_1.add(btnListeStagiaires);
	    
	    
	    JButton btnAjouterUnStagiaire = new JButton("Ajouter un stagiaire");
	    btnAjouterUnStagiaire.setBounds(403, 117, 176, 25);
	    panel_1.add(btnAjouterUnStagiaire);
	    
	    JScrollPane scrollPane_2 = new JScrollPane();
	    scrollPane_2.setBounds(7, 12, 384, 432);
	    panel_1.add(scrollPane_2);
	    
//	    table_2 = new JTable();
//	    scrollPane_2.setColumnHeaderView(table_2);
//	    StagiaireTableModel stm = new StagiaireTableModel(StagiaireDAO.findAllStagiaire());
//	    table_2.setModel(stm);
	    
	    
	    
	    tableStagiaire = new JTable();
	    btnAjouterUnStagiaire.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		
	    		 JOptionPane jop = new JOptionPane();
	    		 String nomStagiaire = JOptionPane.showInputDialog(null, "Veuillez saisir votre nom !", "Ajouter un stagiaire", JOptionPane.QUESTION_MESSAGE);
	    		 String prenomStagiaire = JOptionPane.showInputDialog(null, "Veuillez saisir votre prénom !", "Ajouter un stagiaire", JOptionPane.QUESTION_MESSAGE);
	    		 String strMatricule = JOptionPane.showInputDialog(null, "Veuillez saisir votre matricule !", "Ajouter un stagiaire", JOptionPane.QUESTION_MESSAGE);
	    		 int matricule = Integer.parseInt(strMatricule); 
	    		 
	    		 List<Formation> formations = FormationDAO.findAllFormation();
	    		 Object[] options = formations.toArray();
	    		 
	    		 Object reponse = JOptionPane.showInputDialog(null,"Veuillez choisir votre formation", "Ajouter un stagiaire", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
	    		 Formation formation = (Formation)reponse;
	    		 
	    		 try {
					StagiaireDAO.saveStagiaire(new Stagiaire(nomStagiaire, prenomStagiaire,1 , matricule, formation));
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	 
	    	}
	    	
	    });
	    btnListeStagiaires.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent arg0) {
	    		List<Stagiaire> stagiaires = StagiaireDAO.findAllStagiaire();
	    		JList<String> displayList = new JList<>(stagiaires.toArray(new String[0]));
	    		JScrollPane scrollPane = new JScrollPane(displayList);
	    		
	    	}	
	    });
	    
	   
	    
    
    
	    
	    
	    }      
	}
