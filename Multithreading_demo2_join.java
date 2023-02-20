class MyThread extends Thread {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread #1 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #1 is FINISHED :)");
	}
}

class MyRunnable implements Runnable {
	public void run() {
		for(int i=1; i<=10; i++) {
			System.out.println("Thread #2 : " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Thread #2 is FINISHED :)");
	}
}

public class test  {
	public static void main(String[] args) {
		
		MyThread thread1 = new MyThread();
		
		MyRunnable runnable = new MyRunnable();
		Thread thread2 = new Thread(runnable);
		
		thread1.start();
		
		try {
			thread1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		thread2.start();
	}
}

/*
Thread #1 : 1
Thread #1 : 2
Thread #1 : 3
Thread #1 : 4
Thread #1 : 5
Thread #1 : 6
Thread #1 : 7
Thread #1 : 8
Thread #1 : 9
Thread #1 : 10
Thread #1 is FINISHED :)
Thread #2 : 1
Thread #2 : 2
Thread #2 : 3
Thread #2 : 4
Thread #2 : 5
Thread #2 : 6
Thread #2 : 7
Thread #2 : 8
Thread #2 : 9
Thread #2 : 10
Thread #2 is FINISHED :)
*/
