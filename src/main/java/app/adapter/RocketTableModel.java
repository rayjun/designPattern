 package app.adapter;

import javax.swing.table.AbstractTableModel;

import com.oozinoz.firework.Rocket;

public class RocketTableModel extends AbstractTableModel {

    protected Rocket[] rockets;

    protected String[] columnNames = new String[] {"Name", "Price", "Apogee"};

    public RocketTableModel(Rocket[] rockets) {
        this.rockets = rockets;
    }

    public String getColumnName(int i) {

        if(i > 2) {
            return "";
        }

        return columnNames[i];
    }

	public int getRowCount() {
		return this.rockets.length;
	}

	public int getColumnCount() {
		return this.columnNames.length;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
        if(rowIndex > rockets.length -1 && columnIndex > 2) {
            return null;
        }
        Rocket r = rockets[rowIndex];
        switch(columnIndex) {
            case 0:
            return r.getName();
            case 1:
            return r.getPrice();
            case 2:
            return r.getApogee();
        }
		return null;
	}

}