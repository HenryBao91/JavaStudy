package cp10.SL06;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.sun.org.apache.bcel.internal.generic.NEW;

/*
 * Map接口： Map<K,V>
 * 	HashMap类：散列码键值对速度更快
 * 	TreeMap类：树状键值对存放有序
 * 常用方法：put、constansKey、get、constansValue
 * 语法：
 * 	  Map<K,V> m = new HashMap<K,V>() ;
 * 	  Map<K,V> m = new TreeMap<K,V>() ;
 * */
public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Map map = new HashMap() ;
		
		map.put("String", "字符串") ;
		map.put("object", "对象") ;
		map.put("int", "123") ;
		map.put("数字", "123") ;
		map.put(1, "intyyy") ;
		map.put(new Object(), new Object()) ;
		map.put(null , null);
		
		System.out.println("map元素个数： "+ map.size());
		
		Set set = map.keySet() ;
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Object obj = iterator.next() ;
			System.out.println("key=" + obj + " value:" + map.get(obj));
		}
		
		System.out.println(map.get("int"));
	}

}
