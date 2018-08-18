/**
 *  instanceof 关键字
 *  instanceof关键字判断父类对象是否为子类的实例。
 *  instanceof关键字还可以判断某个类是否实现了某个接口。
 *  语法格式：
 *  myobject instanceof ExampleClass
 *  ->  myobject ：某类的对象引用
 *  ->  ExampleClass： 某个类
 *  instanceof表达式的返回值为布尔值。
 */
package demo73;

/**
 * 实例10 ： 判断父类对象是否为子类对象
 *
 */
class Quadrangle03 { // 创建四边形类
	public static void draw(Quadrangle03 q) { // 画四边形的方法
		System.out.println("四边形的方法");
	}
}
class Square extends Quadrangle03 { // 创建四边形类的子类：正方形类

}
class Anything{public Anything() {  // 创建普通类
	// TODO Auto-generated constructor stub
}}

public class Parallelogram03 extends Quadrangle03{   // 创建四边形类的子类：平行四边形类

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrangle03 q = new Quadrangle03() ;// 创建四边形类对象
		// 判断父类四边形类对象是否为平行四边形类的实例
		if (q instanceof Parallelogram03) {
			Parallelogram03 p = (Parallelogram03) q ;  // 进行向下转型操作
			System.out.println("父类四边形类对象是平行四边形类的实例");
		}
		// 判断四边形类对象是否为正方形类的实例
		if (q instanceof Square) {
			Square s = (Square) q ;		// 进行向下转型操作
			System.out.println("父类四边形类对象是正方形类的实例");
		}
		// 由于q对象不为Anything类的对象，所以这条语句是错误的
		//System.out.println(q instanceof Anything);
	}

}
