import javax.swing.*;
import java.awt.*;

public class HeadPanel extends JPanel{
    final JLabel textField = new JLabel();

    HeadPanel(){

        this.setLayout(new BorderLayout());
        textField.setText("TIC TAC TOE");
        textField.setBackground(new Color(0x053742));
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setVerticalAlignment(JLabel.CENTER);
        textField.setFont(new Font("Helvetica" , Font.BOLD, 50));
        textField.setForeground(new Color(0x39A2DB));
        textField.setOpaque(true);
        this.setPreferredSize(new Dimension(100,100));
        this.add(textField);
        this.setVisible(true);

    }

}
