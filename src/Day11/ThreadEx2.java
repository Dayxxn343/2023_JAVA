package Day11;

import java.util.Calendar;

class Thread1 extends Thread {
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println(Calendar.getInstance().get(Calendar.SECOND) + "Thread1");
			try {
			Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread2 extends Thread {
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println(Calendar.getInstance().get(Calendar.SECOND) + "Thread2");
			try {
			Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Thread3 extends Thread {
	public void run() {
		for (int i = 0; i<5; i++) {
			System.out.println(Calendar.getInstance().get(Calendar.SECOND) + "Thread3");
			try {
			Thread.sleep(1000);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}


public class ThreadEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();
		Thread3 t3 = new Thread3();
		
//		t3.setPriority(Thread.MAX_PRIORITY);
//		t1.setPriority(Thread.MAX_PRIORITY);
		
		t1.start();
		try {
			t1.join();
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		t2.start();
		t3.start();
		

	}

}
