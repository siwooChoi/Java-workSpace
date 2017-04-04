package main;

import java.awt.CardLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import coffeeValues.coffeeData;
import interfaces.FramePanelSetting;
import panels.infoPage;
import panels.playPage;
import panels.resultPage;
import panels.showPage;
import thread.playThread;

public class cafeTime extends gameManager implements FramePanelSetting{
	
//	public gameManager player = new gameManager();
	private CardLayout cards = new CardLayout();
	private JFrame jFrame;
	private playThread playThread;
	private Thread thread;
	public JLabel timeLab;
	public playPage playPage;
	public cafeTime(){
		
		
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		getContentPane().setLayout(cards);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		
		
		
		// ���� ó�� add�� Page�� ùȭ������ ����ȴ�.
		
		/////////// Ȯ���ϱ� ���ϰ� �ϱ� ���ؼ� �ӽ÷� play�� ���� ������ �ξ���.
//		getContentPane().add("play", new playPage(this){ImageIcon i = new ImageIcon("img/bg3.png");	
//			public void paintComponent(Graphics g) {
//				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);
//			}
//		});
		///////////
		
		getContentPane().add("show", new showPage(this){ImageIcon i = new ImageIcon("img/bg2.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);
			}
		});
		
		getContentPane().add("info", new infoPage(this){ImageIcon i = new ImageIcon("img/bg3.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);
			}
		});
		////
		getContentPane().add("play", playPage = new playPage(this){ImageIcon i = new ImageIcon("img/bg3.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);

			}
		});
		/////
		getContentPane().add("result", new resultPage(this){ImageIcon i = new ImageIcon("img/bg3.png");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);
			}
		});
		
		
		
		setVisible(true);
	}
	
	
	
	public CardLayout getCardLayout(){
		return cards;
	}
	
	public void startThread(cafeTime cafeTimeObj){
		playThread = new playThread(cafeTimeObj);
		thread = new Thread(playThread);
		thread.start();
	}
	
	public playPage getPlayPage(){
		return this.playPage;
	}
}