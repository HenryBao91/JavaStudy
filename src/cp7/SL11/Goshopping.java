/**
 * 抽象类与接口
 * Java中，抽象类不能产生对象实例。定义抽象类时，需要使用abstract关键字
 * [权限修饰符] abstract class 类名 {
 * 		类体
 * }
 * 
 * 定义抽象方法语法：
 * [权限修饰符] abstract 方法返回值类型 方法名(参数列表) ; 
 */
package cp7.SL11;

/*
 * P171页，介绍说明原则
 * 抽象类不能被直接实例化；
 * 抽象类被继承后，子类需要重写抽象类中所有的抽象方法；
 * 如果继承抽象类的子类也被声明为抽象类，则可以不用重写父类中所有的抽象方法。
 * */
public class Goshopping {
   
	public static void main(String[] args) {
		Market market = new WallMarket() ; // 使用派生类对象创建抽象类
		market.name = "沃尔玛" ; 
		market.goods = "七匹狼西服" ;
		market.shop();
		market = new TaoBaoMarket(); // 使用派生类对象创建抽象类对象
		market.name = "淘宝";
		market.goods = "韩都衣舍花裙";
		market.shop();  
		
		TaoBaoMarket one = new TaoBaoMarket();
		one.name = "淘宝one";
		one.goods = "one 衣舍花裙";
		one.shop();  
		
		
	}

}
