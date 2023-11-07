package Gwajae;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class CountDownTest extends JFrame {
    private JLabel label;
    private Thread t;

    class Counter extends Thread {
        public void run() {
            for (int i = 0; i <= 10; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    return;
                }
                label.setText(i + "");
            }
        }
    }

    public CountDownTest() {
        setTitle("카운트다운");
        setSize(400, 150);
        getContentPane().setLayout(null);

        label = new JLabel("0");
        label.setBounds(0, 0, 384, 111);
        label.setFont(new Font("Serif", Font.BOLD, 100));
        getContentPane().add(label);

        JButton stopButton = new JButton("카운트 중지");
        stopButton.setBounds(247, 25, 125, 23);
        getContentPane().add(stopButton);

        JButton startButton = new JButton("카운트 다시 시작");
        startButton.setBounds(247, 60, 125, 23);
        getContentPane().add(startButton);

        stopButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (t != null) {
                    t.interrupt();
                }
            }
        });

        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                t = new Counter();
                t.start();
            }
        });

        setVisible(true);
        t = new Counter();
        t.start();
    }

	public static void main(String[] args) {
        CountDownTest t = new CountDownTest();
        t.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}