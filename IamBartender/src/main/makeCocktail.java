package main;

import java.awt.CardLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import cocktailValues.cocktailData;
import interfaces.FramePanelSetting;
import panels.infoPage;
import panels.playPage;
import panels.resultPage;
import panels.showPage;
import thread.playThread;

public class makeCocktail extends JFrame implements FramePanelSetting{
	

	private CardLayout cards = new CardLayout();
	private playThread playThreadObj;
	private Thread thread;
	
	private playPage playPageObj;
	private cocktailData cocktailDataObj = new cocktailData(this);
	
	
	
//	private coffeeData ame = new americano();
	
	
//	private JFrame jFrame;
//	public JLabel timeLab;
//	public gameManager player = new gameManager();
	
	public makeCocktail(){
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
		
		getContentPane().add("show", new showPage(this){ImageIcon i = new ImageIcon("img/BarBg2.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);
			}
		});
		
		getContentPane().add("info", new infoPage(this){ImageIcon i = new ImageIcon("img/bg5.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);
			}
		});
		////
		getContentPane().add("play", playPageObj = new playPage(this){ImageIcon i = new ImageIcon("img/BarBg3.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);

			}
		});
		/////
		getContentPane().add("result", new resultPage(this){ImageIcon i = new ImageIcon("img/bg6.jpg");	
			public void paintComponent(Graphics g) {
				g.drawImage(i.getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, null);
			}
		});
		
		
		
		setVisible(true);
	}
	
	
	
	public CardLayout getCardLayout(){
		return cards;
	}
	
	public void startThread(makeCocktail makeCocktailObj){
		playThreadObj = new playThread(makeCocktailObj);
		playThreadObj.setThreadFlag(true);
		thread = new Thread(playThreadObj);
		thread.start();
	
	}
	
	public playPage getPlayPageObj(){
		return this.playPageObj;
	}
	
	public cocktailData getCocktailDataObj(){
		return this.cocktailDataObj;
	}
	
	public playThread getPlayThread(){
		return this.playThreadObj;
	}
	
	public void stopThread(){
		
	}
	
	public void testPrintOfMakeCocktailObj(){
		System.out.println("����ũĬ���� ��ü�� �ִ� �޼���");
	}
	
	
}