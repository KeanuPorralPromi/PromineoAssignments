package Week5;

public class App {

	public static void main(String[] args) {
		
		Logger asterisklog = new AsteriskLogger();
		
		asterisklog.log("Hello");
		asterisklog.error("Hello");
		
		Logger spacedlog = new SpacedLogger();
		
		spacedlog.log("Hello");
		spacedlog.error("Hello");
	
		
	}

}
