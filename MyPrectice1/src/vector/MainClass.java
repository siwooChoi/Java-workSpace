package vector;

import java.util.Vector;

class Team {
	int 	myID;
	String 	myTeam;
}

class SamsungLions extends Team {
	{
		myID = Id.inc();
		myTeam = "�Ｚ���̿���";
	}
}

class LGTwins extends Team {
	{
		myID = Id.inc();
		myTeam = "LGƮ����";
	}
	
}

class Id {
	
	private static int id = 0;
	
	static int inc() {
		return ++id;
	}
	
	static int getID() {
		return id;
	}
	
}



public class MainClass {
	public static void main(String [] args){
		
		Vector bbTeamList = new Vector();
		
		bbTeamList.add(new SamsungLions());
		bbTeamList.add(new SamsungLions());
		bbTeamList.add(new LGTwins());
		bbTeamList.add(new LGTwins());

		
		for(int iCount = 0; iCount < bbTeamList.size(); iCount++){
			System.out.println(  ((Team)(bbTeamList.get(iCount))).myID + " : "  );
			System.out.println( ((Team)(bbTeamList.get(iCount))).myTeam  );	
		}
		
		System.out.println("\n----------------------\n");
		
		
		if(!bbTeamList.isEmpty()){
			while(bbTeamList.size() > 0) {
				Team tm = (Team)bbTeamList.get(0);
				
				System.out.println( tm.myTeam + " : " + tm.myID);
				
				if(bbTeamList.remove(tm))
					System.out.println("�� ���������� ���� �Ǿ����ϴ�.");
				else
					System.out.println("���� ����");
				
				System.out.println("���� Vector �� ��ü �� : " + bbTeamList.size());
			}
		}
		
	}
	
	
	
	
}
















//