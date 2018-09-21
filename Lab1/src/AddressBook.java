import java.util.ArrayList;
// This is to test my github
public class AddressBook {
	private ArrayList<BuddyInfo> buddyInfo;
	public AddressBook() {
		buddyInfo= new ArrayList<BuddyInfo>();
	}
	
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
			BuddyInfo buddy= new BuddyInfo ("Tom","Carleton","613");
			AddressBook addressBook = new AddressBook();
			addressBook.addBuddy(buddy);
			addressBook.removeBuddy(0);
;			System.out.println("Address Book");
			System.out.println("Tamer");
		}
	}
