package panels;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JPanel;

import cocktailValues.cocktailData;
import components.controlBtns;
import components.valueBtns;
import components.valueLabels;
import interfaces.FramePanelSetting;
import main.makeCocktail;

public class playPage extends JPanel implements FramePanelSetting{
	
//	private cafeTime cafeTimeObj;
	
	private JLabel timeLab, orderLabel, order1, order2, order3, order4, order5, order6, order7, order8, orderRecipeTitle, orderRecipe, test;
	private JLabel labels[];
	// �� ���� �� ����
	private int     rumValue = 0, ginValue = 0, vodkaValue = 0, tequilaValue = 0, 
			 whiskyValue = 0, brandyValue = 0, tonicValue = 0,
			 
			 
			 scoreValue = 0, timeValue = 0,
			 moneyValue = 0, testValue = 0;
	
//	protected String[] Type = {"Rum", "Gin", "Vodka", "Tequila", "Whisky", "Brandy", ""};
	
	private String[] rumStringArray 	= {"Rum", rumValue+""};
	private String[] ginStringArray 	= {"Gin", ginValue+""};
	private String[] vodkaStringArray 	= {"Vodka", vodkaValue+""};
	private String[] tequilaStringArray = {"Tequila", tequilaValue+""};
	private String[] whiskyStringArray  = {"Whisky", whiskyValue+""};
	private String[] brandyStringArray 	= {"Brandy", brandyValue+""};
	
	private String[] tonicStringArray 	= {"TonicWater", tonicValue+""};

	private valueLabels   rumLab, ginLab, vodkaLab, tequilaLab, whiskyLab, tonicLab,
	 				 	  brandyLab, scoreLab, moneyLab;
	
	private valueBtns   runBtn, ginBtn, vodkaBtn, tequilaBtn, whiskyBtn, brandyBtn,
						tonicBtn;
	
	private controlBtns submitBtn, resetBtn, testBtn;
	
	private cocktailData cocktailDataObj;
	
	protected ArrayList orderList = new ArrayList();
	
	private ArrayList menuList;
	private ArrayList makingResult;
	private cocktailData nowOrderData;
	private String[] StringMakingResult;
	
	
	
