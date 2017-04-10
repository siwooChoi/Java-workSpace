package components;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import interfaces.FramePanelSetting;

public class valueBtns extends JButton implements FramePanelSetting{
	private String imgName;
	private ImageIcon i;
	
	
	public valueBtns(String argImgName, int x, int y){
		this.i = new ImageIcon(argImgName);
		setBounds(x, y, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(this.i.getImage(), 0, 0, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT, null);
	}

}
