package cp10.SL01;

public class Book<T> { // 定义带泛型的Book<T>类
	private T bookInfo; // 类型形参：书籍信息

	public Book(T bookInfo) { // 参数为书籍信息的Book<T>类构造方法
		this.bookInfo = bookInfo; // 为书籍信息赋值
	}
	
	public T getBookInfo() { 
		return bookInfo; 
	}
	
	public static void main(String[] args) {
		// 把书名、作者、价格和是否附赠光盘存放在String类型的数组info中
		Book<String> bookName = new Book<String>("《零基础学Java》"); // 创建String类型的book对象
		Book<String> bookAuthor = new Book<String>("明日科技"); // 创建String类型的book对象
		Book<Double> bookPrice = new Book<Double>( 69.80 );
		Book<Boolean> hasCD = new Book<Boolean>( true );

		System.out.println("书名：" + bookName.getBookInfo());
		System.out.println("作者：" + bookName.getBookInfo());
		System.out.println("价格：" + bookName.getBookInfo());
		System.out.println("是否送光盘：" + hasCD.getBookInfo());

	
	}
}
