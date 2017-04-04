package view;

import java.awt.Graphics;
import javax.swing.*;

public class Panels implements FramePanelSetting{

	Buttons buttons;
	JPanel  startPanel;
	
	
	public Panels(){
		System.out.println("Panels객체 생성자");
		this.buttons = new Buttons();
		
	}
	
	public void StartPanel(){
		this.startPanel = new JPanel(){
			ImageIcon i = new ImageIcon("img/bg2.png");
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, FRAME_PANEL_WIDTH, FRAME_PANEL_HEIGHT, null);
			}
		};
		
		System.out.println("스타트버튼 add");
		this.buttons.startButton();
		this.buttons.infoButton();
		this.startPanel.setLayout(null);
		this.buttons.startButton.setBounds(10, 10, 200, 80);
		this.startPanel.add(this.buttons.startButton);
		this.startPanel.add(this.buttons.infoButton);
		
	}
	
	
	
	
	
}
