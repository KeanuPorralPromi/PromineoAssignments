package Week5;

public class AsteriskLogger implements Logger{

	@Override
	public void log(String log) {

		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String additionalStars = "";
		
		if(error.length()> 5) {
			for(int i = 0; i < error.length()- 5; i++) {
				additionalStars += "*";	
			}
			System.out.println("****************" + additionalStars);
			System.out.println("***Error:" + error + "***");
			System.out.println("****************" + additionalStars);
		
         } else {
        	 System.out.println("****************");
        	 System.out.println("***Error:" + error + "***");
        	 System.out.println("****************");
         }
		
		
	}

}
