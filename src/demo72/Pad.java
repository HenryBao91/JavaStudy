package demo72;

// 子类 , 平板电脑
public class Pad extends Computer{
	String battery = "5000毫安电池";			// 平板电脑的属性：电池
/*	public static void main(String[] args) {
		Computer pc = new Computer();			// 创建电脑类对象
		System.out.println("computer的屏幕是：" + pc.screen);
		pc.startup();					// 电脑类对象调用开机方法
		Pad ipad = new Pad();				// 创建平板电脑类对象
		System.out.println("pad的屏幕是：" + ipad.screen); // 平板电脑类对象使用父类属性
		System.out.println("pad的电池是：" + ipad.battery);// 平板电脑类对象使用自己的属性
		ipad.startup();				// 平板电脑类对象使用父类方法
	}*/
	void open3G(){
		System.out.println("打开3G网络");
	}
}
