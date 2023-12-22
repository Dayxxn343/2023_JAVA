import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GalagaGame extends JFrame implements ActionListener, KeyListener {
    private Timer timer;
    private int playerX, playerY;
    private boolean shooting;
    private List<Enemy> enemies;

    public GalagaGame() {
        setTitle("Galaga Game");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        playerX = 400;
        playerY = 500;
        shooting = false;
        enemies = new ArrayList<>();

        // 적 비행기 추가
        enemies.add(new Enemy(100, 50));
        enemies.add(new Enemy(200, 50));
        enemies.add(new Enemy(300, 50));

        addKeyListener(this);

        timer = new Timer(10, this);
        timer.start();
    }

    public void paint(Graphics g) {
        super.paint(g);

        // 플레이어 그리기
        ImageIcon playerIcon = new ImageIcon("res/player.png");
        Image playerImage = playerIcon.getImage();
        g.drawImage(playerImage, playerX, playerY, this);

        // 적 비행기 그리기
        for (Enemy enemy : enemies) {
            ImageIcon enemyIcon = enemy.getImageIcon();
            Image enemyImage = enemyIcon.getImage();
            g.drawImage(enemyImage, enemy.getX(), enemy.getY(), this);
        }

        // 총알 그리기
        if (shooting) {
            ImageIcon bulletIcon = new ImageIcon("res/bullet.png");
            Image bulletImage = bulletIcon.getImage();
            g.drawImage(bulletImage, playerX + 20, playerY - 20, this);
        }

        Toolkit.getDefaultToolkit().sync();
        g.dispose();
    }

    public void actionPerformed(ActionEvent e) {
        // 게임 로직 업데이트
        if (shooting) {
            playerY -= 5; // 총알이 위로 이동하도록

            // 총알과 적 비행기 충돌 체크
            Iterator<Enemy> iterator = enemies.iterator();
            while (iterator.hasNext()) {
                Enemy enemy = iterator.next();
                Rectangle bulletRect = new Rectangle(playerX + 20, playerY - 20, 10, 20);
                Rectangle enemyRect = new Rectangle(enemy.getX(), enemy.getY(), 30, 30);

                if (bulletRect.intersects(enemyRect)) {
                    // 충돌 시 총알과 적 제거
                    iterator.remove();
                    shooting = false;
                }
            }

            if (playerY < 0) {
                shooting = false; // 총알이 화면 밖으로 나가면 총알 발사 종료
            }
        }

        repaint();
    }

    public void keyPressed(KeyEvent e) {
        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT && playerX > 0) {
            playerX -= 5;
        } else if (key == KeyEvent.VK_RIGHT && playerX < 750) {
            playerX += 5;
        } else if (key == KeyEvent.VK_SPACE && !shooting) {
            shooting = true;
        }
    }

    public void keyReleased(KeyEvent e) {
        // 키 릴리즈 이벤트 처리 (필요시 구현)
    }

    public void keyTyped(KeyEvent e) {
        // 키 타이핑 이벤트 처리 (필요시 구현)
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GalagaGame game = new GalagaGame();
            game.setVisible(true);
        });
    }
}