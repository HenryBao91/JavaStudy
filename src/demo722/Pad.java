package demo722;

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
	//	super.property;   调用父类属性
	//	super.method();   调用父类方法		
	public Pad() {		//super调用父类构造方法
		super();  	// super(); 之前不能有其他代码
		this.screen = super.screen ; 
		
	}
	
	void open3G(){
		System.out.println("打开3G网络");
	}
	
	// 方法的重写
	void showPicture() {
		System.out.println("平板电脑，用手指点击触摸屏");
	}
	
	//  调用并重写父类方法，采用super关键字
	//	super关键字同this关键字
	//	不同在于，this代表本来对象，super代表父类对象
	String sayHello() {
		return super.sayHello()+"平板电脑" ;
	}
}
