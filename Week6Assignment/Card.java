package Week6Assignment;

public class Card {

	private int value;
	private String name;
	
	Card(int value, String name) {
		this.value = value;
		this.name = name;
		
	}
	
	public void cardDescribe() {
		System.out.println(this.name + ": " + this.value);
		
	}
	
	
	
	
	
	
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	
	
	
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

