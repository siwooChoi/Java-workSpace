package panels;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import interfaces.FramePanelSetting;
import main.cafeTime;
import thread.playThread;

public class infoPage extends JPanel implements FramePanelSetting{
	private JButton startBtn;
//	private cafeTime  cafeTimeObj;
	
//	public infoPage(){};
	public infoPage(cafeTime cafeTimeObj){
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);

		// Start��ư ���� & ��ư�̹��� �߰�
		startBtn = new JButton(){
			ImageIcon i = new ImageIcon("img/StartButton.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, SELECT_WIDTH, SELECT_HEIGHT, null);
			}
		};
		
		//  Start��ư �̺�Ʈ ���
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cafeTimeObj.getCardLayout().show(cafeTimeObj.getContentPane(), "play");
				cafeTimeObj.startThread(cafeTimeObj);
//				playThread playThread = new playThread();
//				Thread thread = new Thread(playThread);
//				thread.start();
			}
		});
		
		// Start��ư ũ�� & ��ġ, Panel�� Start��ư �߰�, �����ֱ�On 
		startBtn.setBounds(280, 8, SELECT_WIDTH, SELECT_HEIGHT);
		add(startBtn);
		setVisible(true);
	}
	
		// ����̹��� ���
}
