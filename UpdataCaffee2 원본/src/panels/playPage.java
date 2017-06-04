package panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import coffeeValues.coffeeData;
import components.controlBtns;
import components.valueBtns;
import components.valueLabels;
import interfaces.FramePanelSetting;
import main.cafeTime;

public class playPage extends JPanel implements FramePanelSetting{
	
//	private cafeTime cafeTimeObj;
	
	private JLabel timeLab, orderLabel, order1, order2, order3, order4, order5, order6, order7, order8, orderRecipeTitle, orderRecipe, test;
	private JLabel labels[];
	// �� ���� �� ����
	private int     coffeeValue = 0, waterValue = 0, milkValue = 0, syrupValue = 0, 
			 caramelValue = 0, steamValue = 0, scoreValue = 0, timeValue = 0,
			 moneyValue = 0, testValue = 0;
	
	protected String[] Type = {"Coffee", "Water", "Milk", "Syrup", "Caramel", "Steam"};
	
	private String[] coffeeStringArray 	= {Type[0], coffeeValue+""};
	private String[] waterStringArray 	= {Type[1], waterValue+""};
	private String[] milkStringArray 	= {Type[2], milkValue+""};
	private String[] syrupStringArray 	= {Type[3], syrupValue+""};
	private String[] caramelStringArray = {Type[4], caramelValue+""};
	private String[] steamStringArray 	= {Type[5], steamValue+""};

	private valueLabels   coffeeLab, waterLab, milkLab, syrupLab, caramelLab,
	 				 	  steamLab, scoreLab, moneyLab;
	
	private valueBtns   coffeeBtn, waterBtn, milkBtn, syrupBtn, caramelBtn, steamBtn;
	private controlBtns submitBtn, resetBtn, testBtn;
	
	private coffeeData coffeeDataObj;
	
	protected ArrayList orderList = new ArrayList();
	
	private ArrayList menuList;
	private ArrayList makingResult;
	private coffeeData nowOrderData;
	private String[] StringMakingResult;
	
	
	
