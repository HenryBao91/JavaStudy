package cp8.SL04;

public class Tomato { // 创建西红柿类

	// 参数为西红柿单价和西红柿重量的支付方法，且支付方法抛出了数组元素下标越界异常
		public void pay(String dayPrice, double weight) throws ArrayIndexOutOfBoundsException {
			String message = "西红柿：" + dayPrice + "元/500克"; // 西红柿的售价信息
			String[] strArr = message.split("："); // 使用"："拆分字符串
			String unitPriceStr = strArr[2].substring(0, 4); // 截取西红柿单价：2.99
			// 将String类型的西红柿单价转换为double类型
			double unitPriceDou = Double.parseDouble(unitPriceStr);
			// 输出顾客购买650克的西红柿需支付的金额
			System.out.println(message + "，顾客买了" + weight + "克的西红柿，须支付"
					+ (float) (weight / 500 * unitPriceDou) + "元");
		}
}
