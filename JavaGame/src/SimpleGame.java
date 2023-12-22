import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SimpleGame extends JFrame implements ActionListener, KeyListener {
    private int playerX = 50;
    private int playerY = 300;
    private Timer timer;

    public SimpleGame() {
        setTitle("Simple Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // 타이머 설정 및 시작
        timer = new Timer(10, this);
        timer.start();

        // 키보드 이벤트 리스너 등록
        addKeyListener(this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
    }

    // 타이머에 의해 주기적으로 호출되는 메서드
    public void actionPerformed(ActionEvent e) {
        playerX += 1; // 움직임 속도 조절
        repaint(); // 화면 다시 그리기
    }

    // 키를 타이핑했을 때 호출되는 메서드
    public void keyTyped(KeyEvent e) {
    }

    // 키를 눌렀을 때 호출되는 메서드
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_UP) {
            playerY -= 10; // 위로 이동
        } else if (keyCode == KeyEvent.VK_DOWN) {
            playerY += 10; // 아래로 이동
        }
    }

    // 키를 떼었을 때 호출되는 메서드
    public void keyReleased(KeyEvent e) {
    }

    // 그림을 그리는 메서드
    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());

        // 플레이어 사각형 그리기
        g.setColor(Color.RED);
        g.fillRect(playerX, playerY, 50, 50);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SimpleGame game = new SimpleGame();
            game.setVisible(true);
        });
    }
}