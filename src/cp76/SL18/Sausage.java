package cp76.SL18;
/*
 *  匿名内部类：
 *  1、匿名类没有构造方法；
 *  2、匿名类不能定义静态的成员；
 *  3、匿名类不能用private、public、abstract等修饰；
 *  4、只可以创建一个匿名类实例。
 * */
abstract class FreshKeepingFilm {  // 创建“保鲜膜”抽象类
	abstract void pack() ;  // 定义抽象的包装方法
}

public  class Sausage {  // 创建香肠类

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new FreshKeepingFilm() {  // 创建匿名内部类FreshKeepingFilm的对象
			
			@Override		// 重写抽象的包装方法
			void pack() {
				System.out.println("香肠加上保鲜膜");				
			}
		}.pack()   ;  //匿名内部类FreshKeepingFilm的对象调用重写抽象的包装方法
	}

}
