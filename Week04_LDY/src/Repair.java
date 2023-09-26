import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.BoxLayout;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class Repair extends JPanel implements ItemListener{
	JCheckBox[] buttons = new JCheckBox[4];
	String[] items = { "엔진오일 교환", "자동변속기오일교환", "에어콘필터교환", "타이어교환"};
	int[] prices = {45000, 80000, 30000, 100000};
	int money=0;
	JLabel label;
	
	public Repair() {
		super();
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS)); // 세로로 컴포넌트를 배치

        // 체크박스를 생성하고 리스너를 등록
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JCheckBox(items[i]);
            buttons[i].addItemListener(this);
            add(buttons[i]);
        }

        label = new JLabel("Total: 0원");
        add(label);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        int total = 0;

        // 체크박스의 상태를 확인하고 선택된 항목의 가격을 누적
        for (int i = 0; i < buttons.length; i++) {
            if (buttons[i].isSelected()) {
                total += prices[i];
            }
        }

        // 누적된 가격을 라벨에 업데이트
        label.setText("Total: " + total + "원");
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new JFrame("Repair");
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.add(new Repair());
                frame.pack();
                frame.setVisible(true);
            }
        });

	}

}
