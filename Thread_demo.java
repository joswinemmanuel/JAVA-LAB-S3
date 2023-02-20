class T1 extends Thread {
	public void run() {
		System.out.println("T1 is running");
	}
}

public class test  {
	public static void main(String[] args) {
		
		//System.out.println(Thread.currentThread().getName());
		//Thread.currentThread().setName("MAAAAIN");
		//System.out.println(Thread.activeCount());
		//Thread.currentThread().setPriority(6);
		//System.out.println(Thread.currentThread().getPriority());
		//System.out.println(Thread.currentThread().isAlive());
		
		/*for(int i=0; i<10; i++) {
			try {
				Thread.sleep(1000);		// sleep for 1 second
			} catch (InterruptedException e) {
				e.printStackTrace();
			}  
			System.out.println(i);
		}*/
		
		
		T1 thread1 = new T1();
		thread1.start();
		System.out.println(thread1.isAlive());
		
		//System.out.println(thread1.isDaemon());
		//thread1.setDaemon(true);
		
	}
}
