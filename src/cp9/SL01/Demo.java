package cp9.SL01;
/*
 * 包装类
 * Interger Demo
 * Interger常用方法
 * */
public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		System.out.println("int类型的最大值为： "+Integer.MAX_VALUE);
		System.out.println("int类型的最大值为： "+Integer.MIN_VALUE);
		System.out.println("int类型的最大值为： "+Integer.SIZE);
		System.out.println("int类型的最大值为： "+Integer.TYPE);
		System.out.println("-----------------------------------");

		// 通过构造方法，创建Integer对象
		Integer inte1 = new Integer(123) ;
		System.out.println(inte1);
		Integer inte2 = new Integer("123456789") ;
		System.out.println(inte2);

		// 其他创建方法，valueof()转换成int值
		Integer inte3 = Integer.valueOf("987845") ;
		System.out.println(inte3);

		int num1 = Integer.parseInt("32");
		System.out.println(num1+2);
		int num2 = inte2.intValue() ;
		System.out.println(num2 - 10);

		String str1 = Integer.toBinaryString(11) ;
		System.out.println("11的二进制表示形式： "+ str1);

		String str2 = Integer.toHexString(11) ;
		System.out.println("11的16进制表示形式： "+ str2);
		
		String str3 = Integer.toOctalString(11) ;
		System.out.println("11的8 进制表示形式： "+ str3);
		
		String str4 = Integer.toString(111,15) ;
		System.out.println("11的15进制表示形式： "+ str4);
		
		Byte b = new Byte("123") ;
		System.out.println("Byte： "+ b);
		short s = new Short((short) 124) ;
		System.out.println("short： "+ s);
		Long l = new Long(125L) ;
		System.out.println("Long： "+ l);

	}

}
