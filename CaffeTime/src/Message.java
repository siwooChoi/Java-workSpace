import java.util.ArrayList;

public class Message{
	
	private ArrayList <String> MessageS;

	
	
	public Message(ArrayList print) {
		MessageS = print;
	}
	
	public void addMsList(String M) {
		MessageS.add(M);
	

		if (MessageS.size() == 1) {
			JF_JP_etc.message1.setText(MessageS.get(JF_JP_etc.messageIndexCount));
		} else if (MessageS.size() == 2) {
			JF_JP_etc.message2.setText(MessageS.get(JF_JP_etc.messageIndexCount));
		} else if (MessageS.size() == 3) {
			JF_JP_etc.message3.setText(MessageS.get(JF_JP_etc.messageIndexCount));
		} else if (MessageS.size() == 4) {
			JF_JP_etc.message4.setText(MessageS.get(JF_JP_etc.messageIndexCount));
		} else if (MessageS.size() == 5 ){
			JF_JP_etc.message5.setText(MessageS.get(JF_JP_etc.messageIndexCount));
		} else if (MessageS.size() == 6) {
			JF_JP_etc.message6.setText(MessageS.get(JF_JP_etc.messageIndexCount));
		} 	
		
		else if (MessageS.size() >= 7 ) {
			MessageS.remove(0);
			
			JF_JP_etc.message1.setText(MessageS.get(0));
			JF_JP_etc.message2.setText(MessageS.get(1));
			JF_JP_etc.message3.setText(MessageS.get(2));
			JF_JP_etc.message4.setText(MessageS.get(3));
			JF_JP_etc.message5.setText(MessageS.get(4));
			JF_JP_etc.message6.setText(MessageS.get(5));
		}
		
		if(MessageS.size() < 6){
			JF_JP_etc.messageIndexCount++;
		} 		
	}
	
//	public String getMsList(int index) {
//		return (String)MessageS.get(index);
//	}
	
}
