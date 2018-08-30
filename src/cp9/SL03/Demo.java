package cp9.SL03;
/*
 * Math类：
 * java.lang.Math 
 * 1、java.lan包不需要引入，系统会自动调用。
 * 2、Math类提供的都是静态方法。
 * */
public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("圆周率π：" + Math.PI); // 3.14
		// 三角函数
		System.out.println("90°的sin值：" + Math.sin(Math.PI/2)); // 取e的2次方
		System.out.println("90°的cos值：" + Math.cos(0)); // 取e的2次方		
		System.out.println("-----------------------"); 		

		/*    指数类运算		*/
		Expfunction() ;
		/*   取整方法运算		*/
		IntFunction();
		/*   Max、Min、绝对值运算		*/
		AnyFunction();
	}
	
	public static void Expfunction() {
		System.out.println("e的平方：" + Math.exp(2)); // 取e的2次方
		System.out.println("以e为底数，2的对数：" + Math.log(2)); // 取以e为底2的对数
		System.out.println("以10为底数，2的对数：" + Math.log10(2)); // 取以10为底2的对数
		System.out.println("4的算术平方根：" + Math.sqrt(4)); // 取4的平方根
		System.out.println("8的立方根：" + Math.cbrt(8)); // 取8的立方根
		System.out.println("2的平方：" + Math.pow(2, 2)); // 取2的2次方
		System.out.println("-----------------------"); 		

	}
	
	public static void IntFunction() {
		// 返回第一个大于等于参数的整数
		System.out.println("使用ceil()方法取整：" + Math.ceil(5.2));
		// 返回第一个小于等于参数的整数
		System.out.println("使用floor()方法取整：" + Math.floor(2.5));
		// 返回与参数最接近的整数
		System.out.println("使用rint()方法取整：" + Math.rint(2.7));
		// 返回与参数最接近的整数
		System.out.println("使用rint()方法取整：" + Math.rint(2.5));
		// round方法：四舍五入
		// 四舍五入，将参数加上0.5后返回最接近的整数
		System.out.println("使用round()方法取整：" + Math.round(3.4f));
		// 四舍五入，将参数加上0.5后返回最接近的整数，并将结果强制转换为长整型
		System.out.println("使用round()方法取整：" + Math.round(2.5));
		System.out.println("使用round()方法取整：" + Math.round(-2.5));
		System.out.println("-----------------------"); 		

	}
	
	public static void AnyFunction() {
		System.out.println("4和8较大者:" + Math.max(4, 8));
		System.out.println("4.4和4较小者：" + Math.min(4.4, 4)); // 取两个参数的最小值
		System.out.println("-7的绝对值：" + Math.abs(-7)); // 取参数的绝对值
		System.out.println("-----------------------"); 		

	}
}
