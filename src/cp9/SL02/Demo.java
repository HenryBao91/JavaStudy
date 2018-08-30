package cp9.SL02;
/*
 * Number抽象类
 * */
public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// Number不能直接实例化，只能实例化子类
		Number num = new Double(1222.34) ;
		System.out.println(num);
		System.out.println(num.doubleValue());
		System.out.println(num.intValue());
		System.out.println(num.byteValue());  // 溢出

	}

}
