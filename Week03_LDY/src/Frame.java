import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Frame  extends JFrame {
	public Frame() {

		setSize(600, 400);

		setTitle("MyFrame");

		setLayout(new FlowLayout());

		

		

		JPanel panel = new JPanel();

		add(panel);

		

		panel.add(new JLabel("이름"));

		panel.add(new JTextField(20));

		panel.add(new JLabel("패스워드"));

		panel.add(new JPasswordField(20));

		

		JButton button1 = new JButton("확인");

		JButton button2 = new JButton("취소");

		this.add(button1);

		this.add(button2);

		

		setVisible(true);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frame f = new Frame();

	}

}
