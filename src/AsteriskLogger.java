
public class AsteriskLogger implements Logger {

	@Override
	public void info(String info) {
		// TODO Auto-generated method stub
		System.out.println("***" + info + "***");
		System.out.println();
	}

	@Override
	public void error(String error) {
		// TODO Auto-generated method stub
		System.out.println("**********" + String.format("%"+error.length()+"s", "").replace(' ', '*') + "***");
		System.out.println();
		System.out.println("***" + "ERROR: " + error + "***");
		System.out.println();
		System.out.println("**********" + String.format("%"+error.length()+"s", "").replace(' ', '*') + "***");
		System.out.println();
	}
	

}
