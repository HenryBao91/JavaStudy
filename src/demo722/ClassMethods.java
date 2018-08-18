package demo722;

class V {}

public class ClassMethods {
	
	public String toString() {
		return "Say " + getClass().getName() ;
	}
	public static void main(String[] args) {

		System.out.println(new ClassMethods());	
		
		String s1 = new String("123") ;  // 实例化两个对象，内容相同
		String s2 = new String("123") ;
		System.out.println(s1.equals(s2) ); // 使用equals方法
		V v1 = new V();			// 实例化两个V类对象
		V v2 = new V();
		System.out.println(v1.equals(v2));

	}

}
