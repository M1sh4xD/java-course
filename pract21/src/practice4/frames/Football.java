package practice4.frames;

import javax.swing.*;
import java.awt.*;

public class Football extends JFrame {
    private static final String MILAN = "AC Milan";
    private static final String REAL_MADRID = "Real Madrid";

    JButton btnMilan = new JButton(MILAN);
    JButton btnRealMadrid = new JButton(REAL_MADRID);
    JLabel jlResult = new JLabel("Result: 0 X 0");
    JLabel jlLastScorer = new JLabel("Last Scorer: N/A");
    Label lWinner = new Label("Winner: DRAW");
    int milanScore = 0;
    int realMadridScore = 0;
    String lastScorer = "N/A";
    String winner = "N/A";
    boolean check;

    public Football() {
        super("Practice 4");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(300, 300);
        setLayout(new FlowLayout());
        add(btnMilan);
        add(btnRealMadrid);
        add(jlResult);
        add(jlLastScorer);
        add(lWinner);

        btnMilan.addActionListener(ae -> {
            milanScore++;
            jlLastScorer.setText("Last Scorer: " + MILAN);
            onClick();
        });
        btnRealMadrid.addActionListener(ae -> {
            realMadridScore++;
            jlLastScorer.setText("Last Scorer: " + REAL_MADRID);
            onClick();
        });
    }

    private void onClick() {
        jlResult.setText("Result: " + milanScore + " X " + realMadridScore);
        if (milanScore > realMadridScore) {
            lWinner.setText("Winner: " + MILAN);
        } else if (realMadridScore > milanScore) {
            lWinner.setText("Winner: " + REAL_MADRID);
        } else {
            lWinner.setText("Winner: DRAW");
        }
    }
}