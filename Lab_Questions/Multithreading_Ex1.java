class MyThread extends Thread {
	public void run() {
		for(int i=5; i<=100; i+=5) {
			System.out.println("Thread 1 : " + i);
		}
		System.out.println("Thread 1 is OVER");
	}
}

class MyRunnable implements Runnable {
	public void run() {
		for(int i=10; i<=200; i+=10) {
			System.out.println("Thread 2 : " + i);
		}
		System.out.println("Thread 2 is OVER");
	}
	
}

public class test  {
	public static void main(String[] args) throws InterruptedException {
		MyThread thread_1 = new MyThread();
		
		MyRunnable runnable_1 = new MyRunnable();
		Thread thread_2 = new Thread(runnable_1);
		
		thread_1.setPriority(Thread.MAX_PRIORITY);
		thread_2.setPriority(Thread.MIN_PRIORITY);
		
		thread_1.start();
		thread_1.join();
		thread_2.start();
	}
}

/*
Thread 1 : 5
Thread 1 : 10
Thread 1 : 15
Thread 1 : 20
Thread 1 : 25
Thread 1 : 30
Thread 1 : 35
Thread 1 : 40
Thread 1 : 45
Thread 1 : 50
Thread 1 : 55
Thread 1 : 60
Thread 1 : 65
Thread 1 : 70
Thread 1 : 75
Thread 1 : 80
Thread 1 : 85
Thread 1 : 90
Thread 1 : 95
Thread 1 : 100
Thread 1 is OVER
Thread 2 : 10
Thread 2 : 20
Thread 2 : 30
Thread 2 : 40
Thread 2 : 50
Thread 2 : 60
Thread 2 : 70
Thread 2 : 80
Thread 2 : 90
Thread 2 : 100
Thread 2 : 110
Thread 2 : 120
Thread 2 : 130
Thread 2 : 140
Thread 2 : 150
Thread 2 : 160
Thread 2 : 170
Thread 2 : 180
Thread 2 : 190
Thread 2 : 200
Thread 2 is OVER
*/
