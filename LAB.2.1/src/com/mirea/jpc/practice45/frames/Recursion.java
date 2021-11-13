// FIXME:
//  clean jlresult after dispose dialog (won`t fix tbh)

package com.mirea.jpc.practice45.frames;

import com.mirea.jpc.practice45.recursion.*;
import javax.swing.*;


public class Recursion extends JFrame {

    private JDialog createDialog(String title) {
        JDialog dialog = new JDialog(this, title, true);
        dialog.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        dialog.setSize(180,90);
        return dialog;
    }

    public Recursion() {
        super("Recursion main frame");

        JLabel jlTitle = new JLabel("Please select the task");
        JLabel jlResult = new JLabel("Result: NaN");
        JButton btnSumOfDig = new JButton("Sum of dig");
        JButton btnNNumbers = new JButton("NNumbers");
        JButton btnRange = new JButton("Range");


        btnSumOfDig.addActionListener(ae -> { //Sum of dig task
            JDialog dialog = createDialog("Sum of dig");
            JTextField jtField = new JTextField(15);

            jtField.addActionListener(ae1 -> {
                try {
                    jlResult.setText("Result: " + SumOfDig.doSum(Integer.parseInt(jtField.getText())));
                    SumOfDig.doDispose();
                } catch (NumberFormatException | StackOverflowError s) {
                    jlResult.setText("<html><font color=RED>If you do it again I'll explode your PC</font><br>" +
                            "Possible errors:<br>- Input is over 15 columns<br>- Input is not int<br>- Stackoverflow</html>");
                }
            });

            JPanel content = new JPanel();

            content.add(new JLabel("Press enter after input"));
            content.add(jtField);
            content.add(jlResult);

            dialog.setContentPane(content);
            dialog.setSize(300,300);
            dialog.setVisible(true);
        });

        btnNNumbers.addActionListener(ae -> { //numbers task
            JDialog dialog = createDialog("NNumbers");
            JTextField jtFielda = new JTextField(1);
            JTextField jtFieldb = new JTextField(1);
            jtFieldb.setText("1");
            JButton jButton = new JButton("Submit");

           /* jtFielda.addActionListener(new ActionListener() { FIXME: fixed
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        NNumbers.doNNumbers(Integer.parseInt(jtField.getText()));
                        jlResult.setText("Result" + NNumbers.temp);
                        NNumbers.doDispose();
                    } catch (NumberFormatException s) {
                        jlResult.setText("<html><font color=RED>If you do it again I'll explode your PC</font><br>" +
                                "Possible errors:<br>- Input is over 2 columns<br>- Input is not int</html>");
                    }
                }
            });*/

            jButton.addActionListener(ae1 -> {
                try {
                    NNumbers.doNNumbers(Integer.parseInt(jtFielda.getText()), Integer.parseInt(jtFieldb.getText()));
                    jlResult.setText("Result" + NNumbers.temp);
                    NNumbers.doDispose();
                } catch (NumberFormatException | StackOverflowError s ) {
                    jlResult.setText("<html><font color=RED>If you do it again I'll explode your PC</font><br>" +
                            "Possible errors:<br>- Input is over 1 column<br>- Input is not int<br>- Stackoverflow</html>");
                }
            });

            JPanel content = new JPanel();

            content.add(new JLabel("Press button after input"));
            content.add(jtFielda); // FIXME: fixed
            content.add(jtFieldb);
            content.add(jButton);
            content.add(jlResult);

            dialog.setContentPane(content);
            dialog.setSize(300,300);
            dialog.setVisible(true);
        });

        btnRange.addActionListener(ae -> { //reverted range task
            JDialog dialog = createDialog("reverted range task");
            JTextField jtFielda = new JTextField(1);
            JTextField jtFieldb = new JTextField(1);
            JButton jButton = new JButton("Submit");

            jButton.addActionListener(ae1 -> {
                try {
                    Range.doRange(Integer.parseInt(jtFielda.getText()), Integer.parseInt(jtFieldb.getText()));
                    jlResult.setText("Result" + Range.temp);
                    Range.doDispose();
                } catch (NumberFormatException | StackOverflowError s ) {
                    jlResult.setText("<html><font color=RED>If you do it again I'll explode your PC</font><br>" +
                            "Possible errors:<br>- Input is over 1 column<br>- Input is not int<br>- Stackoverflow</html>");
                }
            });

            JPanel content = new JPanel();

            content.add(new JLabel("Press button after input"));
            content.add(jtFielda);
            content.add(jtFieldb);
            content.add(jButton);
            content.add(jlResult);

            dialog.setContentPane(content);
            dialog.setSize(300,300);
            dialog.setVisible(true);
        });

        JPanel content = new JPanel();

        content.add(btnNNumbers);
        content.add(btnRange);
        content.add(btnSumOfDig);
        content.add(jlTitle);

        setContentPane(content);
        setSize(350,190);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}