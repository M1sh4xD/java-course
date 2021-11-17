package gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import controller.Controller;

public class EmployeeFrame extends JFrame {
    private Controller controller;
    private JButton addButton;

    public EmployeeFrame(){
        super("Staff Manager");

        controller = new Controller();
        setLayout(new BorderLayout());

        EmployeeAddForm empAddForm = new EmployeeAddForm();

        TableForm tableForm = new TableForm();
        tableForm.setData(controller.getEmployees());

        addButton = new JButton("Add");
        addButton.addActionListener(e -> {
            empAddForm.addDataToDB();
            //controller.updateEmployees();
            tableForm.setData(controller.getEmployees());
            tableForm.refresh();
        });

        JButton refreshButton = new JButton("Refresh");
        refreshButton.addActionListener(e -> {
            tableForm.setData(controller.getEmployees());
            tableForm.refresh();
        });

        add(empAddForm.getEmployeeAddPanel(), BorderLayout.WEST);

        add(tableForm.getTablePanel(), BorderLayout.CENTER);

        add(addButton, BorderLayout.SOUTH);
        add(refreshButton, BorderLayout.AFTER_LINE_ENDS);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setVisible(true);
    }
}
