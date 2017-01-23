import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class me_makeReset implements ActionListener, Sub_Reset_Ms{
	
	public void reset() {
		
		JF_JP_etc.waterValue = 0;
		JF_JP_etc.coffeeValue = 0;
		JF_JP_etc.milkValue = 0;
		JF_JP_etc.syrupValue = 0;
		JF_JP_etc.caramelValue = 0;
		JF_JP_etc.steamValue = 0;
		
		JF_JP_etc.nowWater.setText("Water : " + JF_JP_etc.waterValue);
		JF_JP_etc.nowCoffee.setText("Coffee : " + JF_JP_etc.coffeeValue);
		JF_JP_etc.nowMilk.setText("Milk : " + JF_JP_etc.milkValue);
		JF_JP_etc.nowSyrup.setText("Syrup : " + JF_JP_etc.syrupValue);
		JF_JP_etc.nowCaramel.setText("Caramel : " + JF_JP_etc.caramelValue);
		JF_JP_etc.nowSteam.setText("Steam : " + JF_JP_etc.steamValue);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		reset();
		if(JF_JP_etc.scoreValue > 0){
			JF_JP_etc.scoreValue =  (JF_JP_etc.scoreValue - (JF_JP_etc.scoreValue/5)) - 30;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
		} else {
			JF_JP_etc.scoreValue = JF_JP_etc.scoreValue - 30;
			JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
		}
			
		JF_JP_etc.score.setText("" + JF_JP_etc.scoreValue);
		System.out.println("Reset ÇÕ´Ï´Ù.");

		
	}
	public void make(){
	
	};

}
