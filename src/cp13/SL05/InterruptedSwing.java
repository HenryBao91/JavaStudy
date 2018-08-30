package cp13.SL05;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class InterruptedSwing extends JFrame {
	Thread thread;

	public static void main(String[] args) {
		new InterruptedSwing();
	}

	public InterruptedSwing() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 关闭窗体后停止程序
		setSize(100, 100); // 设定窗体宽高
		setVisible(true); // 窗体可见
		final JProgressBar progressBar = new JProgressBar(); // 创建进度条
		// 将进度条放置在窗体合适位置
		getContentPane().add(progressBar, BorderLayout.NORTH);
		progressBar.setStringPainted(true); // 设置进度条上显示数字
		
		// 使用匿名内部类方式创建线程对象
		thread = new Thread() { 
			int count = 0;
			// 重写run()方法
			public void run() {
				while (true) {
					progressBar.setValue(++count); // 设置进度条的当前值
					try {
						if (count == 50) {
							// 最好使用this，代表指代的是匿名内部类
							// 此处不用this也不会出错
							this.interrupt(); // 执行线程停止方法
						}
						Thread.sleep(100); // 使线程休眠100豪秒
					} catch (InterruptedException e) {// 捕捉InterruptedException异常
						System.out.println("当前线程被中断");
						break;
					}
				}
			}
		};
		thread.start(); // 启动线程
	}
}
