import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JLabel;

public class submit implements ActionListener, Sub_Reset_Ms {

	me_makeReset reset = new me_makeReset();
	Recipe recipe = new Recipe();
	
	public static String result = new String();

	public void make(int water, int coffee, int milk, int syrup, int caramel, int steam) {
		
							// �Ƹ޸�ī��
		if((water == 80 && coffee == 30 && milk == 0 && syrup == 0 && caramel == 0 && steam == 0)  && TrdMain.trd_o_list.oList.size() > 0) {
			result = recipe.Americano(coffee, water);
			JF_JP_etc.scoreValue = JF_JP_etc.scoreValue + 10;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			System.out.println(recipe.Americano(coffee, water));		// �ڹ� �ܼ� ���
			TrdMain.message.addMsList(recipe.Americano(coffee, water) + "��(��) ��������ϴ�.");
		}
							// �÷� ���� �Ƹ޸�ī��
		else if ((water == 80 && coffee == 30 && milk == 0 && syrup == 10 && caramel == 0 && steam == 0)  && TrdMain.trd_o_list.oList.size() > 0) {
			result = recipe.Americano(coffee, water, syrup);
			JF_JP_etc.scoreValue = JF_JP_etc.scoreValue + 130;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			System.out.println(recipe.Americano(coffee, water, syrup));
			TrdMain.message.addMsList(recipe.Americano(coffee, water, syrup)  + "��(��) ��������ϴ�.");
			
		}
							// ī�����
		else if ((water == 0 && coffee == 30 && milk == 80 && syrup == 0 && caramel == 0 && steam == 0) &&  TrdMain.trd_o_list.oList.size() > 0) {
			result = recipe.CafeLatte(coffee, milk);
			JF_JP_etc.scoreValue = JF_JP_etc.scoreValue + 110;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			System.out.println(recipe.CafeLatte(coffee, milk));
			TrdMain.message.addMsList(recipe.CafeLatte(coffee, milk)  + "��(��) ��������ϴ�.");
		}
		
							// ����������
		else if ((water == 0 && coffee == 70 && milk == 0 && syrup == 0 && caramel == 0 && steam == 0) && TrdMain.trd_o_list.oList.size() > 0) {
			result = recipe.Espresso(coffee);
			JF_JP_etc.scoreValue = JF_JP_etc.scoreValue + 60;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			System.out.println(recipe.Espresso(coffee));
			TrdMain.message.addMsList(recipe.Espresso(coffee)  + "��(��) ��������ϴ�.");
		}
		
							// �÷� ���� ����������
		else if ((water == 0 && coffee == 70 && milk == 0 && syrup == 10 && caramel == 0 && steam == 0) && TrdMain.trd_o_list.oList.size() > 0) {
			result = recipe.Espresso(coffee, syrup);
			JF_JP_etc.scoreValue = JF_JP_etc.scoreValue + 70;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			System.out.println(recipe.Espresso(coffee));
			TrdMain.message.addMsList(recipe.Espresso(coffee, syrup)  + "��(��) ��������ϴ�.");
		}
		
		else if ((water == 0 && coffee == 30 && milk == 70 && syrup == 0 && caramel == 20 && steam == 30) && TrdMain.trd_o_list.oList.size() > 0) {
			result = recipe.Caramel_Macchiato(coffee, milk, caramel, steam);
			JF_JP_etc.scoreValue = JF_JP_etc.scoreValue + 160;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			System.out.println(recipe.Caramel_Macchiato(coffee, milk, caramel, steam));
			TrdMain.message.addMsList(recipe.Caramel_Macchiato(coffee, milk, caramel, steam)  + "��(��) ��������ϴ�.");
		}
		
		else if ((water == 0 && coffee == 30 && milk == 60 && syrup == 0 && caramel == 0 && steam == 30) && TrdMain.trd_o_list.oList.size() > 0) {
			result = recipe.Cappuccino(coffee, milk, steam);
			JF_JP_etc.scoreValue = JF_JP_etc.scoreValue + 160;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			System.out.println(recipe.Cappuccino(coffee, milk, steam));
			TrdMain.message.addMsList(recipe.Cappuccino(coffee, milk, steam)  + "��(��) ��������ϴ�.");
		}
		
							// �߸� ���� ������ �� ���
		else {
			if(JF_JP_etc.scoreValue > 0){
				JF_JP_etc.scoreValue =  (JF_JP_etc.scoreValue - (JF_JP_etc.scoreValue/5)) - 50;
				JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			} else {
				JF_JP_etc.scoreValue = JF_JP_etc.scoreValue - 50;
				JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			}
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			System.out.println("�߸��� ������ �Դϴ�.");
			TrdMain.message.addMsList("�߸��� ������ �Դϴ�.");
		}
	}
		
	
	
