package view;

import java.awt.Graphics;

import javax.swing.*;

public class View implements FramePanelSetting {

	JFrame frame;
	Panels panel;
	
	// 생성자, 기본프레임 생성  / (J) コンストラクタで　ベースframeを　作る。
	public View(){
		System.out.println("View객체 생성자");
		this.frame = new JFrame();
		this.panel = new Panels();
	}
	
	public void start(){
		this.frame.setTitle("CaffeTime ver.2");
		this.frame.setSize(FRAME_PANEL_WIDTH, FRAME_PANEL_HEIGHT);
		this.frame.setResizable(false);
		
			// 창닫기 버튼으로 실행종료 / (J) closeで　プロセスを終了させる
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	
		this.panel.StartPanel();
		this.frame.add(this.panel.startPanel);
		
		
		this.frame.setVisible(true);
	}
	
}
