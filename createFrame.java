import javax.swing.*;
import java.awt.*;

public class createFrame extends JFrame {

    HeadPanel headPanel = new HeadPanel();
    TicTacToe tictactoe = new TicTacToe(headPanel);

    createFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(0x39A2DB));
        this.setLayout(new BorderLayout());
        this.setBounds(350, 0, 800, 800);
        this.setTitle("Tic Tac Toe");

        this.add(headPanel, BorderLayout.SOUTH);
        this.add(tictactoe);

        this.setVisible(true);
    }

}
