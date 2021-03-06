package cp10.SL04 ;

// 使用Iterator迭代器遍历List集合

import java.util.*; //导入java.util包，其他实例都要添加该语句

public class IteratorTest { // 创建类IteratorTest
	public static void main(String args[]) {
		Collection<String> list = new ArrayList<>(); // 实例化集合类对象
		list.add("a"); // 向集合添加数据
		list.add("b");
		list.add("c");
		
		Iterator<String> it = list.iterator(); // 创建迭代器
		while (it.hasNext()) { // 判断是否有下一个元素
			String str = (String) it.next(); // 获取集合中元素
			System.out.println(str);
		}
	}
}
