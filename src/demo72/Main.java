package demo72;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		System.out.println(com.screen);
		com.startup();
		
		Pad iPad = new Pad();
		System.out.println(iPad.screen);
		iPad.startup();
		iPad.open3G();
	}

}
