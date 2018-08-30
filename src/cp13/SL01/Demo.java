package cp13.SL01;
/*
1、进程是资源分频的最小单位，线程是最小的执行单位；
2、一个进程可以有多个线程；
3、线程共享进程资源。
Thread类：
重要方法：run()方法：线程运行时执行的方法
		  start()方法：使线程开始执行的方法	
语法：
	Thread t = new Thread() ;    创建一个新的线程对象。
	Thread t = new Thread(String name) ;  创建一个名称为name的线程对象。
步骤：
1、创建一个集成Thread类的子类；
2、覆写Thread类的run()方法；
3、创建线程类的一个对象；
4、通过线程类的对象调用start()方法启动线程(启动之后会自动调用覆写的run()方法执行线程)。	
	
	
 * */
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadA a = new ThreadA() ;
		a.start();
		ThreadB b = new ThreadB() ;
		b.start();
	}

}

class ThreadA extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i <= 100 ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);  // 休眠1s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
	}
}

class ThreadB extends Thread{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (char i = 'a'; i <= 'z' ; i++) {
			System.out.println(i);
			try {
				Thread.sleep(1000);  // 休眠1s
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}  
		}
	}
}

