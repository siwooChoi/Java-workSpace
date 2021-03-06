package main;

import java.awt.CardLayout;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

import cocktailValues.cocktailData;
import interfaces.FramePanelSetting;
import panels.infoPage;
import panels.playPage;
import panels.gameOverPage;
import panels.showPage;
import thread.playThread;

public class makeCocktail extends JFrame implements FramePanelSetting{
	

	private CardLayout cards = new CardLayout();
	private playThread playThreadObj;
	private Thread thread;
	
	
	private playPage playPageObj;
	private cocktailData cocktailDataObj = new cocktailData(this);
	
	private int lastScore;
	
//	private coffeeData ame = new americano();
	
	
//	private JFrame jFrame;
//	public JLabel timeLab;
//	public gameManager player = new gameManager();
	
	public makeCocktail(){
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		getContentPane().setLayout(cards);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
	
		
		
		
		// 가장 처음 add한 Page가 첫화면으 로 실행된다.
		
		/////////// 확인하기 편하게 하기 위해서 임시로 play를 제일 앞으로 두었음.
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
		getContentPane().add("gameOver", new gameOverPage(this){ImageIcon i = new ImageIcon("img/bg6.jpg");	
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
//		if(playThreadObj == null){
			playThreadObj = new playThread(makeCocktailObj);
			playThreadObj.setThreadFlag(true);
			thread = new Thread(playThreadObj);
			getPlayPageObj().resetScore();
			thread.start();
//		} else{
//			System.out.println("스레드 이미 있다");
//			
//			playThreadObj.setThreadFlag(true);
//		}
		
		
	
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
		playThreadObj.setThreadFlag(false);
		getCardLayout().show(getContentPane(), "gameOver");
	}
	
	public void testPrintOfMakeCocktailObj(){
		System.out.println("메이크칵테일 객체에 있는 메서드");
	}
	

	
	
}
