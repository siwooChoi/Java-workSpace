package components;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JLabel;

public class valueLabels extends JLabel{
	
	public valueLabels(String LabelName, int value, int x, int y){
		this.setText(LabelName + " : " + value);
		setFont(new Font("Dialog",Font.BOLD ,20));
		setForeground(Color.WHITE);
		setBounds(x, y, 250, 20);
	}


}
