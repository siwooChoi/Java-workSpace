package panels;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import interfaces.FramePanelSetting;
import main.cafeTime;
import thread.playThread;

public class showPage extends JPanel implements FramePanelSetting{
	private JButton  infoBtn;
	private JButton  startBtn;
//	private cafeTime cafeTimeObj;
	
	
//	public showPage(){};
	public showPage(cafeTime cafeTimeObj){
	
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
		// Start버튼 생성 & 버튼이미지 추가
		startBtn = new JButton(){
			ImageIcon i = new ImageIcon("img/StartButton.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, SELECT_WIDTH, SELECT_HEIGHT, null);
			}
		};
		
		// Start버튼 이벤트 등록
		startBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				cafeTimeObj.getCardLayout().show(cafeTimeObj.getContentPane(), "play");
				cafeTimeObj.startThread(cafeTimeObj);
//				playThread playThread = new playThread();
//				Thread thread = new Thread(playThread);
//				thread.start();
			}
		});
		
		//Start버튼 크기 & 위치, Panel에 Start버튼 추가, 보여주기On
		startBtn.setBounds(100, 150, SELECT_WIDTH, SELECT_HEIGHT);
		add(startBtn);
		setVisible(true);
		
		// Info버튼 생성 & 버튼이미지 추가
		infoBtn = new JButton(){
			ImageIcon i = new ImageIcon("img/InfoButton.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, SELECT_WIDTH, SELECT_HEIGHT, null);
			}
		};
		
		// Info버튼 이벤트 등록
		infoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 클릭했을 경우 발생하는 이벤트로 cafeTime클래스의 메서드를 사용. Panel 변경
				cafeTimeObj.getCardLayout().show(cafeTimeObj.getContentPane(), "info");
			}
		});
		
		// Info버튼 크기 & 위치, Panel에 Info버튼 추가, 보여주기On
		infoBtn.setBounds(100, 260, SELECT_WIDTH, SELECT_HEIGHT);
		add(infoBtn);
		setVisible(true);
		
	}
	
		// 배경이미지 등록
//	public void paint(Graphics g){
//		g.drawImage(new ImageIcon("img/bg2.png").getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, this);
//		
//		// 이미지 입히기로 인해 버튼들이 안보이는 경우가 발생하므로 repaint() 해준다.
//		infoBtn.repaint();
//		startBtn.repaint();
//	}
	
}
