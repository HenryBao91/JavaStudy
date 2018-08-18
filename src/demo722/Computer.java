package demo722;

// 父类 ， 电脑
public class Computer {			// 父类：电脑
	String screen = "液晶显示屏";	// 属性：屏幕
	void startup() {				// 方法：开机
		System.out.println("电脑正在开机，请等待...");
	}
	
	void showPicture() {
		System.out.println("台式机电脑，用鼠标点击");
	}
	
	String sayHello() {
		return "welcome" ;
	}
}
