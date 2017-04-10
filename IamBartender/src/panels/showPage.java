package panels;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import interfaces.FramePanelSetting;
import main.makeCocktail;
import thread.playThread;

public class showPage extends JPanel implements FramePanelSetting{
	private JButton  infoBtn;
	private JButton  startBtn;
//	private cafeTime cafeTimeObj;
	
	
//	public showPage(){};
	public showPage(makeCocktail cafeTimeObj){
	
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		// Start��ư ���� & ��ư�̹��� �߰�
		startBtn = new JButton(){
			ImageIcon i = new ImageIcon("img/StartButton.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, SELECT_WIDTH, SELECT_HEIGHT, null);
			}
		};
		
		// Start��ư �̺�Ʈ ���
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cafeTimeObj.getCardLayout().show(cafeTimeObj.getContentPane(), "play");
				cafeTimeObj.startThread(cafeTimeObj);
//				playThread playThread = new playThread();
//				Thread thread = new Thread(playThread);
//				thread.start();
			}
		});
		
		//Start��ư ũ�� & ��ġ, Panel�� Start��ư �߰�, �����ֱ�On
		startBtn.setBounds(100, 150, SELECT_WIDTH, SELECT_HEIGHT);
		add(startBtn);
		setVisible(true);
		
		// Info��ư ���� & ��ư�̹��� �߰�
		infoBtn = new JButton(){
			ImageIcon i = new ImageIcon("img/InfoButton.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, SELECT_WIDTH, SELECT_HEIGHT, null);
			}
		};
		
		// Info��ư �̺�Ʈ ���
		infoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// Ŭ������ ��� �߻��ϴ� �̺�Ʈ�� cafeTimeŬ������ �޼��带 ���. Panel ����
				cafeTimeObj.getCardLayout().show(cafeTimeObj.getContentPane(), "info");
			}
		});
		
		// Info��ư ũ�� & ��ġ, Panel�� Info��ư �߰�, �����ֱ�On
		infoBtn.setBounds(100, 260, SELECT_WIDTH, SELECT_HEIGHT);
		add(infoBtn);
		setVisible(true);
		
	}
	
		// ����̹��� ���
//	public void paint(Graphics g){
//		g.drawImage(new ImageIcon("img/bg2.png").getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, this);
//		
//		// �̹��� ������� ���� ��ư���� �Ⱥ��̴� ��찡 �߻��ϹǷ� repaint() ���ش�.
//		infoBtn.repaint();
//		startBtn.repaint();
//	}
	
}