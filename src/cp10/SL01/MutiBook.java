package cp10.SL01;

public class MutiBook<T> { // 定义带泛型的Book<T>类
	private T[] bookInfo; // 数组类型形参：书籍信息

	public MutiBook(T[] bookInfo) { // 参数为书籍信息的Book<T>类构造方法
		this.bookInfo = bookInfo; // 为书籍信息赋值
	}

	public void showBookInfo() { // 显示书籍信息的方法
		// 提示信息
		System.out.println("书名\t\t作者\t价格\t是否附赠光盘");
		System.out.println("-------------------------------------------");
		// 遍历并输出数组类型形参bookInfo中的元素
		for (int i = 0; i < bookInfo.length; i++) {
			System.out.print(bookInfo[i] + "\t");
		}
	}

	public static void main(String[] args) {
		// 把书名、作者、价格和是否附赠光盘存放在String类型的数组info中
		String[] info = { "《零基础学Java》", "明日科技", "69.80", "附赠光盘" };
		MutiBook<String> book = new MutiBook<String>(info); // 创建String类型的book对象
		book.showBookInfo(); // 调用显示书籍信息的方法
	}
}
