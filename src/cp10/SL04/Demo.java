package cp10.SL04;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.sun.org.apache.bcel.internal.generic.NEW;

/**
	List、Set都可以返回Iterator对象
	语法：
		Iterator<E> i = list.iterator() ;
		<E>：泛型，可以省略；
		list：Collection的任意子类对象。
	常用方法：hasNext()、next()
 * */

public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Collection c = new ArrayList() ;
		c.add("a") ;
		c.add("b") ;
		c.add("c") ;
		c.add(123465) ;
		c.add(new Object()) ;

		Iterator it = c.iterator() ;  // 创建迭代器
		while (it.hasNext()) {  // 取出来的是一个object
			Object object = it.next();
			System.out.println(object);
		}
	}

}
