package cp13.SL04;
/*
 * 线程的操作：
 * 1、线程的休眠：sleep()
 * 2、线程的加入：join()
 * 3、线程的中断：interrupt()
 * 
 * */
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class JoinTest extends JFrame {
	private static final long serialVersionUID = 1L;
	
	private Thread threadA; // 定义两个线程
	private Thread threadB;
	
	final JProgressBar progressBar = new JProgressBar(); // 定义两个进度条组件
	final JProgressBar progressBar2 = new JProgressBar();
	
	int count = 0;

	public static void main(String[] args) {
		new JoinTest();
	}

	public JoinTest() {
		super();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗体后停止程序
		setSize(100, 100); // 设定窗体宽高
		setVisible(true); // 窗体可见
		// 将进度条1设置在窗体最北面
		getContentPane().add(progressBar, BorderLayout.NORTH);
		// 将进度条2设置在窗体最南面
		getContentPane().add(progressBar2, BorderLayout.SOUTH);
		
		progressBar.setStringPainted(true); // 设置进度条显示数字字符
		progressBar2.setStringPainted(true);
		
		// 使用匿名内部类形式初始化Thread实例,相当于 ：
		//  new  obj ;
		//  class obj implements Runable d{...}
		// 等价于匿名内部类：  new Thread(new Runnable() {...}
		threadA = new Thread(new Runnable() {
			int count = 0;
			public void run() { // 重写run()方法
				while (true) {
					progressBar.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100); // 使线程A休眠100毫秒
						if (count == 20) {
							// 线程A暂停，执行线程B
							threadB.join(); // 使线程B调用join()方法
							
						}
					} catch (Exception e) {
						e.printStackTrace();
					}
				}
			}
		});
		threadA.start(); // 启动线程A
		
		// 使用匿名内部类形式初始化Thread实例	
		threadB = new Thread(new Runnable() {
			int count = 0;
			public void run() {
				while (true) {
					progressBar2.setValue(++count); // 设置进度条的当前值
					try {
						Thread.sleep(100); // 使线程B休眠100毫秒
					} catch (Exception e) {
						e.printStackTrace();
					}
					// 跳出循环，线程A才会继续执行
					if (count == 100) // 当count变量增长为100时
						break; // 跳出循环
				}
			}
		});
		threadB.start(); // 启动线程B
	}
}

