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
	// 각 재료들 값 정의
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
//		order1.setText("주문 대기중 1");
//		order1.setFont(new Font("Dialog",Font.BOLD ,20));
//		order1.setForeground(Color.WHITE);
//		add(order1);
//		
//		order2 = new JLabel();
//		order2.setBounds(600, 70, 400, 300);
//		order2.setText("주문 대기중 2");
//		order2.setFont(new Font("Dialog",Font.BOLD ,20));
//		order2.setForeground(Color.WHITE);
//		add(order2);
//		
//		order3 = new JLabel();
//		order3.setBounds(600, 110, 400, 300);
//		order3.setText("주문 대기중 3");
//		order3.setFont(new Font("Dialog",Font.BOLD ,20));
//		order3.setForeground(Color.WHITE);
//		add(order3);
//		
//		order4 = new JLabel();
//		order4.setBounds(600, 150, 400, 300);
//		order4.setText("주문 대기중 4");
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
		
		//////	  재료 버튼		new valueBtns("이미지이름", x좌표, y좌표);	  //////
		// 
		
		// 럼 값 올리는 버튼
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
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
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
		
		// 진 값  올리는 버튼
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
//					System.out.println("값배열");
					System.out.println(ginStringArray[0] + " " + ginStringArray[1]);
				} else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
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
		
		
		
		// 보드카 값 올리는 버튼
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
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
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
		
		
		// 데킬라 값 올리는 버튼
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
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
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
		
		// 위스키 값 올리는 버튼
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
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
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
		
		// 브랜디 값 올리는 버튼
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
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
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
		
		
		
		// 토닉워터 값 올리는 버튼
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
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
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
		
	
				
		
		
		//////		컨트롤 버튼	 new controlBtns("이미지이름", x좌표, y좌표);	//////
		
		
		
		// 제출 버튼
		submitBtn = new controlBtns("img/Submit.jpg", 200, 270);
		add(submitBtn);
		submitBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
//				System.out.println("submit버튼 클릭");
//				cafeTimeObj.getPlayThread().test();
				checkSubmit();
				System.out.println("제출한 메이킹 : " + makingResult);
				resetMaking();
//				System.out.println("클리어 메이킹 : " + makingResult);
				
			}
		});
		
		// 값 제거버튼
		resetBtn = new controlBtns("img/Reset.jpg", 350, 270);
		add(resetBtn);
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetMaking();				
			}
		});
		

		setVisible(true);
	}
	
		
	// 스레드에서 호출하는 시간Label값 바뀌게 하는 메서드
	public void setTimeLabel(int time){
		timeLab.setText("(" + time + "초 후에 주문이 들어옵니다.)");
	}
	
	// 주문 대기표 Label 바뀌게 하는 메서드
	public void setOrderLabel(ArrayList order){
		this.orderList = order;
		
//		if(this.orderList.size() == 1){
//			this.order1.setText((String) this.orderList.get(0).toString());
//			this.order2.setText("주문 대기중");
//			this.order3.setText("주문 대기중");
//			this.order4.setText("주문 대기중");
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//			
//		} else if(this.orderList.size() == 2){
//			this.order1.setText((String) this.orderList.get(0).toString());
//			this.order2.setText((String) this.orderList.get(1).toString());
//			this.order3.setText("주문 대기중");
//			this.order4.setText("주문 대기중");
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//		} else if(this.orderList.size() == 3){
//			this.order1.setText((String) this.orderList.get(0).toString());
//			this.order2.setText((String) this.orderList.get(1).toString());
//			this.order3.setText((String) this.orderList.get(2).toString());
//			this.order4.setText("주문 대기중");
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//		} else if(this.orderList.size() >= 4){
//			this.order1.setText((String) this.orderList.get(0).toString());
//			this.order2.setText((String) this.orderList.get(1).toString());
//			this.order3.setText((String) this.orderList.get(2).toString());
//			this.order4.setText((String) this.orderList.get(3).toString());
//			this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
//		} else if(this.orderList.size() == 0){
//			this.order1.setText("주문 대기중");
//			this.order2.setText("주문 대기중");
//			this.order3.setText("주문 대기중");
//			this.order4.setText("주문 대기중");
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
	
	// 좌측 하단  만들어야하는 커피 이름과  해당 커피의 레시피 라벨 갱신
	public void setOrderRecipeLabel(String RecipeTitle, ArrayList order){
		
		cocktailData firstOrder = (cocktailData) order.get(0);
		String[] orderRecipeValue;
		String orderRecipe = "";
		
		for(int x = 0; x < firstOrder.getRecipe().size(); x++){
			orderRecipeValue = (String[])firstOrder.getRecipe().get(x);
			
			// String[]로 변경된 값들의 인덱스번호를 바꾸어가며 모든 값들을 비교
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

	
	// 만드는 재료  배열에 해당하는 재료값이 존재하는지 판단  / 값이 있으면 값 올리기만, 값이 없으면 추가 후 올리기
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
	
	// 주문받은 커피와  만드는 재료가 일치하는지 판단
	public void checkSubmit(){
		boolean flag = false;
		// 만들기 성공 했을때 첫번째 목록 제거한 뒤, 주문리스트 라벨 갱신하기
		if(this.orderList.size() > 0){
			
			this.menuList = this.cocktailDataObj.getMenuList();
			
			// 현재 주문된 커피를 메뉴에 등록되어 있는 커피들 중에서 찾고 일치하는 커피를 대입 
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
					System.out.println("성공");
				} else{
					System.out.println("실패");	
				}
			}
		
			this.setOrderLabel(this.orderList);
		} else{
			System.out.println("아직 주문이 들어오지 않았습니다.");
		}
	}
	
	
	// 해당 커피의 레시피와  현재 만들고있는 재료의  값들이 일치하는지 비교
	private boolean checkValues(){		
		boolean flag = false;
	
			// ArrayList인 makingResult의 사이즈 만큼 반복하여 값들을 비교할 수 있는 값으로 변경 
			for(int x = 0; x < makingResult.size(); x++){
				String[] orderValue = (String[])this.nowOrderData.getRecipe().get(x);
				String[] makeValue  = (String[])makingResult.get(x);
				
				// String[]로 변경된 값들의 인덱스번호를 바꾸어가며 모든 값들을 비교
				for(int y = 0; y < makeValue.length; y++){
//					System.out.println("오더 : " + orderValue[y]);
//					System.out.println("메킹 : " + makeValue[y]);
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
	
	// 리셋 버튼을 누르거나,  제출하기를 눌렀을 때  저장되어있던 재료값들 초기화
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
