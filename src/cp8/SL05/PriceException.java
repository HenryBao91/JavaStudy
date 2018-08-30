package cp8.SL05;

class PriceException extends Exception { // 自定义价格异常类，并继承异常类
	public PriceException(String message) { // 创建价格异常类有参构造方法
		super(message); 	// 调用异常类的有参构造方法
	}
}