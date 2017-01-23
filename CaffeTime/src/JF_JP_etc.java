import javax.swing.*;

import java.awt.Font;
import java.awt.Graphics;
import java.util.ArrayList;

public class JF_JP_etc implements ComponentSize{
	
	
	//////	변수 //////
	public static int waterValue = 0;
	public static int coffeeValue = 0;
	public static int milkValue = 0;
	public static int syrupValue = 0;
	public static int caramelValue = 0;
	public static int steamValue = 0;
	public static int scoreValue = 0;
	public static String messageValue = "";
	public static int messageIndexCount = 0;
	public static int bombCount = 2;
	
	

	//////  JLabel //////
	public static JLabel score;
	public static JLabel nowWater;
	public static JLabel nowCoffee;
	public static JLabel nowMilk;
	public static JLabel nowSyrup;
	public static JLabel nowCaramel;
	public static JLabel nowSteam;
	public static JFrame frame;
	public static JLabel order1;
	public static JLabel order2;
	public static JLabel order3;
	public static JLabel order4;
	
	public static JLabel thisIsMessage;
	public static JLabel OrderOfWhatTime;
	public static JLabel message1;
	public static JLabel message2;
	public static JLabel message3;
	public static JLabel message4;
	public static JLabel message5;
	public static JLabel message6;
	public static JLabel BombCountNumber;
	
	private JLabel thisIsShowRecipe;
	private JLabel showRecipe_Americano1;
	private JLabel showRecipe_Americano2;
	private JLabel showRecipe_CafeLatte1;
	private JLabel showRecipe_CafeLatte2;
	private JLabel showRecipe_Espresso1;
	private JLabel showRecipe_Espresso2;
	private JLabel showRecipe_Caramel_Macchiato1;
	private JLabel showRecipe_Caramel_Macchiato2;
	private JLabel showRecipe_Cappuccino1;
	private JLabel showRecipe_Cappuccino2;
	
	
	

	
	public static JPanel panel;
	
	
	
	//////  JButton //////
	static JButton water;
	static JButton coffee;
	static JButton milk;
	static JButton syrup;
	static JButton caramel;
	static JButton steam;
	static JButton makeStart;
	static JButton makeReset;
	static JButton submit;
	static JButton StartButton;
	static JButton gOver;
	static JButton bomb;
	
	 

