package cp8.SL04;

public class DemoMutil {
	
	public static void show() throws InterruptedException, NullPointerException, Exception{
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			Thread.sleep(1000);    // 休眠1秒
		}
	}	
	public static void main(String[] args) throws InterruptedException, NullPointerException, Exception{
		show();
	}
	
}
