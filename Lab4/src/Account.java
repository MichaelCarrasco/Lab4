
public class Account {
	static int numAccounts=0;
	Account(){
	numAccounts=numAccounts+1; //counts the total number of accounts
	}
	
	public static void main(String[] args) {
		Account object1 = new Account(); //created objects under account
		Account object2 = new Account();
		Account object3 = new Account();
		Account object4 = new Account();
		Account object5 = new Account();
		System.out.print("Number of accounts = "+getNumAccount());
		}
	static int getNumAccount() {
	return numAccounts; 
	}
}
