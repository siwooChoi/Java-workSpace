
public class TrdGameOver implements Runnable {

	
	public static boolean tgo = true;
	
	@Override
	public void run() {
		
		
		
		while(tgo == true) {
			
			if(5 <= TrdMain.trd_o_list.oList.size()) {		//  �ֹ� �и��� ���ӿ��� �� �� �ֵ��� ������ �� �ִ�.
				System.out.println("���ӿ���");
				tgo = false;
       		
				JF_JP_etc.frame.add(JF_JP_etc.gOver);
				JF_JP_etc.gOver.setBounds(0, 0, 800, 600);
				TrdMain.threadStop = false;
				JF_JP_etc.panel.removeAll();
				JF_JP_etc.gOver.addActionListener(new TrdExit());
       		
       	       	
			} else if(JF_JP_etc.scoreValue <= -100) {			// score �� -100 ���϶�� ���ӿ���
				System.out.println("���ӿ���2");
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
