package cp8.SL02;

public class Demo {

	public static void main(String[] args) {
		
		for (int i = 0; i < 5; i++) {
			try {
			// 在for循环中，选中syso... ~ int 两行
			// 按 shift + alt + z ，选择第一项，
				// 自动生成try-catch
				System.out.println("输出"+i+"行");
				int a = 1 / i ;
			} catch (Exception e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}


	}

}
