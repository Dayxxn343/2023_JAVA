import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Game {
    private JFrame frame;
    private int 정답;
    private int 시도횟수;
    private JLabel 힌트Label;

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Game window = new Game();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Game() {
        initialize();
        resetGame();
    }

    private void resetGame() {
        Random random = new Random();
        정답 = random.nextInt(100) + 1;
        시도횟수 = 0;
        힌트Label.setText("1부터 100 사이의 숫자를 맞춰보세요.");
    }

    private void checkGuess(int 사용자입력) {
        시도횟수++;

        if (사용자입력 < 정답) {
            힌트Label.setText("더 큰 숫자를 입력하세요.");
        } else if (사용자입력 > 정답) {
            힌트Label.setText("더 작은 숫자를 입력하세요.");
        } else {
            힌트Label.setText("축하합니다! 정답입니다. 시도 횟수: " + 시도횟수);
            resetGame();
        }
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(new FlowLayout());

        JTextField 입력TextField = new JTextField(10);
        JButton 확인Button = new JButton("확인");
        힌트Label = new JLabel();

        확인Button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String 입력 = 입력TextField.getText();
                if (!입력.isEmpty()) {
                    int 사용자입력 = Integer.parseInt(입력);
                    checkGuess(사용자입력);
                }
            }
        });

        frame.getContentPane().add(입력TextField);
        frame.getContentPane().add(확인Button);
        frame.getContentPane().add(힌트Label);
    }
}