	private cafeTime cafeTimeObj;

	
	
	
	public playPage(cafeTime cafeTimeObj){
		super();
		this.cafeTimeObj = cafeTimeObj;
		this.coffeeDataObj = cafeTimeObj.getCoffeeDataObj();
		this.labels = new JLabel[8];
//		this.makingResult = new ArrayList();
		
//		this.coffeeDataObj = new coffeeData();
		
//		this.coffeeDataObj = cafeTimeObj.getCoffeeDataObj();
		
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
		
		milkLab  = new valueLabels("Milk ", milkValue, 160, 25);
		add(milkLab);
		
		syrupLab  = new valueLabels("Syrup ", syrupValue, 160, 60);
		add(syrupLab);
		
		caramelLab  = new valueLabels("Caramel ", caramelValue, 290, 25);
		add(caramelLab);
		
		steamLab  = new valueLabels("Steam ", steamValue, 290, 60);
		add(steamLab);
		
		
		
		
		timeLab  = new JLabel();
		timeLab.setBounds(530, 175, 400, 50);
		timeLab.setText("timeLab Test");
		timeLab.setFont(new Font("Dialog",Font.BOLD ,20));
		timeLab.setForeground(Color.WHITE);
		add(timeLab);
		
		
		order1 = new JLabel();
		order2 = new JLabel();
		order3 = new JLabel();
		order4 = new JLabel();
		order5 = new JLabel();
		order6= new JLabel();
		order7= new JLabel();
		order8 = new JLabel();
		
		this.labels[0] = order1;
		this.labels[1] = order2;
		this.labels[2] = (order3);
		this.labels[3] = (order4);
		this.labels[4] = (order5);
		this.labels[5] = (order6);
		this.labels[6] = (order7);
		this.labels[7] = (order8);
//		order1.setBounds(600, 30, 400, 300);
//		order1.setText("�ֹ� ����� 1");
//		order1.setFont(new Font("Dialog",Font.BOLD ,20));
//		order1.setForeground(Color.WHITE);
//		add(order1);
//		
//		order2 = new JLabel();
//		order2.setBounds(600, 70, 400, 300);
//		order2.setText("�ֹ� ����� 2");
//		order2.setFont(new Font("Dialog",Font.BOLD ,20));
//		order2.setForeground(Color.WHITE);
//		add(order2);
//		
//		order3 = new JLabel();
//		order3.setBounds(600, 110, 400, 300);
//		order3.setText("�ֹ� ����� 3");
//		order3.setFont(new Font("Dialog",Font.BOLD ,20));
//		order3.setForeground(Color.WHITE);
//		add(order3);
//		
//		order4 = new JLabel();
//		order4.setBounds(600, 150, 400, 300);
//		order4.setText("�ֹ� ����� 4");
//		order4.setFont(new Font("Dialog",Font.BOLD ,20));
//		order4.setForeground(Color.WHITE);
//		add(order4);
		
		orderRecipeTitle = new JLabel();
		orderRecipeTitle.setBounds(100, 300, 600, 300);
		orderRecipeTitle.setFont(new Font("Dialog",Font.BOLD ,28));
		orderRecipeTitle.setForeground(Color.WHITE);
		orderRecipeTitle.setText("Recipe");
		add(orderRecipeTitle);
		
		orderRecipe = new JLabel();
		orderRecipe.setBounds(100, 350, 600, 300);
		orderRecipe.setFont(new Font("Dialog",Font.BOLD ,24));
		orderRecipe.setForeground(Color.WHITE);
		orderRecipe.setText("");
		add(orderRecipe);
		
		
		
		///////////////////////////////////////////////////////////////////
		///////////////////     Buttons         ////////////////////////////
		
		//////	  ��� ��ư		new valueBtns("�̹����̸�", x��ǥ, y��ǥ);	  //////
		// 
		
		// Ŀ�� �� �ø��� ��ư
		coffeeBtn = new valueBtns("img/Coffee.png", 20, 120);
		add(coffeeBtn);
		
		coffeeBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(coffeeStringArray[1]);				
				temp += 10;
				coffeeStringArray[1] = temp+"";
				
				coffeeLab.setText("Coffee" + " : " + coffeeStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(coffeeStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(coffeeStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(coffeeStringArray);
					}
					
				}
				
				System.out.println(coffeeStringArray[0] + coffeeStringArray[1]);
				
			}
		});
		
		// �� ��  �ø��� ��ư
		waterBtn = new valueBtns("img/Water.png", 125, 120);
		add(waterBtn);
		
		waterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(waterStringArray[1]);				
				temp += 10;
				waterStringArray[1] = temp+"";
				
				waterLab.setText(Type[1] + " : " + waterStringArray[1]);
				
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(waterStringArray);
					System.out.println("���迭");
					System.out.println(waterStringArray[0] + " " + waterStringArray[1]);
				} else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(waterStringArray);
					// 
					if(flag){
						
					} else{
						makingResult.add(waterStringArray);
					}
					
				}
				
				System.out.println(waterStringArray[0] + waterStringArray[1]);
			}
		});
		
		
		
		// ���� �� �ø��� ��ư
		milkBtn = new valueBtns("img/Milk.png", 230, 120);
		add(milkBtn);
		
		milkBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(milkStringArray[1]);				
				temp += 10;
				milkStringArray[1] = temp+"";
				
				milkLab.setText("Milk" + " : " + milkStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(milkStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(milkStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(milkStringArray);
					}
					
				}
				
				System.out.println(milkStringArray[0] + milkStringArray[1]);
				
			}
		});
		
		
		// �÷� �� �ø��� ��ư
		syrupBtn = new valueBtns("img/Syrup.png", 335, 120);
		add(syrupBtn);
		
		syrupBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(syrupStringArray[1]);				
				temp += 10;
				syrupStringArray[1] = temp+"";
				
				syrupLab.setText("Syrup" + " : " + syrupStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(syrupStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(syrupStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(syrupStringArray);
					}
					
				}
				
				System.out.println(syrupStringArray[0] + syrupStringArray[1]);
				
			}
		});
		
		// ī��� �� �ø��� ��ư
		caramelBtn = new valueBtns("img/Caramel.png", 440, 120);
		add(caramelBtn);
		
		caramelBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(caramelStringArray[1]);				
				temp += 10;
				caramelStringArray[1] = temp+"";
				
				caramelLab.setText("Caramel" + " : " + caramelStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(caramelStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(caramelStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(caramelStringArray);
					}
					
				}
				
				System.out.println(caramelStringArray[0] + caramelStringArray[1]);
				
			}
		});
		
		// ���� �� �ø��� ��ư
		steamBtn = new valueBtns("img/Steam.png", 545, 120);
		add(steamBtn);
		
		steamBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(steamStringArray[1]);				
				temp += 10;
				steamStringArray[1] = temp+"";
				
				steamLab.setText("Steam" + " : " + steamStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(steamStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(steamStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(steamStringArray);
					}
					
				}
				
				System.out.println(steamStringArray[0] + steamStringArray[1]);
				
			}
		});
		
		
		//////		��Ʈ�� ��ư	 new controlBtns("�̹����̸�", x��ǥ, y��ǥ);	//////
		
		
		
		// ���� ��ư
		submitBtn = new controlBtns("img/Submit.png", 200, 270);
		add(submitBtn);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("submit��ư Ŭ��");
