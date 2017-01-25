package org.ycallec.gestform.model;

import java.util.List;

import javax.swing.table.AbstractTableModel;

public class FormationTableModel extends AbstractTableModel{

	private final String[] colonnes = {"id", "nom"};
	private List<Formation> formations;
	
	public FormationTableModel(List<Formation> formations) {
		this.formations = formations;
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
		return formations.size();
	}
	   
	public Formation getFormation(int rowIndex){
        return formations.get(rowIndex);
	}   
	
	@Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {

            case 0:
                return formations.get(rowIndex).getId();

            case 1:
            	return formations.get(rowIndex).getNom();
            	
            default:
            	throw new IllegalArgumentException();
        }
	}
}
