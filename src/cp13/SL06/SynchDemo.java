package cp13.SL06;
/*
 * 同步方法：synchronized void method(){ ...}
 * 同步代码块：synchronized(object){...} 
 * 	
 * 			采用同步代码块方法
 * */
public class SynchDemo implements Runnable{

	int num = 10;   // 票池
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		SynchDemo demo = new SynchDemo() ;
		Thread thread1 = new Thread(demo , "线程1") ;
		Thread thread2 = new Thread(demo , "线程2") ;
		Thread thread3 = new Thread(demo , "线程3") ;
		Thread thread4 = new Thread(demo , "线程4") ;
		thread1.start();
		thread2.start();
		thread3.start(); 
		thread4.start();

	}

	@Override
	public void run() {
		// TODO 自动生成的方法存根
		while (true) {
			synchronized (this) {  // 同步代码块
				if (num > 0) {
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						// TODO 自动生成的 catch 块
						e.printStackTrace();
					}
					System.out.println("票数："+num--);
				} 
			}
	
			
		}
	}

}
