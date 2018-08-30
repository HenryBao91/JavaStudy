package cp8.SL03;
/**
 * try-catch-finally 异常处理，
 * finally块：都会被执行
 * */
import java.util.Scanner;

public class Tomato2 { // 创建西红柿类
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); // 创建控制台输入对象
		System.out.println("今天的西红柿单价(单价格式为“3.00”)："); // 控制台输出提示信息
		String dayPrice = sc.next(); // 把控制台输入的西红柿单价赋值给变量dayPrice
		if (dayPrice.length() == 4) { // 控制台输入的字符串长度为4时
			try { // 把可能产生异常的Java代码放在try中
				String message = "西红柿：" + dayPrice + "元/500克"; // 西红柿的售价信息
				String[] strArr = message.split("："); // 使用"："拆分字符串
				String unitPriceStr = strArr[2].substring(0, 4); // 截取西红柿单价：2.99
				double weight = 650; // 顾客购买西红柿的重量
				// 将String类型的西红柿单价转换为double类型
				double unitPriceDou = Double.parseDouble(unitPriceStr);
				// 输出顾客购买650克的西红柿需支付的金额
				System.out.println(message + "，顾客买了" + weight + "克的西红柿，须支付"
						+ (float) (weight / 500 * unitPriceDou) + "元");
			} catch (ArrayIndexOutOfBoundsException e) {// 捕捉数组元素下标越界异常对象
				e.printStackTrace();
			} catch (Exception e) { // 捕捉与已产生的异常类型相匹配的异常对象
				e.printStackTrace();
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
