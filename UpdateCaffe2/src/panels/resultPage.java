package panels;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import interfaces.FramePanelSetting;
import main.cafeTime;

public class resultPage extends JPanel implements FramePanelSetting{
	private cafeTime F;
	
	
//	public resultPage(){};
	public resultPage(cafeTime cafeTimeObj){
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
//		F = f;
		
		
	}
	// ����̹��� ���
	public void paint(Graphics g){
		ImageIcon i;
		g.drawImage(new ImageIcon("img/bg.jpg").getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, this);
		
		// �̹��� ������� ���� ��ư���� �Ⱥ��̴� ��찡 �߻��ϹǷ� repaint() ���ش�.
	}
}