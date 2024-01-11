package Day11;

import java.util.Calendar;

import javax.swing.JFrame;
import javax.swing.JLabel;

//하나의 프로세스 안에서 미리 작업을 동시에 할 때
class ThreadOne extends Thread {
	public void run() {
		int i=0;
		while(true) {
			i++;
			System.out.println("i : " + i);
		}
	}
}

class ThreadTwo extends JFrame implements Runnable {
	private JLabel label;
	public ThreadTwo() {
		setBounds(300, 200, 500, 300);
		setVisible(true);
		label = new JLabel("", JLabel.CENTER);
		add(label);
	}
	public void run() {
		while(true) {
			String hour = Calendar.getInstance().get(Calendar.HOUR)
			+ " : " + Calendar.getInstance().get(Calendar.MINUTE)
			+ " : " + Calendar.getInstance().get(Calendar.SECOND);
			label.setText(hour);
		}
	}
}

//스레드를 상속받을 수 없다면 러너블을 상속받아라
//스레드를 상속 받으면 바로 start()할 수 있음
//그러나 러너블을 상속 받으면 스레드 객체에게 전달해서 start
public class ThreadEx1 {

	public static void main(String[] args) {
		ThreadOne to = new ThreadOne();
		to.start();		//실행대기
		
		ThreadTwo tt = new ThreadTwo();
		Thread t = new Thread(tt);
		
		t.start();
		
	}

}
