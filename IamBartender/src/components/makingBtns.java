package components;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import interfaces.FramePanelSetting;

public class makingBtns extends JButton implements FramePanelSetting{
	private String imgName;
	private ImageIcon i;
	
	
	public makingBtns(String argImgName, int x, int y){
		this.i = new ImageIcon(argImgName);
		setBounds(x, y, MAKING_BTN_WIDTH, MAKING_BTN_HEIGHT);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(this.i.getImage(), 0, 0, MAKING_BTN_WIDTH, MAKING_BTN_HEIGHT, null);
	}

}
