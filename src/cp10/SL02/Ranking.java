package cp10.SL02;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Ranking {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		// 将亚足联排名前10的男足国家队存储在数组中
		String[] teams = { "伊朗", "韩国", "日本", "澳大利亚", "沙特阿拉伯", "乌兹别克斯坦", "阿拉伯联合酋长国", "卡塔尔", "中国", "叙利亚" };
		// 创建键、值类型分别为Integer、String的Map集合对象
		Map<Integer, String> map = new HashMap<Integer, String>() ;
		// 循环遍历数组teams中的元素
		for (int i = 0; i < teams.length; i++) {
			map.put(i + 1, teams[i]);   // 向Map集合中添加元素
		}
		Scanner sc = new Scanner(System.in) ;  // 创建控制台输入对象
		// 提示信息
		System.out.print("依据输入的名次查询亚足联排名前10的某一支男足国家队：");
		try { // 可能产生异常的代码块
			int number = sc.nextInt(); // 控制台输入名次
			if (number > 0 && number <= 10) { // 输入的名次在0-10之间
				// 控制台输出与输入名次相匹配的国家
				System.out.println("亚足联排名第" + number + "的男足国家队是" + map.get(number) + "");
				sc.close(); // 关闭控制台输入
			} else { // 输入的名次不在0-10之间
				// 提示信息
				System.out.println("输入错误！只能输入1-10中的某一个整数。");
			}
		} catch (InputMismatchException e) { // 捕捉输入类型不匹配异常
			// 提示信息
			System.out.println("输入错误！只能输入1-10中的某一个整数。");
		}
	}

}
