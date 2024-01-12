package Day12;

class BreadPlate {
	private int cnt;			//행의 개수
	public void make() {
		if(cnt > 10) {
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			cnt ++;
			System.out.println("빵 생산 : " + cnt);
			notifyAll();
		}
	}
	public synchronized 
	void eat() {				// --
		if(cnt < 1) {
			try {
				wait();
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
		} else {
			cnt --;
			System.out.println("빵 소비 : " + cnt);
			notifyAll();
		}
	}
}//BreadPlate

class BreadMaker extends Thread {
	BreadPlate bp;
	public BreadMaker(BreadPlate bp) {
		this.bp = bp;
	}
	public void run() {
		for(int i = 0; i<20; i++) {
			bp.make();
		}
	}
} // class BreadMaker

class BreadEater extends Thread {
	BreadPlate bp;
	public BreadEater(BreadPlate bp) {
		this.bp = bp;
	}
	public void run() {
		for(int i = 0; i<20; i++) {
			bp.eat();
		}
	}
	
} // class BreadEater
public class ThreadEx3 {

	public static void main(String[] args) {
		BreadPlate bp = new BreadPlate();
		BreadMaker bm1 = new BreadMaker(bp) ;
		BreadEater be1 = new BreadEater(bp);
		
		bm1.start();
		be1.start();
		
	}

}
