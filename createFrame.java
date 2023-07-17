import javax.swing.*;
import java.awt.*;

public class createFrame extends JFrame {

    final HeadPanel headPanel = new HeadPanel();
    final TicTacToe tictactoe = new TicTacToe(headPanel);

    createFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x39A2DB));
        this.setLayout(new BorderLayout());
        this.setBounds(350, 0, 800, 800);
        this.setTitle("Tic Tac Toe");

        this.add(headPanel, BorderLayout.SOUTH);
        this.add(tictactoe);

        ImageIcon icon = new ImageIcon("TicTacToeIcon.png");
        this.setIconImage(icon.getImage());

        this.setVisible(true);
    }

}
