package components;

import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import interfaces.FramePanelSetting;

public class controlBtns  extends JButton implements FramePanelSetting{
	private String imgName;
	private ImageIcon i;
	
	public controlBtns(String argImgName, int x, int y){
		this.i = new ImageIcon(argImgName);
		setBounds(x, y, CONTROL_BTN_WIDTH, CONTROL_BTN_HEIGHT);
	}

	public void paintComponent(Graphics g) {
		g.drawImage(this.i.getImage(), 0, 0, CONTROL_BTN_WIDTH, CONTROL_BTN_HEIGHT, null);
	}
}
