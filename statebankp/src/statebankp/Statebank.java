package statebankp;

public class Statebank {
	
	public void withdrawMoney(Client x, int money) {
		int deposit = x.getDeposit();
		if(deposit > money) {
			deposit = deposit - money;
			x.setDeposit(deposit);
			System.out.println("Client Name: "+ x.getName());
			System.out.println("Withdraw Money is "+ money);
			System.out.println("Available Balance is "+ deposit);
		}else {
			System.out.println("You have not sufficent balance");
		}
	}
	
	public static void main(String[] args) {
		Statebank sb = new Statebank();
		Client mohin = new Client();
		
		mohin.setName("MD MOHIN UDDIN");
		mohin.setId(1);
		mohin.setMobile(18555);
		mohin.setDeposit(500);
		
//		tohin
		Client tohin = new Client();
		tohin.setName("MD TOHIN Ahmmed");
		tohin.setId(2);
		tohin.setMobile(185446555);
		tohin.setDeposit(1000);
		
//		System.out.println(tohin.getName());
		
		sb.withdrawMoney(mohin, 100);
	}

}
