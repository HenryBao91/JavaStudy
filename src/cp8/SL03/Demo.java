package cp8.SL03;
/*
 * try-catch-finally
 * finall代码块有四种情况不会执行：
 * 1、finall代码块中发生异常。
 * 2、在前面代码中用了System.exit()。
 * 3、程序所在线程死亡。
 * 4、关闭CPU。
 * 
 * */
public class Demo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try {
			System.out.println("打开连接池");
			int a = 1/0 ;
			//System.exit(0);  // 强制停止当前程序
			System.out.println("通过连接池读取数据");
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}finally {
			System.out.println("关闭连接池");
		}
	}

}
