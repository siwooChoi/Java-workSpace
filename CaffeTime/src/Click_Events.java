
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

public class Click_Events implements ActionListener{

	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		TrdGameOver gameover = new TrdGameOver();
		
		
		if( e.getSource() == JF_JP_etc.coffee  ) { 	// coffee

			JF_JP_etc.coffeeValue = JF_JP_etc.coffeeValue + 10;
			JF_JP_etc.nowCoffee.setText("Coffee : " + JF_JP_etc.coffeeValue);
			
		}
		
		else if ( e.getSource() == JF_JP_etc.milk) {
			JF_JP_etc.milkValue = JF_JP_etc.milkValue + 10;
			JF_JP_etc.nowMilk.setText("Milk : " + JF_JP_etc.milkValue);
			
		}
		
		else if ( e.getSource() == JF_JP_etc.syrup) {
			JF_JP_etc.syrupValue = JF_JP_etc.syrupValue + 10;
			JF_JP_etc.nowSyrup.setText("Syrup : " + JF_JP_etc.syrupValue);
		}
		
		else if ( e.getSource() == JF_JP_etc.water) {
			JF_JP_etc.waterValue = JF_JP_etc.waterValue + 10;
			
			JF_JP_etc.nowWater.setText("Water : " + JF_JP_etc.waterValue);
		}
		
		else if ( e.getSource() == JF_JP_etc.caramel) {
			JF_JP_etc.caramelValue = JF_JP_etc.caramelValue + 10;
			
			JF_JP_etc.nowCaramel.setText("Caramel : " + JF_JP_etc.caramelValue);
		}
		
		else if ( e.getSource() == JF_JP_etc.steam) {
			JF_JP_etc.steamValue = JF_JP_etc.steamValue + 10;
			JF_JP_etc.nowSteam.setText("Steam : " + JF_JP_etc.steamValue);
		}
		
		
		
		else if ( e.getSource() == JF_JP_etc.bomb) {
					
			if( JF_JP_etc.bombCount >= 0) {
				
				
				
				
			//	System.out.println(JF_JP_etc.bombCount);		/////  지워도됨
				
				
				
				if(TrdMain.trd_o_list.oList.size() == 0){
					System.out.println("");
				} else if(TrdMain.trd_o_list.oList.size() == 1){
					TrdMain.trd_o_list.oList.remove(0);
				} else if(TrdMain.trd_o_list.oList.size() == 2){
					TrdMain.trd_o_list.oList.remove(0);
					TrdMain.trd_o_list.oList.remove(0);
				} else if(TrdMain.trd_o_list.oList.size() == 3){
					TrdMain.trd_o_list.oList.remove(0);
					TrdMain.trd_o_list.oList.remove(0);
					TrdMain.trd_o_list.oList.remove(0);
				} else if(TrdMain.trd_o_list.oList.size() == 4){
					TrdMain.trd_o_list.oList.remove(0);
					TrdMain.trd_o_list.oList.remove(0);
					TrdMain.trd_o_list.oList.remove(0);
					TrdMain.trd_o_list.oList.remove(0);
				}
				
				JF_JP_etc.order1.setText("주문 대기중");
				JF_JP_etc.order2.setText("주문 대기중");
				JF_JP_etc.order3.setText("주문 대기중");
				JF_JP_etc.order4.setText("주문 대기중");
				
				
				JF_JP_etc.bombCount--;
				JF_JP_etc.BombCountNumber.setText(""+JF_JP_etc.bombCount);

			}
			
			
			if(JF_JP_etc.bombCount == 0){
				JF_JP_etc.scoreValue = JF_JP_etc.scoreValue - 500;
				JF_JP_etc.score.setText(""+JF_JP_etc.scoreValue);
				JF_JP_etc.BombCountNumber.setBounds(455, 200, 30, 30);
				JF_JP_etc.BombCountNumber.setText("None");
				
			}
			
			if(JF_JP_etc.bombCount == 0){

				JF_JP_etc.bomb.setEnabled(false);
			
				
				
			}
			
			
		}
		
		
		
		// 시작부분, 클릭하면  로딩화면이 사라짐.
		else if ( e.getSource() == JF_JP_etc.StartButton) {
			
			JF_JP_etc.StartButton.setSize(0, 0);
			JF_JP_etc.frame.add(JF_JP_etc.panel);
		
				TrdMain TrdMain = new TrdMain();
				TrdGameOver TGO = new TrdGameOver();
			
				Thread t = new Thread(TrdMain);
				Thread tg = new Thread(TGO);
				
				t.start();
				tg.start();
		}
	
	}
}
