
public class TrdGameOver implements Runnable {

	
	public static boolean tgo = true;
	
	@Override
	public void run() {
		
		
		
		while(tgo == true) {
			
			if(5 <= TrdMain.trd_o_list.oList.size()) {		//  주문 밀리면 게임오버 할 수 있도록 정의할 수 있다.
				System.out.println("게임오버");
				tgo = false;
       		
				JF_JP_etc.frame.add(JF_JP_etc.gOver);
				JF_JP_etc.gOver.setBounds(0, 0, 800, 600);
				TrdMain.threadStop = false;
				JF_JP_etc.panel.removeAll();
				JF_JP_etc.gOver.addActionListener(new TrdExit());
       		
       	       	
			} else if(JF_JP_etc.scoreValue <= -100) {			// score 가 -100 이하라면 게임오버
				System.out.println("게임오버2");
				tgo = false;
       		
       		
				JF_JP_etc.frame.add(JF_JP_etc.gOver);
				JF_JP_etc.gOver.setBounds(0, 0, 800, 600);
				TrdMain.threadStop = false;       
				JF_JP_etc.panel.removeAll();
				JF_JP_etc.gOver.addActionListener(new TrdExit());
       		
			}
		}
	}

}
