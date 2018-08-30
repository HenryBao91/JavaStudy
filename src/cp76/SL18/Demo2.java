package cp76.SL18;

/*
 * 匿名内部类：使用的时候才进行了编写，没有名字
 * */

public class Demo2 {

	public OutInterface2 action() {
//		return new innerClass2() ;   //匿名内部类等价语句
		return new OutInterface2() {
			private int i = 10 ; 
			public int getValue() {
				return i ;
			}
		} ;
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		
	}
}

interface OutInterface2{
	
}

class innerClass2 implements OutInterface2{
	private int i = 10 ; 
	
	public int getValue() {
		return i ;
	}
}