	private makeCocktail cafeTimeObj;


	
	
	
	public playPage(makeCocktail makeCocktailObj){
		super();
		this.cafeTimeObj = makeCocktailObj;
		this.cocktailDataObj = makeCocktailObj.getCocktailDataObj();
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
		rumLab = new valueLabels("Coffee", rumValue, 30, 25);
		add(rumLab);
		
		ginLab  = new valueLabels("Water ", ginValue, 30, 60);
		add(ginLab);
		
		vodkaLab  = new valueLabels("Milk ", vodkaValue, 160, 25);
		add(vodkaLab);
		
		tequilaLab  = new valueLabels("Syrup ", tequilaValue, 160, 60);
		add(tequilaLab);
		
		whiskyLab  = new valueLabels("Caramel ", whiskyValue, 290, 25);
		add(whiskyLab);
		
		brandyLab  = new valueLabels("Steam ", brandyValue, 290, 60);
		add(brandyLab);
		
		tonicLab  = new valueLabels("Tonic ", tonicValue, 30, 90);
		add(tonicLab);
		
		
		
		
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
		
		// �� �� �ø��� ��ư
		runBtn = new valueBtns("img/Rum.jpg", 20, 120);
		add(runBtn);
		
		runBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(rumStringArray[1]);				
				temp += 10;
				rumStringArray[1] = temp+"";
				
				rumLab.setText("Rum" + " : " + rumStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(rumStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(rumStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(rumStringArray);
					}
					
				}
				
				System.out.println(rumStringArray[0] + rumStringArray[1]);
				
			}
		});
		
		// �� ��  �ø��� ��ư
		ginBtn = new valueBtns("img/Gin.jpg", 125, 120);
		add(ginBtn);
		
		ginBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(ginStringArray[1]);				
				temp += 10;
				ginStringArray[1] = temp+"";
				
				ginLab.setText("Gin" + " : " + ginStringArray[1]);
				
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(ginStringArray);
//					System.out.println("���迭");
					System.out.println(ginStringArray[0] + " " + ginStringArray[1]);
				} else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(ginStringArray);
					// 
					if(flag){
						
					} else{
						makingResult.add(ginStringArray);
					}
					
				}
				
				System.out.println(ginStringArray[0] + ginStringArray[1]);
			}
		});
		
		
		
		// ����ī �� �ø��� ��ư
		vodkaBtn = new valueBtns("img/Vodka.jpg", 230, 120);
		add(vodkaBtn);
		
		vodkaBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(vodkaStringArray[1]);				
				temp += 10;
				vodkaStringArray[1] = temp+"";
				
				vodkaLab.setText("Vodka" + " : " + vodkaStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(vodkaStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(vodkaStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(vodkaStringArray);
					}
					
				}
				
				System.out.println(vodkaStringArray[0] + vodkaStringArray[1]);
				
			}
		});
		
		
		// ��ų�� �� �ø��� ��ư
		tequilaBtn = new valueBtns("img/Tequila.jpg", 335, 120);
		add(tequilaBtn);
		
		tequilaBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(tequilaStringArray[1]);				
				temp += 10;
				tequilaStringArray[1] = temp+"";
				
				tequilaLab.setText("Tequila" + " : " + tequilaStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(tequilaStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(tequilaStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(tequilaStringArray);
					}
					
				}
				
				System.out.println(tequilaStringArray[0] + tequilaStringArray[1]);
				
			}
		});
		
		// ����Ű �� �ø��� ��ư
		whiskyBtn = new valueBtns("img/Whisky.jpg", 440, 120);
		add(whiskyBtn);
		
		whiskyBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(whiskyStringArray[1]);				
				temp += 10;
				whiskyStringArray[1] = temp+"";
				
				whiskyLab.setText("Whisky" + " : " + whiskyStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(whiskyStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(whiskyStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(whiskyStringArray);
					}
					
				}
				
				System.out.println(whiskyStringArray[0] + whiskyStringArray[1]);
				
			}
		});
		
		// �귣�� �� �ø��� ��ư
		brandyBtn = new valueBtns("img/Brandy.jpg", 545, 120);
		add(brandyBtn);
		
		brandyBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(brandyStringArray[1]);				
				temp += 10;
				brandyStringArray[1] = temp+"";
				
				brandyLab.setText("Brandy" + " : " + brandyStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(brandyStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(brandyStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(brandyStringArray);
					}
					
				}
				
				System.out.println(brandyStringArray[0] + brandyStringArray[1]);
				
			}
		});
		
		
		
		// ��п��� �� �ø��� ��ư
		tonicBtn = new valueBtns("img/Tonic.jpg", 20, 190);
		add(tonicBtn);
		
		tonicBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(tonicStringArray[1]);				
				temp += 10;
				tonicStringArray[1] = temp+"";
				
				tonicLab.setText("Tonic" + " : " + tonicStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(tonicStringArray);
				} 
				else {
					// ����� �ִ� ��� �迭�� �ش� ����� ���� �ִ��� ������ �Ǵ�. 
					// false ����, �߰��ؾ��Ѵ�   // true �ִ�, �߰������ʾƵ� �ȴ�.
					boolean flag = searchMakingList(tonicStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(tonicStringArray);
					}
					
				}
				
				System.out.println(tonicStringArray[0] + tonicStringArray[1]);
				
			}
		});
		
	
				
		
		
		//////		��Ʈ�� ��ư	 new controlBtns("�̹����̸�", x��ǥ, y��ǥ);	//////
		
		
		
		// ���� ��ư
		submitBtn = new controlBtns("img/Submit.jpg", 200, 270);
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
		resetBtn = new controlBtns("img/Reset.jpg", 350, 270);
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
		
		cocktailData firstOrder = (cocktailData) order.get(0);
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
			
			this.menuList = this.cocktailDataObj.getMenuList();
			
			// ���� �ֹ��� Ŀ�Ǹ� �޴��� ��ϵǾ� �ִ� Ŀ�ǵ� �߿��� ã�� ��ġ�ϴ� Ŀ�Ǹ� ���� 
			for(int x = 0; x < this.menuList.size(); x++){
				if(this.orderList.get(0).equals(this.menuList.get(x))){
					this.nowOrderData = (cocktailData) this.menuList.get(x);
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
		rumStringArray[1] = 0+"";
		ginStringArray[1] = 0+"";
		vodkaStringArray[1] = 0+"";
		tequilaStringArray[1] = 0+"";
		whiskyStringArray[1] = 0+"";
		brandyStringArray[1] = 0+"";
		tonicStringArray[1] = 0+"";
		
		
		rumLab.setText("Coffee" + " : " + rumStringArray[1]);
		ginLab.setText("Water" + " : " + ginStringArray[1]);
		vodkaLab.setText("Milk" + " : " + vodkaStringArray[1]);
		tequilaLab.setText("Syrup" + " : " + tequilaStringArray[1]);
		whiskyLab.setText("Caramel" + " : " + whiskyStringArray[1]);
		brandyLab.setText("Steam" + " : " + brandyStringArray[1]);
		tonicLab.setText("Tonic" + " : " + tonicStringArray[1]);
		
		makingResult.clear();	
	}
	

}
