
public class SpacedLogger implements Logger {

	@Override
	public void info(String info) {
		// TODO Auto-generated method stub
		System.out.println(info.replace("", " ").trim());
		System.out.println();
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("ERROR: " + error.replace("", " ").trim());
		System.out.println();
	}

}
