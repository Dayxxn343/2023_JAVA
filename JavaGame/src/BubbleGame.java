import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class BubbleGame extends JFrame implements ActionListener, MouseListener {
    private List<Bubble> bubbles;
    private Timer timer;
    private long startTime;
    private boolean gameOver;

    public BubbleGame() {
        setTitle("Bubble Game");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        bubbles = new ArrayList<>();
        timer = new Timer(10, this);

        addMouseListener(this);
    }

    public void startGame() {
        bubbles.clear();
        startTime = System.currentTimeMillis();
        gameOver = false;

        timer.start();

        // 거품 생성 스레드 시작
        Thread bubbleThread = new Thread(() -> {
            Random random = new Random();
            while (!gameOver) {
                int x = random.nextInt(getWidth() - 30);
                int y = 0;
                Bubble bubble = new Bubble(x, y);
                bubbles.add(bubble);

                // SwingUtilities.invokeLater 대신 직접 호출
                repaint();

                try {
                    Thread.sleep(1000); // 새로운 거품 생성 간격
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        bubbleThread.start();
    }


    public void actionPerformed(ActionEvent e) {
        // 모든 거품을 아래로 이동
        for (Bubble bubble : bubbles) {
            bubble.move();
        }

        // 충돌 체크
        checkCollisions();

        // 화면 다시 그리기
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.clearRect(0, 0, getWidth(), getHeight());

        // bubble
        for (Bubble bubble : bubbles) {
            bubble.draw(g);
        }

        // 게임 오버 메시지 표시
        if (gameOver) {
            long elapsedTime = System.currentTimeMillis() - startTime;
            g.drawString("Game Over! Your time: " + elapsedTime / 1000 + " seconds", 150, 200);
        }
    }

    private void checkCollisions() {
        // bubble을 누르지 못하고 게임오버될 때
        Iterator<Bubble> iterator = bubbles.iterator();
        while (iterator.hasNext()) {
            Bubble bubble = iterator.next();
            if (bubble.getY() >= getHeight()) {
                iterator.remove();
                if (!gameOver) {
                    gameOver = true;
                    timer.stop();
                    repaint();
                }
            }
        }
    }

    public void mouseClicked(MouseEvent e) {
        // bubble을 클릭하면 사라지는 코드
        Iterator<Bubble> iterator = bubbles.iterator();
        while (iterator.hasNext()) {
            Bubble bubble = iterator.next();
            if (bubble.contains(e.getX(), e.getY())) {
                iterator.remove();
            }
        }
    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BubbleGame game = new BubbleGame();
            game.setVisible(true);
            game.startGame();
        });
    }
}

class Bubble {
    private int x;
    private int y;
    private int size;
    private Image image;

    public Bubble(int x, int y) {
        this.x = x;
        this.y = y;
        this.size = 30;
        this.image = new ImageIcon("bubble.jpg").getImage();
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void move() {
        y += 1; // bubble이 내려오는 속도
    }

    public void draw(Graphics g) {
        g.drawImage(image, x, y, size, size, null);
    }
    
    public boolean contains(int mouseX, int mouseY) {
        // 이미지의 크기를 고려하여 클릭을 인식
        return mouseX >= x && mouseX <= x + 35 && mouseY >= y && mouseY <= y + 35;
    }

}
