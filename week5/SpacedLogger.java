package Week5;



public class SpacedLogger implements Logger{

	@Override
	public void log(String log) {
		StringBuilder spacedLog = new StringBuilder();
		for(int i = 0; i < log.length(); i++) {
			spacedLog.append(log.charAt(i) + " ");
		}
		System.out.println(spacedLog);
	}

	@Override
	public void error(String error) {
		StringBuilder spacedLog = new StringBuilder();
		for(int i = 0; i < error.length(); i++) {
			spacedLog.append(error.charAt(i) + " ");
		}
		System.out.println("ERROR: " + spacedLog);
		
	}

}
