package demo722;
//  方法的重写super
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer com = new Computer();
		System.out.println(com.screen);
		com.startup();
		com.showPicture();
		// 继承父类方法
		System.out.println(com.sayHello());
		
		System.out.println("****************************");

		Pad iPad = new Pad();
		System.out.println(iPad.screen);
		iPad.startup();
		iPad.open3G();
		iPad.showPicture();	  // 调用子类自己的重写方法
		
		//调用子类重写方法
		System.out.println(iPad.sayHello());
		
	}

}
