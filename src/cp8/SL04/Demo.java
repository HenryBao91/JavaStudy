package cp8.SL04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Scanner sc = new Scanner(System.in); // 创建控制台输入对象
		System.out.println("今天的西红柿单价(单价格式为“3.00”)："); // 控制台输出提示信息
		String dayPrice = sc.next(); // 把控制台输入的西红柿单价赋值给变量dayPrice
		if (dayPrice.length() == 4) { // 控制台输入的字符串长度为4时
			double weight = 650; // 顾客购买西红柿的重量
			try { // 把可能产生异常的Java代码放在try中
				Tomato tomato = new Tomato();
				tomato.pay(dayPrice, weight);
			} catch (ArrayIndexOutOfBoundsException aiobe) {// 捕捉数组元素下标越界异常对象
				System.out.println("pay方法抛出数组元素下标越界异常！"); // 输出提示信息
			} finally {
				sc.close(); // 关闭控制台输入对象
				System.out.println("控制台输入对象被关闭。"); // 输出提示信息
			}
		} else { // 控制台输入的字符串长度不为4时
			// 输出提示信息
			System.out.println("违规操作：" + "输入西红柿单价时小数点后须保留两位有效数字（如3.00）！");
		}
	}
}
