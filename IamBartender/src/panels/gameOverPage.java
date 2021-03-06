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
		
		// Info버튼 이벤트 등록
		returnShowPage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				// 클릭했을 경우 발생하는 이벤트로 cafeTime클래스의 메서드를 사용. Panel 변경
//				makeCocktailObj.getCardLayout().show(makeCocktailObj.getContentPane(), "show");
	
			}
		});
		
		// Info버튼 크기 & 위치, Panel에 Info버튼 추가, 보여주기On
		returnShowPage.setBounds(400, 700, SELECT_WIDTH, SELECT_HEIGHT);
		add(returnShowPage);
		setVisible(true);
		

		
	
	}
	// 배경이미지 등록
//	public void paint(Graphics g){
//		ImageIcon i;
//		g.drawImage(new ImageIcon("img/bg.jpg").getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, this);
//		
//		// 이미지 입히기로 인해 버튼들이 안보이는 경우가 발생하므로 repaint() 해준다.
//
//		
//		
//		
//		
//	}
}
