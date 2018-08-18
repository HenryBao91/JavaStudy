/**
 * 向上转型
 */
package demo73;

/**
 * 实例08 ： 使用继承绘制平行四边形
 *
 */
class Quadrangle{		// 四边形类
	public static void draw(Quadrangle q) {  // 四边形类中的方法
		System.out.println("四边形");
	}
}
public class Parallelogram extends Quadrangle{  // 平行四边形类，继承四边形类
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parallelogram p = new Parallelogram();  // 实例化平行四边形类对象
		draw(p);    // 调用父类方法
	}
}

/*	
 * 在执行向上转型操作时，父类的对象无法调用子类独有的属性或者方法。例如，在上面代码
 * 的Parallelogram子类中定义一个edges变量，然后在main方法中使用Parallelogram子类
 * 创建Quadrangle父类的对象，并使用该父类对象调用子类中定义的变量，会提示出错。
 * 
public class Parallelogram extends Quadrangle{  // 平行四边形类，继承四边形类
	int edges = 4 ; 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Quadrangle p = new Parallelogram();  // 实例化平行四边形类对象
		p.edges ;    // 调用子类方法
	}
}
 * */




