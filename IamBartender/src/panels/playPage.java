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
import components.makingBtns;
import components.valueBtns;
import components.valueLabels;
import interfaces.FramePanelSetting;
import main.makeCocktail;

public class playPage extends JPanel implements FramePanelSetting{
	
	
	private JLabel timeLab, orderLabel, order1, order2, order3, order4, order5, order6, order7, order8, orderRecipeTitle, orderRecipe, test;
	private JLabel labels[];
	// 각 재료들 값 정의
	private int     rumValue = 0, ginValue = 0, vodkaValue = 0, tequilaValue = 0, 
			 whiskyValue = 0, brandyValue = 0, whiteCuracaoValue = 0, blueCuracaoValue = 0,
			 peachValue = 0, bananaValue = 0, melonValue = 0, coconutValue = 0,
			 orangeValue = 0, pineappleValue = 0, limeValue = 0, cranberryValue =0,
			 sourMixValue = 0, colaValue = 0, spriteValue = 0, tonicValue = 0,
			 stirValue = 0, shakeValue = 0, blendValue = 0,
			 scoreValue = 0, timeValue = 0,
			 moneyValue = 0, testValue = 0;
	
//	protected String[] Type = {"Rum", "Gin", "Vodka", "Tequila", "Whisky", "Brandy", ""};
	
	private String[] rumStringArray 			= {"Rum", rumValue+""};
	private String[] ginStringArray 			= {"Gin", ginValue+""};
	private String[] vodkaStringArray 			= {"Vodka", vodkaValue+""};
	private String[] tequilaStringArray 		= {"Tequila", tequilaValue+""};
	private String[] whiskyStringArray 			= {"Whisky", whiskyValue+""};
	private String[] brandyStringArray 			= {"Brandy", brandyValue+""};
	private String[] whiteCuracaoStringArray 	= {"WhiteCuracao", whiteCuracaoValue+""};
	private String[] blueCuracaoStringArray 	= {"BlueCuracao", blueCuracaoValue +""};
	private String[] peachStringArray 			= {"Peach", peachValue+""};
	private String[] bananaStringArray 			= {"Banana", bananaValue+""};
	private String[] melonStringArray 			= {"Melon", melonValue+""};
	private String[] coconutStringArray 		= {"Coconut", coconutValue+""};
	private String[] orangeStringArray 			= {"Orange", orangeValue+""};
	private String[] pineappleStringArray 		= {"Pineapple", pineappleValue+""};
	private String[] limeStringArray 			= {"Lime", limeValue+""};
	private String[] cranberryStringArray 		= {"Cranberry", cranberryValue+""};
	private String[] sourMixStringArray 		= {"SweetSourMix", sourMixValue+""};
	private String[] colaStringArray 			= {"Cola", colaValue+""};
	private String[] spriteStringArray 			= {"Sprite", spriteValue+""};
	private String[] tonicStringArray 			= {"Tonic", tonicValue+""};
	private String[] stirStringArray 			= {"Stir", stirValue+""};
	private String[] shakeStringArray 			= {"Shake", shakeValue+""};
	private String[] blendStringArray 			= {"Blend", blendValue+""};

	private valueLabels   rumLab, ginLab, vodkaLab, tequilaLab, whiskyLab, brandyLab,
						 whiteCuracaoLab, blueCuracaoLab, peachLab, bananaLab, melonLab,
						 coconutLab, orangeLab, pineappleLab, limeLab, cranberryLab,
						 sourMixLab, colaLab, spriteLab, tonicLab, 
						 stirLab, shakeLab, blendLab, scoreLab, moneyLab;
	
	private valueBtns   runBtn, ginBtn, vodkaBtn, tequilaBtn, whiskyBtn, brandyBtn,
						whiteCuracaoBtn, blueCuracaoBtn, peachBtn, bananaBtn, melonBtn,
						coconutBtn, orangeBtn, pineappleBtn, limeBtn, cranberryBtn,
						sourMixBtn, colaBtn, spriteBtn, tonicBtn;
	
	private makingBtns  stirBtn, shakeBtn, blendBtn;
	
	private controlBtns submitBtn, resetBtn, testBtn;
	
	private cocktailData cocktailDataObj;
	
	protected ArrayList orderList = new ArrayList();
	
