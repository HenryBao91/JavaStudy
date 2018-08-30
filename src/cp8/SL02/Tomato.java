package cp8.SL02;
/**
 * try-catch异常处理，
 * 先子类异常，后父类异常
 * */
public class Tomato {			// 创建西红柿类

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			String message = "西红柿：2.99元/500g" ;  // 西红柿售价信息
			String[] strArr = message.split("：") ; // 使用“ ： ”拆分
			//  此处数组下标越界，应该是strArr[1]
			String unitPriceStr = strArr[2].substring(0,4) ; // 截取西红柿单价
			double weight = 650 ;  // 购买重量
			// 将String类型的西红柿单价转换成double类型
			double unitPriceDou = Double.parseDouble(unitPriceStr) ;
			// 输出顾客购买650g西红柿的金额
			System.out.println(message + "，顾客买了" + weight + "克的西红柿，须支付"
					+ (float) (weight / 500 * unitPriceDou) + "元");
		}catch (ArrayIndexOutOfBoundsException e) {
			// 捕捉数组元素下标越界异常对象
			e.printStackTrace();          
		}catch (Exception e) {
			// 捕捉与已产生的异常类型相匹配的异常对象
			e.printStackTrace();
		}
		System.out.println("Code Run Over !");
	}

}
