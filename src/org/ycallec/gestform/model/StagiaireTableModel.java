package org.ycallec.gestform.model;

import java.util.ArrayList;
import java.util.List;

import javax.swing.table.AbstractTableModel;

public class StagiaireTableModel extends AbstractTableModel {

    private final String[] colonnes = {"matricule", "Nom", "Prenom", "Formation"};
    private List<Stagiaire> stagiaires;

    public StagiaireTableModel() {
        this.stagiaires = new ArrayList<>();
    }

    public StagiaireTableModel(List<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public int getRowCount() {
        return stagiaires.size();
    }

    public void addStagiaire(Stagiaire s) {
        this.stagiaires.add(s);
    }
    
    public void setStagiaires(List<Stagiaire> stagiaires) {
        this.stagiaires = stagiaires;
    }

    public Stagiaire getStagiaire(int rowIndex) {
        return stagiaires.get(rowIndex);
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                return stagiaires.get(rowIndex).getMatricule();

            case 1:
                return stagiaires.get(rowIndex).getNom();

            case 2:
                return stagiaires.get(rowIndex).getPrenom();

            case 3:
                return stagiaires.get(rowIndex).getFormation();

            default:
                throw new IllegalArgumentException();
        }

    }

}
