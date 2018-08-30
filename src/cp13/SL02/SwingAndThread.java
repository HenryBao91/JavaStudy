package cp13.SL02;
/*
 * Runable接口
 * 语法：
 * 	public class ThreadTest extends object implements Runable
 * 构造方法：
 * 	public Thread(Runable target) 
 *  public Thread(Runable target,String name) 
 * */
import java.awt.Container;
import java.net.URL;
import javax.swing.*;

public class SwingAndThread extends JFrame implements Runnable{

	private JLabel jl = new JLabel(); // 声明JLabel对象
	private static Thread t; // 声明线程对象
	private int x = 0; // 声明可变化的横坐标
	private Container container = getContentPane(); // 声明容器
	
	
	public SwingAndThread() {
		setBounds(300, 200, 250, 100); // 绝对定位窗体大小与位置
		container.setLayout(null); // 使窗体不使用任何布局管理器
		try {
			// 获取本类同目录下图片的URL
			URL url = SwingAndThread.class.getResource("java.png");
			Icon icon = new ImageIcon(url); // 实例化一个Icon
			jl.setIcon(icon); // 将图标放置在标签中
		} catch (NullPointerException ex) { // 捕捉空指针异常
			System.out.println("图片不存在，请将java.png拷贝到当前目录下！");
			return; // 结束方法
		}
		// 设置图片在标签的最左方
		jl.setHorizontalAlignment(SwingConstants.LEFT);
		jl.setBounds(10, 10, 200, 50); // 设置标签的位置与大小
		jl.setOpaque(true);
		container.add(jl); // 将标签添加到容器中
		setVisible(true); // 使窗体可见
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // 设置窗体的关闭方式
	}
	
	public static void main(String[] args) {
		SwingAndThread frame = new SwingAndThread(); // 实例化一个SwingAndThread对象
		Thread thread = new Thread(frame) ;
		thread.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		int x = 10 ;
		while (true) { // 设置循环条件
			// 将标签的横坐标用变量表示
			jl.setBounds(x, 10, 200, 50);
			try {
				Thread.sleep(500);  // 使线程休眠500毫秒
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
			x += 4; // 使横坐标每次增加4
			if (x >= 200) {
				x = 10; // 当图标到达标签的最右边时，使其回到标签最左边
			}
		}
	}
	
}