package Multithreading;

class Demo implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
		for (int i = 0; i < 10; i++) {
			System.out.print(" "+i);
		}
	}
}

public class JoinMethodDemo {

	public static void main(String[] args) throws InterruptedException {
		Demo d1 = new Demo();
		Demo d2 = new Demo();

		Thread t = new Thread(d1);
		System.out.println(t.getName());
		Thread t1 = new Thread(d1);
		System.out.println(t.getName());
		t.start();
		t.join();
		t1.start();
		t1.join();
	}
}
