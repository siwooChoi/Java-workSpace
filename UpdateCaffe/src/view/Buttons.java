package view;

import java.awt.Graphics;

import javax.swing.*;

public class Buttons implements FramePanelSetting {
	JButton startButton;
	JButton infoButton;
	
	public Buttons(){
		System.out.println("Buttons객체 생성자");
	}
	
	public void startButton(){
		System.out.println("startButton버튼 객체 만들었음");
		this.startButton = new JButton(){
			ImageIcon i = new ImageIcon("img/StartButton.png");	
		
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, START_INFO_WIDTH, START_INFO_HEIGHT, null);
			}
		};
		
		this.startButton.addActionListener(new actions.StartEvent());
		
	}
	
	public void infoButton(){
		System.out.println("ifoButton객체 만들었음");
		
		this.infoButton= new JButton(){
			ImageIcon i = new ImageIcon("img/InfoButton.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, START_INFO_WIDTH, START_INFO_HEIGHT, null);
			}
		};
		this.startButton.addActionListener(new actions.InfoEvent());
	}
}
