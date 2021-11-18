package gui;

import javax.swing.table.AbstractTableModel;
import java.util.List;

import model.Employee;

public class StaffTableModel extends AbstractTableModel {
    private List<Employee> db;
    private String[] colsName = {"Name", "Department", "Age", "Phone", "Position", "Gender"};

    public void setData(List<Employee> db) {
        this.db = db;
    }

    @Override
    public String getColumnName(int i) {
        return colsName[i];
    }

    @Override
    public int getRowCount() {
        return db.size();
    }

    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int row, int column) {
        Employee emp = db.get(row);

        return switch (column) {
            case 0 -> emp.getName();
            case 1 -> emp.getDepartment();
            case 2 -> emp.getAge();
            case 3 -> emp.getPhone();
            case 4 -> emp.getPosition();
            case 5 -> emp.getGender();
            default -> null;
        };
    }
}
