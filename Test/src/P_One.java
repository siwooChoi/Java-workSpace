import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class P_One extends JPanel {
    private JLabel lblNewLabel;
    private JButton btnNewButton;
    private FrameTest F;
     
    public P_One(FrameTest f) {
        setBackground(Color.LIGHT_GRAY);
        setSize(330, 80);
        setLayout(null);
         
        F = f;
         
        lblNewLabel = new JLabel("Panel One");
        lblNewLabel.setBounds(12, 10, 59, 15);
        add(lblNewLabel);
         
        btnNewButton = new JButton("Change Panel");
        btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                F.changePanel();
            }
        });
        btnNewButton.setBounds(12, 35, 113, 23);
        add(btnNewButton);
 
        setVisible(true);
    }
}


