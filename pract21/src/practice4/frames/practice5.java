package practice4.frames;

import practice4.recursion.SumOfDig;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;

import javax.swing.*;

public class practice5 extends JFrame {

    public static void main(String[] args)
    {
        practice5 main = new practice5(args);
        main.go();
    }

    public practice5(String ... args)
    {}

    public void go()
    {
        JPanel headerPanel = getPanel(Color.RED);
        JPanel middlePanel = getPanel(Color.GRAY);
        JPanel footerPanel = getPanel(Color.BLUE);

        JTextField smallField = new JTextField(16);

        smallField.setText("23");
        int num = Integer.parseInt(smallField.getText());

        smallField.addActionListener(e -> JOptionPane.showMessageDialog(practice5.this, "Your word: " + SumOfDig.doSum(num)));


        JLabel currentTheme = new JLabel("Choose your theme");

        JButton taskFirst = new JButton("First");
        taskFirst.addActionListener(ae -> {
            currentTheme.setText("Current theme is first");
            middlePanel.add(smallField);

        });

        JButton taskSecond = new JButton("Second");
        taskSecond.addActionListener(ae -> {
            currentTheme.setText("Current theme is Second");
            middlePanel.add(smallField);
        });

        JButton taskThird = new JButton("Third");
        taskThird.addActionListener(ae -> {

        });

        headerPanel.add(currentTheme);
        footerPanel.add(taskFirst);
        footerPanel.add(taskSecond);
        footerPanel.add(taskThird);

        JPanel p1 = getPanel(Color.GRAY);
        JPanel p4 = getPanel(Color.GRAY);

        middlePanel.add(p1);

        JFrame mainFrame = new JFrame();
        mainFrame.add(headerPanel, BorderLayout.NORTH);
        mainFrame.add(middlePanel, BorderLayout.CENTER);
        mainFrame.add(footerPanel, BorderLayout.SOUTH);
        mainFrame.pack();

        mainFrame.setVisible(true);

    }

    private JPanel getPanel(Color c)
    {
        JPanel result = new JPanel();
        result.setBorder(BorderFactory.createLineBorder(c));
        return result;
    }

}