	Message message = new Message(new ArrayList());
	public JF_JP_etc() {
		
					//  FRAME_PANEL_WIDTH = 800;
					//  FRAME_PANEL_HEIGHT = 600;
		frame = new JFrame();
		
		panel = new JPanel(){ImageIcon i = new ImageIcon("img/bg3.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, FRAME_PANEL_WIDTH, FRAME_PANEL_HEIGHT, null);
		}
		};
		
		
		gOver = new JButton(){ImageIcon i = new ImageIcon("img/GameOver.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, FRAME_PANEL_WIDTH, FRAME_PANEL_HEIGHT, null);
		}
		};
		
		
		
		//   메인화면 전,  화면클릭하세요.  버튼
		StartButton = new JButton(){ImageIcon i = new ImageIcon("img/update_bg2.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, FRAME_PANEL_WIDTH, FRAME_PANEL_HEIGHT, null);
		}
		};
		StartButton.setBounds(0, 0, FRAME_PANEL_WIDTH, FRAME_PANEL_HEIGHT);
		frame.add(StartButton);
		StartButton.addActionListener(new Click_Events());
		
		
		panel.setBounds(0, 0, FRAME_PANEL_WIDTH, FRAME_PANEL_HEIGHT);
		panel.setLayout(null);
		
		
		
		frame.setLayout(null);
		frame.setBounds(200,70,FRAME_PANEL_WIDTH,FRAME_PANEL_HEIGHT);
		frame.setTitle("CaffeTime");
		frame.setResizable(false);								// 창 크기 변경 불가
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	// 창닫기 버튼으로 실행종료
		
		
		

//======================================================================================
//===========================  Label show레시피  관련   =========================================
		
					//    SHOW_RECIPE_LABEL_WIDTH = 350;
					//    SHOW_RECIPE_LABEL_HEIGHT = 350;
		
		thisIsShowRecipe = new JLabel("___________ Recipe ___________");
		thisIsShowRecipe.setFont(new Font("Dialog",Font.BOLD ,20));
		panel.add(thisIsShowRecipe);
		thisIsShowRecipe.setBounds(20, 80, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);	
		//////////////////////////////////////////////////////////////////////////
		/////////////////////////  아메리카노  //////////////////////////////////////
		showRecipe_Americano1 = new JLabel("Americano ");
		showRecipe_Americano1.setFont(new Font("Dialog",Font.BOLD ,20));
		panel.add(showRecipe_Americano1);
		showRecipe_Americano1.setBounds(20, 110, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);		
		
		showRecipe_Americano2 = new JLabel(":  Coffe 30  Water 80   (syrup 10)");
		showRecipe_Americano2.setFont(new Font("Dialog",Font.ITALIC, 16));
		panel.add(showRecipe_Americano2);
		showRecipe_Americano2.setBounds(15, 130, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);	
		//////////////////////////////////////////////////////////////////////////
		////////////////////////  카페 라떼   //////////////////////////////////
		showRecipe_CafeLatte1 = new JLabel("CafeLatte");
		showRecipe_CafeLatte1.setFont(new Font("Dialog",Font.BOLD ,20));
		panel.add(showRecipe_CafeLatte1);
		showRecipe_CafeLatte1.setBounds(20,160, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);		
		
		showRecipe_CafeLatte2 = new JLabel(":  Coffe 30  Milk 80");
		showRecipe_CafeLatte2.setFont(new Font("Dialog",Font.ITALIC, 16));
		panel.add(showRecipe_CafeLatte2);
		showRecipe_CafeLatte2.setBounds(15, 180, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);
		
		//////////////////////////////////////////////////////////////////////////
		/////////////////////////  에스프레소  /////////////////////////////////////
		showRecipe_Espresso1 = new JLabel("Espresso");
		showRecipe_Espresso1.setFont(new Font("Dialog",Font.BOLD ,20));
		panel.add(showRecipe_Espresso1);
		showRecipe_Espresso1.setBounds(20, 210, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);		
		
		showRecipe_Espresso2 = new JLabel(":  Coffe 70   (syrup 10)");
		showRecipe_Espresso2.setFont(new Font("Dialog",Font.ITALIC, 16));
		panel.add(showRecipe_Espresso2);
		showRecipe_Espresso2.setBounds(15, 230, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);
		
		///////////////////////////////////////////////////////////////////////////
		/////////////////////////  카_마끼아또  /////////////////////////////////////
		showRecipe_Caramel_Macchiato1 = new JLabel("Caramel Macchiato");
		showRecipe_Caramel_Macchiato1.setFont(new Font("Dialog",Font.BOLD ,20));
		panel.add(showRecipe_Caramel_Macchiato1);
		showRecipe_Caramel_Macchiato1.setBounds(20, 260, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);		
		
		showRecipe_Caramel_Macchiato2 = new JLabel(":  Coffee 30  Milk 70  Caramel 20  Steam 30 ");
		showRecipe_Caramel_Macchiato2.setFont(new Font("Dialog",Font.ITALIC, 16));
		panel.add(showRecipe_Caramel_Macchiato2);
		showRecipe_Caramel_Macchiato2.setBounds(15, 280, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);
		
		
		/////////////////////////////////////////////////////////////////////////////
		/////////////////////////  카푸치노  /////////////////////////////////////
		showRecipe_Cappuccino1 = new JLabel("Cappuccino");
		showRecipe_Cappuccino1.setFont(new Font("Dialog",Font.BOLD ,20));
		panel.add(showRecipe_Cappuccino1);
		showRecipe_Cappuccino1.setBounds(20, 310, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);		
		
		showRecipe_Cappuccino2 = new JLabel(":  Coffee 30  Milk 60  Steam 30 ");
		showRecipe_Cappuccino2.setFont(new Font("Dialog",Font.ITALIC, 16));
		panel.add(showRecipe_Cappuccino2);
		showRecipe_Cappuccino2.setBounds(15, 330, SHOW_RECIPE_LABEL_WIDTH, SHOW_RECIPE_LABEL_HEIGHT);
		
		
		
		
		
//================================================================================		
//===========================  메시지  관련   ===========================================
		
					//    MESSAGE_WIDTH = 600;
					//    MESSAGE_HEIGHT = 280;
		
		thisIsMessage = new JLabel("______________  MessageS  _______________");
		panel.add(thisIsMessage);
		thisIsMessage.setFont(new Font("Dialog",Font.BOLD ,  18));
		thisIsMessage.setBounds(360, 100, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		
		OrderOfWhatTime = new JLabel("OrderOfWhatTime");
		panel.add(OrderOfWhatTime);
		OrderOfWhatTime.setFont(new Font("Dialog",Font.BOLD|Font.ITALIC ,  17));
		OrderOfWhatTime.setBounds(450, 140, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		
		message1 = new JLabel();
		panel.add(message1);
		message1.setFont(new Font("Dialog",Font.BOLD ,  17));
		message1.setBounds(370, 180, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		
		message2 = new JLabel();
		panel.add(message2);
		message2.setFont(new Font("Dialog",Font.BOLD ,  17));
		message2.setBounds(370, 215, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		
		message3 = new JLabel();
		panel.add(message3);
		message3.setFont(new Font("Dialog",Font.BOLD ,  17));
		message3.setBounds(370, 250, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		
		message4 = new JLabel();
		panel.add(message4);
		message4.setFont(new Font("Dialog",Font.BOLD ,  17));
		message4.setBounds(370, 285, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		
		message5 = new JLabel();
		panel.add(message5);
		message5.setFont(new Font("Dialog",Font.BOLD ,  17));
		message5.setBounds(370, 320, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		
		message6 = new JLabel();
		panel.add(message6);
		message6.setFont(new Font("Dialog",Font.BOLD ,  17));
		message6.setBounds(370, 355, MESSAGE_WIDTH, MESSAGE_HEIGHT);
		
		
		
//================================================================================		
//===========================  Score     =========================================		
		
		score = new JLabel("" + scoreValue);
		score.setText("" + scoreValue);
		score.setFont(new Font("Dialog",Font.ITALIC, 30));
		panel.add(score);
		score.setBounds(720, 15, 100, 30);
		

//================================================================================
//========================= 현재 재료 값 ============================================
		
					//    NOW_LABEL_VALUES_WIDTH = 250;
					//    NOW_LABEL_VALUES_HEIGHT = 50;
		
		nowCoffee = new JLabel("Coffee : " + "0");
		panel.add(nowCoffee);
		nowCoffee.setBounds(10, 200, NOW_LABEL_VALUES_WIDTH, NOW_LABEL_VALUES_HEIGHT);
		
		nowWater = new JLabel("Water : " + "0");
		panel.add(nowWater);
		nowWater.setBounds(80, 200, NOW_LABEL_VALUES_WIDTH, NOW_LABEL_VALUES_HEIGHT);
		
		nowMilk = new JLabel("Milk : " + "0");
		panel.add(nowMilk);
		nowMilk.setBounds(150, 200, NOW_LABEL_VALUES_WIDTH, NOW_LABEL_VALUES_HEIGHT);
		
		nowSyrup = new JLabel("Syrup : " + "0");
		panel.add(nowSyrup);
		nowSyrup.setBounds(210, 200, NOW_LABEL_VALUES_WIDTH, NOW_LABEL_VALUES_HEIGHT);
		
		nowCaramel = new JLabel("Caramel : " + "0");
		panel.add(nowCaramel);
		nowCaramel.setBounds(280, 200, NOW_LABEL_VALUES_WIDTH, NOW_LABEL_VALUES_HEIGHT);
		
		nowSteam = new JLabel("Steam : " + "0");
		panel.add(nowSteam);
		nowSteam.setBounds(360, 200, NOW_LABEL_VALUES_WIDTH, NOW_LABEL_VALUES_HEIGHT);
		
//===============================================================================
//==========================  버튼 관련  =============================================		 
					//    BUTTON_WIDTH    100
					//    BUTTON_HEIGHT   50
		
				// Coffee 추가 버튼 
		coffee = new JButton(){ImageIcon i = new ImageIcon("img/Coffee.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, BUTTON_WIDTH, BUTTON_HEIGHT, null);
		}
		};
		coffee.setBounds(10, 30, BUTTON_WIDTH, BUTTON_HEIGHT);
		panel.add(coffee);
		coffee.addActionListener(new Click_Events());
		
				// Water 추가 버튼
		water = new JButton(){ImageIcon i = new ImageIcon("img/Water.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, BUTTON_WIDTH, BUTTON_HEIGHT, null);
		}
		};
		water.setBounds(120, 30, BUTTON_WIDTH, BUTTON_HEIGHT);
		panel.add(water);
		water.addActionListener(new Click_Events());
		
				// Milk 추가 버튼
		milk = new JButton(){ImageIcon i = new ImageIcon("img/Milk.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, BUTTON_WIDTH, BUTTON_HEIGHT, null);
		}
		};
		milk.setBounds(230, 30, BUTTON_WIDTH, BUTTON_HEIGHT);
		panel.add(milk);
		milk.addActionListener(new Click_Events());
		
				// Syrup 추가 버튼
		syrup = new JButton(){ImageIcon i = new ImageIcon("img/Syrup.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, BUTTON_WIDTH, BUTTON_HEIGHT, null);
		}
		};
		syrup.setBounds(340, 30, BUTTON_WIDTH, BUTTON_HEIGHT);
		panel.add(syrup);
		syrup.addActionListener(new Click_Events());
		
				// Caramel 추가 버튼
		caramel = new JButton(){ImageIcon i = new ImageIcon("img/Caramel.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, BUTTON_WIDTH, BUTTON_HEIGHT, null);
		}
		};
		caramel.setBounds(450, 30, BUTTON_WIDTH, BUTTON_HEIGHT);
		panel.add(caramel);
		caramel.addActionListener(new Click_Events());
		
		
				// steam 추가 버튼
		steam = new JButton(){ImageIcon i = new ImageIcon("img/steam3.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, BUTTON_WIDTH, BUTTON_HEIGHT, null);
		}
		};
		steam.setBounds(560, 30, BUTTON_WIDTH, BUTTON_HEIGHT);
		panel.add(steam);
		steam.addActionListener(new Click_Events());
		
		
				//  Submit 버튼
		makeStart = new JButton(){ImageIcon i = new ImageIcon("img/Submit.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, BUTTON_WIDTH, 80, null);
		}
		};
		makeStart.setBounds(170, 110, BUTTON_WIDTH, 80);
		panel.add(makeStart);
		makeStart.addActionListener(new submit());

		
				// Reset 버튼 
		makeReset = new JButton(){ImageIcon i = new ImageIcon("img/Reset.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, BUTTON_WIDTH, 80
					, null);
		}
		};
		makeReset.setBounds(50, 110, BUTTON_WIDTH, 80);
		panel.add(makeReset);
		makeReset.addActionListener(new me_makeReset());
		
		
		
				// Bomb  버튼
		bomb = new JButton(){ImageIcon i = new ImageIcon("img/bomb.png");	
		public void paintComponent(Graphics g) {
			g.drawImage(i.getImage(), 0, 0, 100, 100 
					, null);
		}
		};
		bomb.setBounds(390, 110, 100, 100);
		panel.add(bomb);
		//bomb.setText("2");
		bomb.addActionListener(new Click_Events());
				// Bomb 라벨
		BombCountNumber = new JLabel();
		BombCountNumber.setText("2");
		BombCountNumber.setBounds(480, 200, 30, 30);
		panel.add(BombCountNumber);
		
		
		
//===================================================================================
//========================== Label 주문 대기  ============================================
					//    ORDER_PRINT_LABEL_WIDTH = 250;
					//    ORDER_PRINT_LABEL_HEIGTH = 50;
		
			order1 = new JLabel("주문 대기중");
			panel.add(order1);
			order1.setBounds(500, 90, ORDER_PRINT_LABEL_WIDTH, ORDER_PRINT_LABEL_HEIGTH);
			
			order2 = new JLabel("주문 대기중");
			panel.add(order2);
			order2.setBounds(500, 120, ORDER_PRINT_LABEL_WIDTH, ORDER_PRINT_LABEL_HEIGTH);
			
			order3 = new JLabel("주문 대기중");
			panel.add(order3);
			order3.setBounds(500, 150, ORDER_PRINT_LABEL_WIDTH, ORDER_PRINT_LABEL_HEIGTH);
			
			order4 = new JLabel("주문 대기중");
			panel.add(order4);
			order4.setBounds(500, 180, ORDER_PRINT_LABEL_WIDTH, ORDER_PRINT_LABEL_HEIGTH);		
		
		
		frame.setVisible(true);
		
	}	
}
