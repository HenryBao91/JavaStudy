package cp10.SL03;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * 	ArrayList：更善于查找
	LinkedList：更善于添加和删除
	语法：
	List<T> list = new ArrayList<T>() ;  
	List<T> list = new LinkedList<T>() ;
	 其中，泛型可省略，如new ArrayList() ;
 */

import java.util.List;

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		List list = new ArrayList() ;
		
		list.add("hello")  ;  //0
		list.add("you")  ;    //1
		list.add("me")  ;     //2
		
		System.out.println(list.size());
		list.remove(1) ;
		System.out.println(list.size());

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		
		list.add(1, "添加一句話");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("---------------------");
		
		list.set(1, "修改一句話");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));			
		}
		System.out.println("---------------------");
		
		list.add(null)  ;
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));			
		}
	}

}
