package cp10.SL01;

public class Demo1 {

	// 右键，source，添加get、set方法
	Object over ;

	public Object getOver() {
		return over;
	}

	public void setOver(Object over) {
		this.over = over;
	}
	
	public static void main(String[] args) {
		
		Demo1 demo1 = new Demo1() ;
		Demo1 demo2 = new Demo1() ;

		demo1.setOver(true);
		demo2.setOver(12.3F);
		// 类型不一致
//		boolean b = demo1.getOver() ;// 报错
		boolean b = (boolean)demo1.getOver() ;  // 强制转换
		System.out.println(b);
	}

}
