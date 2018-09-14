import java.util.ArrayList;

public class AddressBook {
	private ArrayList<BuddyInfo> buddyInfo;
	
	public void addBuddy(BuddyInfo aBuddyInfo) {
		if(aBuddyInfo!=null) {
			buddyInfo.add(aBuddyInfo);
			
		}
	}
	public void removeBuddy(int index) {
		if(index >= 0 && index < buddyInfo.size()) {
			buddyInfo.remove(index);
			
		}
	}
		public static void main(String[]args) {
			System.out.println("Address Book");
		}
	}