package cp76.SL17;

/*
 * 	成员内部类
 * */

public class Demo {

	innerClass in = new innerClass() ;
	
	public void outf() {
		in.inf();
	}
	
	
	class innerClass{  // 成员内部类
		int y = 0;
		public innerClass() {  // 构造方法
		}	
		public void inf() {   // 内部类方法
			int y = 0;
			System.out.println("内部类方法y="+ y);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Demo d = new Demo() ;   //  实例化外部类对象
		d.outf();    // 调用外部类方法
		//  创建内部类对象方法
		Demo.innerClass in = d.new innerClass() ; 
		in.inf(); 
	}

}
