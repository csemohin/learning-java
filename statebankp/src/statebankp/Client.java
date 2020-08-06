package statebankp;

public class Client {
	private int id;
	private String name;
	private int mobile;
	private int deposit;
	
	public void setId(int id) {
		this.id = id;
	}
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setMobile(int mobile) {
		this.mobile = mobile;
	}
	
	public int getMobile() {
		return mobile;
	}
	
	public void setDeposit(int deposit) {
		this.deposit = deposit;
	}
	
	public int getDeposit() {
		return deposit;
	}
}
