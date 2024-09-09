import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickerUI implements ActionListener {
    private int score = 0;
    JFrame gameFrame = new JFrame("Clicker Game");
    JButton gameButton = new JButton();
    JPanel titlePanel = new JPanel();
    JPanel scorePanel = new JPanel();
    JTextField titleTextField = new JTextField();
    JLabel scoreLabel = new JLabel();
    public ClickerUI() {
        titleTextField.setText("Click!");
        titleTextField.setFocusable(false);
        titleTextField.setEditable(false);
        titleTextField.setBorder(null);
        titleTextField.setFont(new Font("Arial", Font.BOLD, 40));

        titlePanel.add(titleTextField);

        scoreLabel.setText("" + score);
        scoreLabel.setFocusable(false);
        scoreLabel.setBorder(null);
        scoreLabel.setFont(new Font("Arial", Font.BOLD, 40));

        scorePanel.setBounds(225,300,50,50);
        scorePanel.add(scoreLabel);

        gameButton.setBounds(150,500,200,75);
        gameButton.setText("Click me!");
        gameButton.setFocusable(false);
        gameButton.setBackground(Color.ORANGE);
        gameButton.setBorder(null);
        gameButton.addActionListener(this);

        gameFrame.add(gameButton);
        gameFrame.add(scorePanel);
        gameFrame.add(titlePanel);
        gameFrame.setSize(500,700);
        gameFrame.setLocationRelativeTo(null);
        gameFrame.setVisible(true);
        gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == gameButton) {
            score++;
            scoreLabel.setText(String.valueOf(score));
        }
    }
}
