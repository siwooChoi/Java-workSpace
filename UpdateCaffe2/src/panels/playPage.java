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
		order1.setText("�ֹ� �����");
		order1.setFont(new Font("Dialog",Font.BOLD ,20));
		order1.setForeground(Color.WHITE);
		add(order1);
		
	
		
		///////////////////////////////////////////////////////////////////
		///////////////////     Buttons         ////////////////////////////
		
		//////	  ��� ��ư		new valueBtns("�̹����̸�", x��ǥ, y��ǥ);	  //////
		// 
		
		// Ŀ�� �� �ø��� ��ư
		coffeeBtn = new valueBtns("img/Coffee.png", 20, 120);
		add(coffeeBtn);
		
		coffeeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				coffeeValue = coffeeValue + 10;
				coffeeLab.setText("Coffee" + " : " + coffeeValue);
			}
		});
		
		// �� ��  �ø��� ��ư
		waterBtn = new valueBtns("img/Water.png", 125, 120);
		add(waterBtn);
		
		waterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				waterValue = waterValue + 10;
				waterLab.setText("Water " + " : " + waterValue);
			}
		});
		
		
		
		// ���� �� �ø��� ��ư
		
		// �÷� �� �ø��� ��ư
		
		// ī��� �� �ø��� ��ư
		
		// ���� �� �ø��� ��ư
		
		
		//////		��Ʈ�� ��ư	 new controlBtns("�̹����̸�", x��ǥ, y��ǥ);	//////
		// 
		
		
		// ���� ��ư
		submitBtn = new controlBtns("img/Submit.png", 200, 270);
		add(submitBtn);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println("submit��ư Ŭ��");
			}
		});
		
		// �� ���Ź�ư
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
		
		
		// coffee��ư ���� & ��ư�̹��� �߰�
//		coffeeBtn = new JButton(){
//					ImageIcon i = new ImageIcon("img/Coffee.png");	
//					public void paintComponent(Graphics g) {
//						g.drawImage(i.getImage(), 0, 0, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT, null);
//					}
//				};
//				
//				// coffee��ư �̺�Ʈ ���
//				coffeeBtn.addActionListener(new ActionListener() {
//					public void actionPerformed(ActionEvent arg0) {
//						System.out.println("Ŭ�� Ŀ�ǹ�ư");
//						System.out.println(waterValue);
//						coffeeValue = coffeeValue + 50;
//						coffeeLab.setText("Coffee" + " : " + coffeeValue+"");
//					}
//				});
//				
//				//coffee��ư ũ�� & ��ġ, Panel�� Start��ư �߰�, �����ֱ�On
//				coffeeBtn.setBounds(100, 150, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT);
//				add(coffeeBtn);
				
				
		// water��ư ���� & ��ư�̹��� �߰�
//		waterBtn = new JButton(){
//				ImageIcon i = new ImageIcon("img/Water.png");	
//				public void paintComponent(Graphics g) {
//					g.drawImage(i.getImage(), 0, 0, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT, null);
//				}
//			};
//		
//		// water��ư �̺�Ʈ ���
//			waterBtn.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent arg0) {
//				
//			}
//		});
//		
//		//water��ư ũ�� & ��ġ, Panel�� Start��ư �߰�, �����ֱ�On
//			waterBtn.setBounds(200, 150, VALUE_BTN_WIDTH, VALUE_BTN_HEIGHT);
//		add(waterBtn);
		
		//////////
		setVisible(true);
	}
	
	public void getTest(){
		this.coffeeData.coffeeDataOfM();
	}
	
	public void Timeset(int time){
//		timeLab.setText(time + "�� ���� ����");
		timeLab.setText("(" + time + "�� �Ŀ� �ֹ��� ���ɴϴ�.)");
//		System.out.println("...");
	}
	


//	public void startThread(){
//		this.playThread = new playThread();
//		this.thread = new Thread(playThread);
//		thread.start();
//	}
	


	
		// ����̹��� ���
//	public void paint(Graphics g){
//		g.drawImage(new ImageIcon("img/bg3.png").getImage(), 0, 0, PANEL_WIDTH, PANEL_HEIGHT, this);
//		
//		// �̹��� ������� ���� ��ư���� �Ⱥ��̴� ��찡 �߻��ϹǷ� repaint() ���ش�.
//		coffeeBtn.repaint();
//		waterBtn.repaint();
//		coffeeLab.repaint();
//	}
}