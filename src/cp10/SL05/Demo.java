package cp10.SL05;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/*
 * Set: Set中不能有重复元素
 * Set接口：HashSet(散列集合)、TreeSet(树集合)
 * TreeSet：树状集合，存放有序。
 * #：要想指定集合的存放顺序，被排序的对象需实现Comparable接口。
 * 语法：
 *  	Set<E> set = new TreeSet<E>();   泛型可以省略
 * 
 * */
public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Set set = new TreeSet();
		Person p1 = new Person(1,18,"小明") ;
		Person p2 = new Person(2,13,"小2") ;
		Person p3 = new Person(3,14,"a吧") ;
		
		set.add(p1) ;
		set.add(p2) ;
		set.add(p3) ;
		System.out.println(set.size());
		set.add(p3) ;  // 重复的元素不会被添加到集合中
//		set.add(null) ;  // 报错，使用TreeSet不能添加null值
		System.out.println(set.size());
		
		Iterator iterator = set.iterator() ;
		while (iterator.hasNext()) {
			System.out.println(iterator.next()); // 自动调用对象的toString方法
		}
 	}

}