	public void actionPerformed(ActionEvent e) {
		
		submit me_make = new submit();
		
		me_make.make(JF_JP_etc.waterValue, JF_JP_etc.coffeeValue, JF_JP_etc.milkValue, JF_JP_etc.syrupValue, JF_JP_etc.caramelValue, JF_JP_etc.steamValue);		
		
		reset.reset();
		
		if(TrdMain.trd_o_list.oList.size() ==0){
			System.out.println("���� �ֹ��� �����ϴ�.");
			TrdMain.message.addMsList("���� �ֹ��� �����ϴ�.");
		}
		
		else if(result != TrdMain.trd_o_list.getList(0)){
			System.out.println("�ֹ��� ���� ������� ������ �մϴ�.");
			TrdMain.message.addMsList("�ֹ��� ���� ������� ������ �մϴ�.");
			if(JF_JP_etc.scoreValue > 0) {
				JF_JP_etc.scoreValue = (JF_JP_etc.scoreValue - (JF_JP_etc.scoreValue/5)) - 30 ;
				JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			} else {
				JF_JP_etc.scoreValue = JF_JP_etc.scoreValue - 30;
				JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
			}
		}
		
		else if(result == TrdMain.trd_o_list.getList(0)){
			TrdMain.trd_o_list.oList.remove(0);
			
	
//			if(1 == TrdMain.trd_o_list.oList.size()){		// ArrayList �� �����ϸ� �ڵ����� ��ĭ�� �մ������ ..... �˰��� ���� �ʿ䰡 ������...
//				Collections.swap(TrdMain.trd_o_list.oList, 0, 1);
//			} else if(2 == TrdMain.trd_o_list.oList.size()){
//					Collections.swap(TrdMain.trd_o_list.oList, 0, 1);
//					Collections.swap(TrdMain.trd_o_list.oList, 1, 2);
//			} else if(3 == TrdMain.trd_o_list.oList.size()){
//				Collections.swap(TrdMain.trd_o_list.oList, 0, 1);
//				Collections.swap(TrdMain.trd_o_list.oList, 1, 2);
//				Collections.swap(TrdMain.trd_o_list.oList, 2, 3);
//			} else{}
		}
		

		
		if(TrdMain.trd_o_list.oList.size() == 0) {
			JF_JP_etc.order1.setText("�ֹ� �����");
				
		} else if (TrdMain.trd_o_list.oList.size() == 1) {
			JF_JP_etc.order1.setText(TrdMain.trd_o_list.getList(0));
			JF_JP_etc.order2.setText("�ֹ� �����");
		} else if (TrdMain.trd_o_list.oList.size() == 2) {
			JF_JP_etc.order1.setText(TrdMain.trd_o_list.getList(0));
			JF_JP_etc.order2.setText(TrdMain.trd_o_list.getList(1));
			JF_JP_etc.order3.setText("�ֹ� �����");
		} else if (TrdMain.trd_o_list.oList.size() == 3) {
			JF_JP_etc.order1.setText(TrdMain.trd_o_list.getList(0));
			JF_JP_etc.order2.setText(TrdMain.trd_o_list.getList(1));
			JF_JP_etc.order3.setText(TrdMain.trd_o_list.getList(2));
			JF_JP_etc.order4.setText("�ֹ� �����");
	    }

	}
	
	
	// �������̽� ����
	public void reset(){
		reset.reset();
	}



	@Override
	// �������̽� ����
	public void make() {
		
	}

}
