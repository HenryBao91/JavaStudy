package cp8.SL05;

public class Tomato { // 创建西红柿类
	private double price; // 西红柿单价

	public double getPrice() { // 获取西红柿单价
		return price;
	}
	
	// 设置西红柿单价，如果产生价格异常，那么就抛出价格异常
	public void setPrice(double price) throws PriceException {
		if (price > 7.0) { // 如果西红柿单价大于7元
			throw new PriceException("国家规定西红柿单价不得超过7元！！！"); // 抛出价格异常
		} else { // 如果西红柿单价不大于7元
			this.price = price; // 为西红柿类的price属性赋值
		}
	}

}
	
	
	