//				cafeTimeObj.getPlayThread().test();
				checkSubmit();
				System.out.println("������ ����ŷ : " + makingResult);
				resetMaking();
//				System.out.println("Ŭ���� ����ŷ : " + makingResult);
				
			}
		});
		
		// �� ���Ź�ư
		resetBtn = new controlBtns("img/Reset.png", 350, 270);
		add(resetBtn);
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetMaking();				
			}
		});
		

		setVisible(true);
	}
	
		
	// �����忡�� ȣ���ϴ� �ð�Label�� �ٲ�� �ϴ� �޼���
	public void setTimeLabel(int time){
		timeLab.setText("(" + time + "�� �Ŀ� �ֹ��� ���ɴϴ�.)");
	}
	
	// �ֹ� ���ǥ Label �ٲ�� �ϴ� �޼���
	public void setOrderLabel(ArrayList order){
		this.orderList = order;
		
//		if(this.orderList.size() == 1){
//			this.order1.setText((String) this.orderList.get(0).toString());
//			this.order2.setText("�ֹ� �����");
//			this.order3.setText("�ֹ� �����");
//			this.order4.setText("�ֹ� �����");
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//			
//		} else if(this.orderList.size() == 2){
//			this.order1.setText((String) this.orderList.get(0).toString());
//			this.order2.setText((String) this.orderList.get(1).toString());
//			this.order3.setText("�ֹ� �����");
//			this.order4.setText("�ֹ� �����");
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//		} else if(this.orderList.size() == 3){
//			this.order1.setText((String) this.orderList.get(0).toString());
//			this.order2.setText((String) this.orderList.get(1).toString());
//			this.order3.setText((String) this.orderList.get(2).toString());
//			this.order4.setText("�ֹ� �����");
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//		} else if(this.orderList.size() >= 4){
//			this.order1.setText((String) this.orderList.get(0).toString());
//			this.order2.setText((String) this.orderList.get(1).toString());
//			this.order3.setText((String) this.orderList.get(2).toString());
//			this.order4.setText((String) this.orderList.get(3).toString());
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//		} else if(this.orderList.size() == 0){
//			this.order1.setText("�ֹ� �����");
//			this.order2.setText("�ֹ� �����");
//			this.order3.setText("�ֹ� �����");
//			this.order4.setText("�ֹ� �����");
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//		}
		
		for(int x = 0, y = 80; x < labels.length; x++, y +=40){
			labels[x].setBounds(650, y, 400, 300);
			labels[x].setText("   ");
			labels[x].setFont(new Font("Dialog",Font.BOLD ,20));
			labels[x].setForeground(Color.WHITE);			
			add(labels[x]);
//			labels[x].setText((String) this.orderList.get(x).toString());
		}
		
		for(int x = 0; x < this.orderList.size(); x++){
			labels[x].setText((String) this.orderList.get(x).toString());
			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
		}
		
	
	}
	
	// ���� �ϴ�  �������ϴ� Ŀ�� �̸���  �ش� Ŀ���� ������ �� ����
	public void setOrderRecipeLabel(String RecipeTitle, ArrayList order){
		
		coffeeData firstOrder = (coffeeData) order.get(0);
		String[] orderRecipeValue;
		String orderRecipe = "";
		
		for(int x = 0; x < firstOrder.getRecipe().size(); x++){
			orderRecipeValue = (String[])firstOrder.getRecipe().get(x);
			
			// String[]�� ����� ������ �ε�����ȣ�� �ٲپ�� ��� ������ ��
			for(int y = 0; y < orderRecipeValue.length; y++){
				if(y % 2 == 0){
					orderRecipe += (String)orderRecipeValue[y];
					orderRecipe += ":";
				} else{
					orderRecipe += (String)orderRecipeValue[y];
					orderRecipe += " ";
				}
			}
			
		}
		
		this.orderRecipeTitle.setText(RecipeTitle);
		this.orderRecipe.setText(orderRecipe);
	}

	
	// ����� ���  �迭�� �ش��ϴ� ��ᰪ�� �����ϴ��� �Ǵ�  / ���� ������ �� �ø��⸸, ���� ������ �߰� �� �ø���
	private boolean searchMakingList(String[] StringArray){
		boolean flag = true;
		
		for(int x = 0; x < makingResult.size(); x++){
			if(	makingResult.get(x).equals(StringArray)){
				flag = true;
				break;
			} else {
				flag = false;
			}
		}
		return flag;
	}
	
	// �ֹ����� Ŀ�ǿ�  ����� ��ᰡ ��ġ�ϴ��� �Ǵ�
	public void checkSubmit(){
		boolean flag = false;
		// ����� ���� ������ ù��° ��� ������ ��, �ֹ�����Ʈ �� �����ϱ�
		if(this.orderList.size() > 0){
			
			this.menuList = this.coffeeDataObj.getMenuList();
			
			// ���� �ֹ��� Ŀ�Ǹ� �޴��� ��ϵǾ� �ִ� Ŀ�ǵ� �߿��� ã�� ��ġ�ϴ� Ŀ�Ǹ� ���� 
			for(int x = 0; x < this.menuList.size(); x++){
				if(this.orderList.get(0).equals(this.menuList.get(x))){
					this.nowOrderData = (coffeeData) this.menuList.get(x);
				}
			}
			
			
			if(this.nowOrderData.getRecipe().size() == makingResult.size()){
				flag = this.checkValues();
				if(flag){
					this.orderList.remove(0);
					this.setOrderLabel(this.orderList);
					System.out.println("����");
				} else{
					System.out.println("����");	
				}
			}
		
			this.setOrderLabel(this.orderList);
		} else{
			System.out.println("���� �ֹ��� ������ �ʾҽ��ϴ�.");
		}
	}
	
	
	// �ش� Ŀ���� �����ǿ�  ���� ������ִ� �����  ������ ��ġ�ϴ��� ��
	private boolean checkValues(){		
		boolean flag = false;
	
			// ArrayList�� makingResult�� ������ ��ŭ �ݺ��Ͽ� ������ ���� �� �ִ� ������ ���� 
			for(int x = 0; x < makingResult.size(); x++){
				String[] orderValue = (String[])this.nowOrderData.getRecipe().get(x);
				String[] makeValue  = (String[])makingResult.get(x);
				
				// String[]�� ����� ������ �ε�����ȣ�� �ٲپ�� ��� ������ ��
				for(int y = 0; y < makeValue.length; y++){
//					System.out.println("���� : " + orderValue[y]);
//					System.out.println("��ŷ : " + makeValue[y]);
					if(orderValue[y].equals(makeValue[y])){
						flag = true;
					} else{
						flag = false;
						break;
					}
				}
				
			}
		return flag;
	}
	
	// ���� ��ư�� �����ų�,  �����ϱ⸦ ������ ��  ����Ǿ��ִ� ��ᰪ�� �ʱ�ȭ
	public void resetMaking(){
		coffeeStringArray[1] = 0+"";
		waterStringArray[1] = 0+"";
		milkStringArray[1] = 0+"";
		syrupStringArray[1] = 0+"";
		caramelStringArray[1] = 0+"";
		steamStringArray[1] = 0+"";
		
		
		coffeeLab.setText("Coffee" + " : " + coffeeStringArray[1]);
		waterLab.setText("Water" + " : " + waterStringArray[1]);
		milkLab.setText("Milk" + " : " + milkStringArray[1]);
		syrupLab.setText("Syrup" + " : " + syrupStringArray[1]);
		caramelLab.setText("Caramel" + " : " + caramelStringArray[1]);
		steamLab.setText("Steam" + " : " + steamStringArray[1]);
		
		makingResult.clear();	
	}
	

}
