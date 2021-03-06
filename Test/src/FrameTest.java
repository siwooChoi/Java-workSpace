import java.awt.CardLayout;

import javax.swing.JFrame;

public class FrameTest extends JFrame{
    private CardLayout cards = new CardLayout();
     
    public FrameTest() {
        setSize(330, 100);
        getContentPane().setLayout(cards);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
         
        getContentPane().add("One", new P_One(this));
        getContentPane().add("Two", new P_Two(this));
         
        setVisible(true);
    }
     
    public void changePanel() {
        cards.next(this.getContentPane());
    }
}

