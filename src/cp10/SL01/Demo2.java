package cp10.SL01;

public class Demo2<T> {

	T over ;
	
	public T getOver() {
		return over;
	}

	public void setOver(T over) {
		this.over = over;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo2<Boolean> d1 = new Demo2<Boolean>() ;
		d1.setOver(true);
	//	d1.setOver(123);   // 报错，类型不符合
		Boolean b = d1.getOver() ;
		System.out.println(b);

		Demo2<Integer> d2 = new Demo2<Integer>() ;
		d2.setOver(100);
		Integer i = d2.getOver() ;
		System.out.println(i);

	}

}
