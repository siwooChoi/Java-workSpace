package panels;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import interfaces.FramePanelSetting;
import main.makeCocktail;

public class gameOverPage extends JPanel implements FramePanelSetting{

	private JButton returnShowPage; 

	public gameOverPage(makeCocktail makeCocktailObj){
	
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		returnShowPage = new JButton(){
			ImageIcon i = new ImageIcon("img/InfoButton.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, SELECT_WIDTH, SELECT_HEIGHT, null);
			}
		};
		
		// Info��ư �̺�Ʈ ���
		returnShowPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Ŭ������ ��� �߻��ϴ� �̺�Ʈ�� cafeTimeŬ������ �޼��带 ���. Panel ����
//				makeCocktailObj.getCardLayout().show(makeCocktailObj.getContentPane(), "show");
	
			}
		});
		
		// Info��ư ũ�� & ��ġ, Panel�� Info��ư �߰�, �����ֱ�On
		returnShowPage.setBounds(400, 700, SELECT_WIDTH, SELECT_HEIGHT);
		add(returnShowPage);
		setVisible(true);
		

		
	
	}
	// ����̹��� ���
//	public void paint(Graphics g){
//		ImageIcon i;
//		g.drawImage(new ImageIcon("img/bg.jpg").getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, this);
//		
//		// �̹��� ������� ���� ��ư���� �Ⱥ��̴� ��찡 �߻��ϹǷ� repaint() ���ش�.
//
//		
//		
//		
//		
//	}
}