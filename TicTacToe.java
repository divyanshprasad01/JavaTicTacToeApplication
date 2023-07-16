import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TicTacToe extends JPanel implements ActionListener {

    JButton[] button = new JButton[9];
    volatile HeadPanel headPanel;
    boolean playerOne = false;

    int countPlayerO = 1, countPlayerX = 1;

    TicTacToe(HeadPanel headPanel) {
        this.headPanel = headPanel;

        this.setLayout(new GridLayout(3, 3));
        this.setBackground(new Color(0x39A2DB));

        for (int i = 0; i < 9; i++) {
            button[i] = new JButton();
            this.add(button[i]);
            button[i].setFocusable(false);
            button[i].setBackground(new Color(0x053742));
            button[i].addActionListener(this);
        }

        new Thread(() -> {
            try {
                Thread.sleep(2000);
                headPanel.textField.setText("Player X Turn");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();


    }


    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 9; i++) {
            if (e.getSource() == button[i]) {
                if (playerOne) {
                    if (button[i].getText().equals("")) {
                        button[i].setText("O");
                        button[i].setForeground(new Color(0x39A2DB));
                        button[i].setFont(new Font("Helvetica", Font.BOLD, 50));
                        countPlayerO++;
                        if (countPlayerO >= 3) {
                            if(checkIfWinner()){
                                break;
                            }
                        }
                        playerOne = false;
                        headPanel.textField.setText("Player X Turn");
                    } else {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                headPanel.textField.setText("This Place Is Already Taken!!");
                                try {
                                    Thread.sleep(1000);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                                headPanel.textField.setText("Player O Turn");
                            }
                        }).start();
                    }
                } else {
                    if (button[i].getText().equals("")) {
                        button[i].setText("X");
                        button[i].setForeground(new Color(0x39A2DB));
                        button[i].setFont(new Font("Helvetica", Font.BOLD, 50));
                        countPlayerX++;
                        if (countPlayerX >= 3) {
                            if(checkIfWinner()){
                                break;
                            }
                        }
                        playerOne = true;
                        headPanel.textField.setText("Player O Turn");
                    } else {
                        new Thread(new Runnable() {
                            @Override
                            public void run() {
                                headPanel.textField.setText("This Place Is Already Taken!!");
                                try {
                                    Thread.sleep(1000);
                                } catch (Exception ex) {
                                    ex.printStackTrace();
                                }
                                headPanel.textField.setText("Player X Turn");
                            }
                        }).start();
                    }
                }
            }
        }


    }

    public boolean checkIfWinner() {

        if (!playerOne) {
            if (button[0].getText().equals("X") && button[1].getText().equals("X") && button[2].getText().equals("X")) {

                button[0].setBackground(new Color(0xA2DBFA));
                button[1].setBackground(new Color(0xA2DBFA));
                button[2].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player X has Won.");
                return true;

            } else if (button[3].getText().equals("X") && button[4].getText().equals("X") && button[5].getText().equals("X")) {
                button[3].setBackground(new Color(0xA2DBFA));
                button[4].setBackground(new Color(0xA2DBFA));
                button[5].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player X has Won.");
                return true;
            } else if (button[6].getText().equals("X") && button[7].getText().equals("X") && button[8].getText().equals("X")) {
                button[6].setBackground(new Color(0xA2DBFA));
                button[7].setBackground(new Color(0xA2DBFA));
                button[8].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player X has Won.");
                return true;
            } else if (button[0].getText().equals("X") && button[3].getText().equals("X") && button[6].getText().equals("X")) {
                button[0].setBackground(new Color(0xA2DBFA));
                button[3].setBackground(new Color(0xA2DBFA));
                button[6].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player X has Won.");
                return true;
            } else if (button[1].getText().equals("X") && button[4].getText().equals("X") && button[7].getText().equals("X")) {
                button[1].setBackground(new Color(0xA2DBFA));
                button[4].setBackground(new Color(0xA2DBFA));
                button[7].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player X has Won.");
                return true;
            } else if (button[2].getText().equals("X") && button[5].getText().equals("X") && button[8].getText().equals("X")) {
                button[2].setBackground(new Color(0xA2DBFA));
                button[5].setBackground(new Color(0xA2DBFA));
                button[8].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player X has Won.");
                return true;
            } else if (button[0].getText().equals("X") && button[4].getText().equals("X") && button[8].getText().equals("X")) {
                button[0].setBackground(new Color(0xA2DBFA));
                button[4].setBackground(new Color(0xA2DBFA));
                button[8].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player X has Won.");
                return true;
            } else if (button[2].getText().equals("X") && button[4].getText().equals("X") && button[6].getText().equals("X")) {
                button[2].setBackground(new Color(0xA2DBFA));
                button[4].setBackground(new Color(0xA2DBFA));
                button[6].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player X has Won.");
                return true;
            }else{
                return false;
            }
            
        } else {

            if (button[0].getText().equals("O") && button[1].getText().equals("O") && button[2].getText().equals("O")) {

                button[0].setBackground(new Color(0xA2DBFA));
                button[1].setBackground(new Color(0xA2DBFA));
                button[2].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player O has Won.");
                return true;
            } else if (button[3].getText().equals("O") && button[4].getText().equals("O") && button[5].getText().equals("O")) {
                button[3].setBackground(new Color(0xA2DBFA));
                button[4].setBackground(new Color(0xA2DBFA));
                button[5].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player O has Won.");
                return true;
            } else if (button[6].getText().equals("O") && button[7].getText().equals("O") && button[8].getText().equals("O")) {
                button[6].setBackground(new Color(0xA2DBFA));
                button[7].setBackground(new Color(0xA2DBFA));
                button[8].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player O has Won.");
                return true;
            } else if (button[0].getText().equals("O") && button[3].getText().equals("O") && button[6].getText().equals("O")) {
                button[0].setBackground(new Color(0xA2DBFA));
                button[3].setBackground(new Color(0xA2DBFA));
                button[6].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player O has Won.");
                return true;
            } else if (button[1].getText().equals("O") && button[4].getText().equals("O") && button[7].getText().equals("O")) {
                button[1].setBackground(new Color(0xA2DBFA));
                button[4].setBackground(new Color(0xA2DBFA));
                button[7].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player O has Won.");
                return true;
            } else if (button[2].getText().equals("O") && button[5].getText().equals("O") && button[8].getText().equals("O")) {
                button[2].setBackground(new Color(0xA2DBFA));
                button[5].setBackground(new Color(0xA2DBFA));
                button[8].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player O has Won.");
                return true;
            } else if (button[0].getText().equals("O") && button[4].getText().equals("O") && button[8].getText().equals("O")) {
                button[0].setBackground(new Color(0xA2DBFA));
                button[4].setBackground(new Color(0xA2DBFA));
                button[8].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player O has Won.");
                return true;
            } else if (button[2].getText().equals("O") && button[4].getText().equals("O") && button[6].getText().equals("O")) {
                button[2].setBackground(new Color(0xA2DBFA));
                button[4].setBackground(new Color(0xA2DBFA));
                button[6].setBackground(new Color(0xA2DBFA));
                headPanel.textField.setFont(new Font("Helvetica" , Font.BOLD,30));
                headPanel.textField.setText("Congratulations!! Player O has Won.");
                return true;
            }else{
                return false;
            }

        }
        
    }


}
