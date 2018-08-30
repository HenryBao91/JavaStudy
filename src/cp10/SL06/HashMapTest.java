package cp10.SL06;

import java.util.*;

public class HashMapTest {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>(); // 创建Map集合对象
		map.put("ISBN 978-7-5677-8742-1", "Android项目开发实战入门"); // 向Map集合中添加元素
		map.put("ISBN 978-7-5677-8741-4", "C语言项目开发实战入门");
		map.put("ISBN 978-7-5677-9097-1", "PHP项目开发实战入门");
		map.put("ISBN 978-7-5677-8740-7", "Java项目开发实战入门");
		Set<String> set = map.keySet(); // 构建Map集合中所有key的Set集合
		Iterator<String> it = set.iterator(); // 创建Iterator迭代器
		System.out.println("key值：");
		while (it.hasNext()) { // 遍历并输出Map集合中的key值
			System.out.print(it.next() + "　");
		}
		Collection<String> coll = map.values(); // 构建Map集合中所有value值的集合
		it = coll.iterator();
		System.out.println("\nvalue值：");
		while (it.hasNext()) { // 遍历并输出Map集合中的value值
			System.out.print(it.next() + "　");
		}
	}
}
