package cp9.SL07;

import java.util.Date;

public class Demo {

	public static void main(String[] args) {
		Date date = new Date(); // 创建现在的日期
		long value = date.getTime(); // 获得毫秒数
		System.out.println("当前日期、时间：" + date);
		System.out.println("从基准时间到当前时间所经过的毫秒数为：" + value);
		// ctrl + shift + f 格式化代码
		long time = 1000 * 60 * 60 * 24 * 1;
		Date date2 = new Date(time);
		System.out.println(date2);
		
	}

}
