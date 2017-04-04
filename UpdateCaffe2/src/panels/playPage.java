package panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import coffeeValues.coffeeData;
import components.valueLabels;
import components.controlBtns;
import components.valueBtns;
import interfaces.FramePanelSetting;
import main.cafeTime;
import thread.playThread;

public class playPage extends JPanel implements FramePanelSetting{
	
//	private cafeTime cafeTimeObj;
	
	public JLabel timeLab, order1, order2, order3, order4;
	
	protected String[] Type = {"Coffee", "Water", "Milk", "Syrup", "Caramel", "Steam"};
	
	protected int     coffeeValue = 0, waterValue = 0, milkValue = 0, syrupValue = 0, 
					 caramelValue = 0, steamValue = 0, scoreValue = 0, timeValue = 0,
					 moneyValue = 0, testValue = 0;
//	private JButton  coffeeBtn, waterBtn, milkBtn, syrupBtn, caramelBtn,
//	                 steamBtn, submitBtn, dropBtn, testBtn;
//	private JLabel   coffeeLab, waterLab, milkLab, syrupLab, caramelLab,
//    				 steamLab, scoreLab, timeLab, moneyLab;
	private Thread		thread;
	private playThread	playThread;
	
	
	private valueLabels   coffeeLab, waterLab, milkLab, syrupLab, caramelLab,
	 				 steamLab, scoreLab, moneyLab;
	

	
	private valueBtns   coffeeBtn, waterBtn, milkBtn, syrupBtn, caramelBtn, steamBtn;
	private controlBtns submitBtn, resetBtn, testBtn;
	protected coffeeData coffeeData;
	
	protected ArrayList order;
	
	
	

	
	public playPage(cafeTime cafeTimeObj){
		
		
		
		super();
		
		setSize(PANEL_WIDTH, PANEL_HEIGHT);
		setLayout(null);
		
//		F = f;
//		coffeeData = new coffeeData();
		
		
		
//		coffeeLab = new JLabel();
//		coffeeLab.setText("coffee : " + coffeeValue);
//		coffeeLab.setFont(new Font("Dialog",Font.BOLD ,20));
//		coffeeLab.setForeground(Color.WHITE);
//		coffeeLab.setBounds(30, 17, 150, 20);
//		add(coffeeLab);
		
		
		
		///////////////////////////////////////////////////////////////////
		///////////////////     Labels         ////////////////////////////
		// Labels(LabelName, Value, position X, position Y);
		coffeeLab = new valueLabels("Coffee", coffeeValue, 30, 25);
		add(coffeeLab);
		
		waterLab  = new valueLabels("Water ", waterValue, 30, 60);
		add(waterLab);
		
		timeLab  = new JLabel();
		timeLab.setBounds(250, 50, 400, 50);
		timeLab.setText("timeLab Test");
		timeLab.setFont(new Font("Dialog",Font.BOLD ,20));
		timeLab.setForeground(Color.WHITE);
		add(timeLab);
		
		order1 = new JLabel();
		order1.setBounds(250, 50, 400, 300);
		order1.setText("주문 대기중");
		order1.setFont(new Font("Dialog",Font.BOLD ,20));
		order1.setForeground(Color.WHITE);
		add(order1);
		
	
		
		///////////////////////////////////////////////////////////////////
		///////////////////     Buttons         ////////////////////////////
		
		//////	  재료 버튼		new valueBtns("이미지이름", x좌표, y좌표);	  //////
		// 
		
		// 커피 값 올리는 버튼
		coffeeBtn = new valueBtns("img/Coffee.png", 20, 120);
		add(coffeeBtn);
		
		coffeeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coffeeValue = coffeeValue + 10;
				coffeeLab.setText("Coffee" + " : " + coffeeValue);
			}
		});
		
		// 물 값  올리는 버튼
		waterBtn = new valueBtns("img/Water.png", 125, 120);
		add(waterBtn);
		
		waterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				waterValue = waterValue + 10;
				waterLab.setText("Water " + " : " + waterValue);
			}
		});
		
		
		
		// 우유 값 올리는 버튼
		
		// 시럽 값 올리는 버튼
		
		// 카라멜 값 올리는 버튼
		
		// 스팀 값 올리는 버튼
		
		
		//////		컨트롤 버튼	 new controlBtns("이미지이름", x좌표, y좌표);	//////
		// 
		
		
		// 제출 버튼
		submitBtn = new controlBtns("img/Submit.png", 200, 270);
		add(submitBtn);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("submit버튼 클릭");
			}
		});
		
		// 값 제거버튼
		resetBtn = new controlBtns("img/Reset.png", 350, 270);
		add(resetBtn);
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coffeeValue = 0; waterValue = 0; milkValue = 0; syrupValue = 0; 
				caramelValue = 0; steamValue = 0;
				
				coffeeLab.setText("Coffee" + " : " + coffeeValue);
				waterLab.setText("Water " + " : " + waterValue);
//				milkLab.setText(" Milk  " + " : " + milkValue);
//				syrupLab.setText("Syrup " + " : " + syrupValue);
//				caramelLab.setText("Caramel" + " : " + caramelValue);
//				steamLab.setText("Steam " + " : " + steamValue);
			}
		});
		
//		
		
		
		
		
		
//		test1.setBounds(100, 350, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT);
		
		
		// coffee버튼 생성 & 버튼이미지 추가
//		coffeeBtn = new JButton(){
//					ImageIcon i = new ImageIcon("img/Coffee.png");	
//					public void paintComponent(Graphics g) {
//						g.drawImage(i.getImage(), 0, 0, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT, null);
//					}
//				};
//				
//				// coffee버튼 이벤트 등록
//				coffeeBtn.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent arg0) {
//						System.out.println("클릭 커피버튼");
//						System.out.println(waterValue);
//						coffeeValue = coffeeValue + 50;
//						coffeeLab.setText("Coffee" + " : " + coffeeValue+"");
//					}
//				});
//				
//				//coffee버튼 크기 & 위치, Panel에 Start버튼 추가, 보여주기On
//				coffeeBtn.setBounds(100, 150, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT);
//				add(coffeeBtn);
				
				
		// water버튼 생성 & 버튼이미지 추가
//		waterBtn = new JButton(){
//				ImageIcon i = new ImageIcon("img/Water.png");	
//				public void paintComponent(Graphics g) {
//					g.drawImage(i.getImage(), 0, 0, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT, null);
//				}
//			};
//		
//		// water버튼 이벤트 등록
//			waterBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				
//			}
//		});
//		
//		//water버튼 크기 & 위치, Panel에 Start버튼 추가, 보여주기On
//			waterBtn.setBounds(200, 150, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT);
//		add(waterBtn);
		
		//////////
		setVisible(true);
	}
	
	public void getTest(){
		this.coffeeData.coffeeDataOfM();
	}
	
	public void Timeset(int time){
//		timeLab.setText(time + "로 변경 성공");
		timeLab.setText("(" + time + "초 후에 주문이 들어옵니다.)");
//		System.out.println("...");
	}
	


//	public void startThread(){
//		this.playThread = new playThread();
//		this.thread = new Thread(playThread);
//		thread.start();
//	}
	


	
		// 배경이미지 등록
//	public void paint(Graphics g){
//		g.drawImage(new ImageIcon("img/bg3.png").getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, this);
//		
//		// 이미지 입히기로 인해 버튼들이 안보이는 경우가 발생하므로 repaint() 해준다.
//		coffeeBtn.repaint();
//		waterBtn.repaint();
//		coffeeLab.repaint();
//	}
}