	private ArrayList menuList;
	private ArrayList makingResult;
	private cocktailData nowOrderData;
	private String[] StringMakingResult;
		
	private makeCocktail makeCocktailObj;
	private int lastScore;
	private int gameOverPoint = -200;


	
	
	
	public playPage(makeCocktail makeCocktailObj){
		super();
		this.makeCocktailObj = makeCocktailObj;
		this.cocktailDataObj = makeCocktailObj.getCocktailDataObj();
		
		// 주문들어오는 라벨들 담는 배열
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
		rumLab = new valueLabels("Rum", rumValue, 30, 25);
		add(rumLab);
		
		ginLab  = new valueLabels("Gin ", ginValue, 145, 25);
		add(ginLab);
		
		vodkaLab  = new valueLabels("Vodka ", vodkaValue, 250, 25);
		add(vodkaLab);
		
		tequilaLab  = new valueLabels("Tequila ", tequilaValue, 380, 25);
		add(tequilaLab);
		
		whiskyLab  = new valueLabels("Whisky ", whiskyValue, 520, 25);
		add(whiskyLab);
		
		brandyLab  = new valueLabels("Brandy ", brandyValue, 650, 25);
		add(brandyLab);
		
		///////
		whiteCuracaoLab  = new valueLabels("WhiteCuracao", whiteCuracaoValue, 150, 70);
		add(whiteCuracaoLab);
		
		blueCuracaoLab  = new valueLabels("BlueCuracao", blueCuracaoValue, 400, 70);
		add(blueCuracaoLab);
		
		peachLab  = new valueLabels("Peach", peachValue, 110, 115);
		add(peachLab);
		
		bananaLab  = new valueLabels("Banana", bananaValue, 240, 115);
		add(bananaLab);
		
		melonLab  = new valueLabels("Melon ", melonValue, 380, 115);
		add(melonLab);
		
		coconutLab  = new valueLabels("Coconut ", coconutValue, 500, 115);
		add(coconutLab);
		
		orangeLab  = new valueLabels("Orange ", orangeValue, 40, 150);
		add(orangeLab);
		
		pineappleLab  = new valueLabels("Pineapple ", pineappleValue, 180, 150);
		add(pineappleLab);
		
		limeLab  = new valueLabels("Lime ", limeValue, 330, 150);
		add(limeLab);
		
		cranberryLab  = new valueLabels("Cranberry ", cranberryValue, 440, 150);
		add(cranberryLab);
		
		sourMixLab  = new valueLabels("SweetSourMix ", sourMixValue, 25, 190);
		add(sourMixLab);
		
		colaLab  = new valueLabels("Cola ", colaValue, 250, 190);
		add(colaLab);
		
		spriteLab  = new valueLabels("Sprite ", spriteValue, 370, 190);
		add(spriteLab);
		
		tonicLab  = new valueLabels("Tonic ", tonicValue, 490, 190);
		add(tonicLab);
		
		stirLab  = new valueLabels("Stir", stirValue, 705, 320);
		add(stirLab);
		
		shakeLab  = new valueLabels("Shake", shakeValue, 685, 430);
		add(shakeLab);
		
		blendLab  = new valueLabels("Blend", blendValue, 690, 540);
		add(blendLab);
		
		scoreLab = new valueLabels("Score", scoreValue, 1100, 30);
		add(scoreLab);
		
		
		
		timeLab  = new JLabel();
		timeLab.setBounds(950, 60, 400, 50);
		timeLab.setText("timeLab Test");
		timeLab.setFont(new Font("Dialog",Font.BOLD ,20));
		timeLab.setForeground(Color.WHITE);
		add(timeLab);
		
		
		order1 = new JLabel();
		order2 = new JLabel();
		order3 = new JLabel();
		order4 = new JLabel();
		order5 = new JLabel();
		order6 = new JLabel();
		order7 = new JLabel();
		order8 = new JLabel();
		
		this.labels[0] = order1;
		this.labels[1] = order2;
		this.labels[2] = order3;
		this.labels[3] = order4;
		this.labels[4] = order5;
		this.labels[5] = order6;
		this.labels[6] = order7;
		this.labels[7] = order8;
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
		orderRecipeTitle.setBounds(100, 300, 800, 1100);
		orderRecipeTitle.setFont(new Font("Dialog",Font.BOLD ,28));
		orderRecipeTitle.setForeground(Color.WHITE);
		orderRecipeTitle.setText("Recipe");
		add(orderRecipeTitle);
		
		orderRecipe = new JLabel();
		orderRecipe.setBounds(100, 350, 2000, 1100);
		orderRecipe.setFont(new Font("Dialog",Font.BOLD ,24));
		orderRecipe.setForeground(Color.WHITE);
		orderRecipe.setText("");
		add(orderRecipe);
		
		
		
		///////////////////////////////////////////////////////////////////
		///////////////////     Buttons         ////////////////////////////
		
		//////	  재료 버튼		new valueBtns("이미지이름", x좌표, y좌표);	  //////
		// 
		
		// 럼 값 올리는 버튼
		runBtn = new valueBtns("img/Rum.jpg", 20, 250);
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
		ginBtn = new valueBtns("img/Gin.jpg", 140, 250);
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
		vodkaBtn = new valueBtns("img/Vodka.jpg", 260, 250);
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
		tequilaBtn = new valueBtns("img/Tequila.jpg", 380, 250);
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
		whiskyBtn = new valueBtns("img/Whisky.jpg", 500, 250);
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
		brandyBtn = new valueBtns("img/Brandy.jpg", 620, 250);
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
		
		// 화이트큐라소 값 올리는 버튼
		whiteCuracaoBtn = new valueBtns("img/WthieCuracao.jpg", 180, 310);
		add(whiteCuracaoBtn);
		
		whiteCuracaoBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(whiteCuracaoStringArray[1]);				
				temp += 10;
				whiteCuracaoStringArray[1] = temp+"";
				
				whiteCuracaoLab.setText("WhiteCuracao" + " : " + whiteCuracaoStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(whiteCuracaoStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(whiteCuracaoStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(whiteCuracaoStringArray);
					}
				}	
				System.out.println(whiteCuracaoStringArray[0] + whiteCuracaoStringArray[1]);
				
			}
		});
		
		// 블루큐라소 값 올리는 버튼
		blueCuracaoBtn = new valueBtns("img/BlueCuracao.jpg", 420, 310);
		add(blueCuracaoBtn);
		
		blueCuracaoBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(blueCuracaoStringArray[1]);				
				temp += 10;
				blueCuracaoStringArray[1] = temp+"";
				
				blueCuracaoLab.setText("BlueCuracao" + " : " + blueCuracaoStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(blueCuracaoStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(blueCuracaoStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(blueCuracaoStringArray);
					}
				}	
				System.out.println(blueCuracaoStringArray[0] + blueCuracaoStringArray[1]);
				
			}
		});
		
		// 피치 값 올리는 버튼
		peachBtn = new valueBtns("img/Peach.jpg", 100, 370);
		add(peachBtn);
		
		peachBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(peachStringArray[1]);				
				temp += 10;
				peachStringArray[1] = temp+"";
				
				peachLab.setText("Peach" + " : " + peachStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(peachStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(peachStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(peachStringArray);
					}
				}	
				System.out.println(peachStringArray[0] + peachStringArray[1]);
				
			}
		});
		
		// 바나나 값 올리는 버튼
		bananaBtn = new valueBtns("img/Banana.jpg", 240, 370);
		add(bananaBtn);
		
		bananaBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(bananaStringArray[1]);				
				temp += 10;
				bananaStringArray[1] = temp+"";
				
				bananaLab.setText("Banana" + " : " + bananaStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(bananaStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(bananaStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(bananaStringArray);
					}
				}	
				System.out.println(bananaStringArray[0] + bananaStringArray[1]);
				
			}
		});
		
		// 멜론 값 올리는 버튼
		melonBtn = new valueBtns("img/Melon.jpg", 380, 370);
		add(melonBtn);
		
		melonBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(melonStringArray[1]);				
				temp += 10;
				melonStringArray[1] = temp+"";
				
				melonLab.setText("Melon" + " : " + melonStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(melonStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(melonStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(melonStringArray);
					}
				}	
				System.out.println(melonStringArray[0] + melonStringArray[1]);
				
			}
		});
		
		// 코코넛 값 올리는 버튼
		coconutBtn = new valueBtns("img/Coconut.jpg", 530, 370);
		add(coconutBtn);
		
		coconutBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(coconutStringArray[1]);				
				temp += 10;
				coconutStringArray[1] = temp+"";
				
				coconutLab.setText("Coconut" + " : " + coconutStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(coconutStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(coconutStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(coconutStringArray);
					}
				}	
				System.out.println(coconutStringArray[0] + coconutStringArray[1]);
				
			}
		});
		
		// 오렌지 값 올리는 버튼
		orangeBtn = new valueBtns("img/Orange.jpg", 50, 450);
		add(orangeBtn);
		
		orangeBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(orangeStringArray[1]);				
				temp += 10;
				orangeStringArray[1] = temp+"";
				
				orangeLab.setText("Orange" + " : " + orangeStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(orangeStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(orangeStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(orangeStringArray);
					}
				}	
				System.out.println(orangeStringArray[0] + orangeStringArray[1]);
				
			}
		});
		
		// 파인애플 값 올리는 버튼
		pineappleBtn = new valueBtns("img/Pineapple.jpg", 190, 450);
		add(pineappleBtn);
		
		pineappleBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(pineappleStringArray[1]);				
				temp += 10;
				pineappleStringArray[1] = temp+"";
				
				pineappleLab.setText("Pineapple" + " : " + pineappleStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(pineappleStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(pineappleStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(pineappleStringArray);
					}
				}	
				System.out.println(pineappleStringArray[0] + pineappleStringArray[1]);
				
			}
		});
				
		// 라임 값 올리는 버튼
		limeBtn = new valueBtns("img/Lime.jpg", 340, 450);
		add(limeBtn);
		
		limeBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(limeStringArray[1]);				
				temp += 10;
				limeStringArray[1] = temp+"";
				
				limeLab.setText("Lime" + " : " + limeStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(limeStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(limeStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(limeStringArray);
					}
				}	
				System.out.println(limeStringArray[0] + limeStringArray[1]);
				
			}
		});
		
		// 크랜베리 값 올리는 버튼
		cranberryBtn = new valueBtns("img/Cranberry.jpg", 480, 450);
		add(cranberryBtn);
		
		cranberryBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(cranberryStringArray[1]);				
				temp += 10;
				cranberryStringArray[1] = temp+"";
				
				cranberryLab.setText("Cranberry" + " : " + cranberryStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(cranberryStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(cranberryStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(cranberryStringArray);
					}
				}	
				System.out.println(cranberryStringArray[0] + cranberryStringArray[1]);
				
			}
		});
		
		
		// 토닉워터 값 올리는 버튼
		sourMixBtn = new valueBtns("img/SnS.jpg", 90, 510);
		add(sourMixBtn);
		
		sourMixBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(sourMixStringArray[1]);				
				temp += 10;
				sourMixStringArray[1] = temp+"";
				
				sourMixLab.setText("SweetSourMix" + " : " + sourMixStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(sourMixStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(sourMixStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(sourMixStringArray);
					}
					
				}
				
				System.out.println(sourMixStringArray[0] + sourMixStringArray[1]);
				
			}
		});
		
		// 콜라 값 올리는 버튼
		colaBtn = new valueBtns("img/Cola.jpg", 230, 510);
		add(colaBtn);
		
		colaBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(colaStringArray[1]);				
				temp += 10;
				colaStringArray[1] = temp+"";
				
				colaLab.setText("Cola" + " : " + colaStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(colaStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(colaStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(colaStringArray);
					}
					
				}
				
				System.out.println(colaStringArray[0] + colaStringArray[1]);
				
			}
		});
		
		// 스프라이트 값 올리는 버튼
		spriteBtn = new valueBtns("img/Sprite.jpg", 370, 510);
		add(spriteBtn);
		
		spriteBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(spriteStringArray[1]);				
				temp += 10;
				spriteStringArray[1] = temp+"";
				
				spriteLab.setText("Sprite" + " : " + spriteStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(spriteStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(spriteStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(spriteStringArray);
					}
					
				}
				
				System.out.println(spriteStringArray[0] + spriteStringArray[1]);
				
			}
		});
		
		// 토닉워터 값 올리는 버튼
		tonicBtn = new valueBtns("img/Tonic.jpg", 510, 510);
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
		
		// Stir 값 올리는 버튼
		stirBtn = new makingBtns("img/Stir.jpg", 800, 240);
		add(stirBtn);
		
		stirBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(stirStringArray[1]);				
				temp += 10;
				stirStringArray[1] = temp+"";
				
				stirLab.setText("Stir" + " : " + stirStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(stirStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(stirStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(stirStringArray);
					}
					
				}
				
				System.out.println(stirStringArray[0] + stirStringArray[1]);
				
			}
		});
	
		// Shake 값 올리는 버튼
		shakeBtn = new makingBtns("img/Shake.jpg", 800, 350);
		add(shakeBtn);
		
		shakeBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(shakeStringArray[1]);				
				temp += 10;
				shakeStringArray[1] = temp+"";
				
				shakeLab.setText("Shake" + " : " + shakeStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(shakeStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(shakeStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(shakeStringArray);
					}
					
				}
				
				System.out.println(shakeStringArray[0] + shakeStringArray[1]);
				
			}
		});
		
		// blend 값 올리는 버튼
		blendBtn = new makingBtns("img/Blender.jpg", 800, 460);
		add(blendBtn);
		
		blendBtn.addActionListener(new ActionListener() {
			
			
			public void actionPerformed(ActionEvent arg0) {
				int temp = Integer.parseInt(blendStringArray[1]);				
				temp += 10;
				blendStringArray[1] = temp+"";
				
				blendLab.setText("Blend" + " : " + blendStringArray[1]);
				
				if(makingResult == null || makingResult.size() < 1){
					makingResult = new ArrayList();
					makingResult.add(blendStringArray);
				} 
				else {
					// 만들고 있는 재료 배열에 해당 재료의 값이 있는지 없는지 판단. 
					// false 없다, 추가해야한다   // true 있다, 추가하지않아도 된다.
					boolean flag = searchMakingList(blendStringArray);
					// 
					if(flag){
						
					} else {
						makingResult.add(blendStringArray);
					}
					
				}
				
				System.out.println(blendStringArray[0] + blendStringArray[1]);
				
			}
		});
				
		
		
		//////		컨트롤 버튼	 new controlBtns("이미지이름", x좌표, y좌표);	//////
		// 제출 버튼
		submitBtn = new controlBtns("img/Submit.jpg", 680, 130);
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
		resetBtn = new controlBtns("img/Reset.jpg", 795, 130);
		add(resetBtn);
		resetBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				resetMaking();				
				ScoreManage(-30);
				
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
		if(order.size() > 8){
			
		}
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
		
		for(int x = 0, y = 10; x < labels.length; x++, y +=40){
			labels[x].setBounds(1050, y, 400, 300);
			labels[x].setText("   ");
			labels[x].setFont(new Font("Dialog",Font.BOLD ,20));
			labels[x].setForeground(Color.WHITE);			
			add(labels[x]);
//			labels[x].setText((String) this.orderList.get(x).toString());
		}
		
		for(int x = 0; x < this.orderList.size(); x++){
			if(x < 8){
				labels[x].setText((String) this.orderList.get(x).toString());
				this.setOrderRecipeLabel((String) this.orderList.get(0).toString(), this.orderList);
			} else if(x >= 8){
				makeCocktailObj.stopThread();
				System.out.println("게임오버");
				
			}
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
	
	// 주문받은 칵테일과  만드는 재료가 일치하는지 판단
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
			
			
			if(this.nowOrderData != null && makingResult != null && this.nowOrderData.getRecipe().size() == makingResult.size()){
				flag = this.checkValues();
				
				if(flag){
					this.orderList.remove(0);
					this.setOrderLabel(this.orderList);
					ScoreManage(200);
					scoreLab.setText("Score : " + scoreValue);
					System.out.println("성공");
				} else if(makingResult.equals(null)){
					System.out.println("실패 else if");	
					ScoreManage(-50);
				} else{
					System.out.println("실패  else");	
					ScoreManage(-50);
				}
				
			} else if(makingResult == null || makingResult.size() == 0){
				System.out.println("tttttt elseIf");	
				ScoreManage(-50);
			} else {
				System.out.println("tttttt else");	
				ScoreManage(-50);
			}
		
			this.setOrderLabel(this.orderList);
		} else if (makingResult == null || makingResult.size() == 0) {
			System.out.println("checkSubmit  else if");
			ScoreManage(-50);
		}else{

			System.out.println("checkSubmit  else");
			ScoreManage(-50);
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
						continue;
					}
				}
		
			}
		return flag;
	}
	
	// Score 증가, 감소 관리
	private void ScoreManage(int argValue){
		scoreValue = scoreValue + argValue;
		lastScore = scoreValue;
		scoreLab.setText("Score : " + scoreValue);
		// 점수가 gameOverPoint 이하라면  스레드멈추고 게임오버
		if(scoreValue < gameOverPoint){
			System.out.println("스레드 멈추기");
			makeCocktailObj.stopThread();
		}
	}
	
	// 점수 초기화하기
	public void resetScore(){
		scoreValue = 0;
		scoreLab.setText("Score : " + scoreValue);
	}
	
	// 리셋 버튼을 누르거나,  제출하기를 눌렀을 때  저장되어있던 재료값들 초기화
	public void resetMaking(){
		if(makingResult == null || makingResult.size() < 1){
			
		} else{
		
		rumStringArray[1] = 0+"";
		ginStringArray[1] = 0+"";
		vodkaStringArray[1] = 0+"";
		tequilaStringArray[1] = 0+"";
		whiskyStringArray[1] = 0+"";
		brandyStringArray[1] = 0+"";
		whiteCuracaoStringArray[1] = 0+"";
		blueCuracaoStringArray[1] = 0+"";
		peachStringArray[1] = 0+"";
		bananaStringArray[1] = 0+"";
		melonStringArray[1] = 0+"";
		coconutStringArray[1] = 0+"";
		orangeStringArray[1] = 0+"";
		pineappleStringArray[1] = 0+"";
		limeStringArray[1] = 0+"";
		cranberryStringArray[1] = 0+"";
		sourMixStringArray[1] = 0+"";
		colaStringArray[1] = 0+"";
		spriteStringArray[1] = 0+"";
		tonicStringArray[1] = 0+"";
		stirStringArray[1] = 0+"";
		shakeStringArray[1] = 0+"";
		blendStringArray[1] = 0+"";
		
		rumLab.setText("Rum" + " : " + rumStringArray[1]);
		ginLab.setText("Gin" + " : " + ginStringArray[1]);
		vodkaLab.setText("Vodka" + " : " + vodkaStringArray[1]);
		tequilaLab.setText("Tequila" + " : " + tequilaStringArray[1]);
		whiskyLab.setText("Whisky" + " : " + whiskyStringArray[1]);
		brandyLab.setText("Brandy" + " : " + brandyStringArray[1]);
		whiteCuracaoLab.setText("WhiteCuracao" + " : " + whiteCuracaoStringArray[1]);
		blueCuracaoLab.setText("BlueCuracao" + " : " + blueCuracaoStringArray[1]);
		peachLab.setText("Peach" + " : " + peachStringArray[1]);
		bananaLab.setText("Banana" + " : " + bananaStringArray[1]);
		melonLab.setText("Melon" + " : " + melonStringArray[1]);
		coconutLab.setText("Coconut" + " : " + coconutStringArray[1]);
		orangeLab.setText("Orange" + " : " + orangeStringArray[1]);
		pineappleLab.setText("Pineapple" + " : " + pineappleStringArray[1]);
		limeLab.setText("Lime" + " : " + limeStringArray[1]);
		cranberryLab.setText("Cranberry" + " : " + cranberryStringArray[1]);
		sourMixLab.setText("SweetSourMix" + " : " + sourMixStringArray[1]);
		colaLab.setText("Cola" + " : " + colaStringArray[1]);
		spriteLab.setText("Sprite" + " : " + spriteStringArray[1]);
		tonicLab.setText("Tonic" + " : " + tonicStringArray[1]);
		stirLab.setText("Stir" + " : " + stirStringArray[1]);
		shakeLab.setText("Shake" + " : " + shakeStringArray[1]);
		blendLab.setText("Blend" + " : " + blendStringArray[1]);
		
		
		makingResult.clear();	
		}
	}
	

}
