package cp10.SL05;


public class Person implements Comparable{

	int id ;
	int age ;
	String name ;
	
	


	public Person(int id, int age, String name) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
	}




	@Override
	public String toString() {
		return "Person [id=" + id + ", age=" + age + ", name=" + name + "]";
	}




	@Override
	public int compareTo(Object o) {
		// TODO 自动生成的方法存根
		Person p ;
		if (o instanceof Person) {  // 属于Person类
			p = (Person)o ;
		}
		else {
			return -1 ; // -1代表传入的参数比我本身要小
		}
		// 安装id排序，更改this.id - p.id可以按其他属性排序
		int diff = this.id - p.id ;
		if (diff != 0) {
			diff = diff / Math.abs(diff) ; //得到+1或-1值
		}
		return diff;
	}

	
}
