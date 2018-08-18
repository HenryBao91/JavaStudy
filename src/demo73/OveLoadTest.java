/*
 * 多态： 一种定义，多种实现
 * */
package demo73;

//	实例07 编写add()方法的多个重载形式

public class OveLoadTest {
	// 定义一个方法
	public static int add( int  a) {
		return a ;
	}
	// 定义另一个方法,参数个数不同
	public static int add( int  a , int b) {
		return a + b;
	}
	// 定义另一个方法,参数类型不同
	public static double add( double  a , double b) {
		return a + b;
	}
	// 定义另一个方法,参数个数不同
	public static int add( int  a , double b) {
		return (int)(a + b);
	}
	// 定义另一个方法,参数个数不同，次序不同
	public static int add( double  a , int b){
		return (int)(a + b);
	}
	// 定义另一个方法,参数变长
	public static int add( int... a ){
		int s = 0 ;
		//  根据参数个数循环操作
		for(int i = 0 ; i < a.length ; i++)
			s += a[i] ;
		return s ;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("调用add(int)方法：" + add(1));
		System.out.println("调用add(int,int)方法：" + add(1, 2));
		System.out.println("调用add(double,double)方法：" + add(2.1, 3.3));
		System.out.println("调用add(int a, double b)方法：" + add(1, 3.3));
		System.out.println("调用add(double a, int b) 方法：" + add(2.1, 3));
		System.out.println("调用add(int... a)不定长参数方法：" + add(1, 2, 3, 4, 5, 6, 7, 8, 9));
		System.out.println("调用add(int... a)不定长参数方法：" + add(2, 3, 4));
	}

}
