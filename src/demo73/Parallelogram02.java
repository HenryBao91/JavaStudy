/**
 *  向下转型
 */
package demo73;

/**
 *  实例09：类型转换异常
 */
class Quadrangle02{
	public static void draw(Quadrangle02 q) {
		System.out.println("四边形");
	}
}
public class Parallelogram02 extends Quadrangle02{
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		draw(new Parallelogram02());
		// 将平行四边形类对象看作是四边形对象，称为向上转型操作
		Quadrangle02 q = new Parallelogram02();
	   //  报错：类型转换错误
	//	Parallelogram02 p = q ;   // 将父类对象赋予子类对象
	
	// 如果采用父类对象强制转换为子类对象的方式，可以实现上述功能，即
	// 父类对象要变成子类对象，必须通过显示类型转换才能实现
		Parallelogram02 p = (Parallelogram02) q ;
	}

}
