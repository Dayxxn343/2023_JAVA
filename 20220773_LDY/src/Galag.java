import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

class Spaceship {
    int x, y;

    Spaceship(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void moveLeft() {
        x--;
    }

    void moveRight() {
        x++;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

class Bullet {
    int x, y;
    boolean active;

    Bullet() {
        this.active = false;
    }

    void shoot(int x, int y) {
        this.x = x;
        this.y = y;
        this.active = true;
    }

    void move() {
        if (active) {
            y--;
            if (y < 0) {
                active = false;
            }
        }
    }

    boolean isActive() {
        return active;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

class Enemy {
    int x, y;
    boolean active;

    Enemy(int x, int y) {
        this.x = x;
        this.y = y;
        this.active = true;
    }

    void move() {
        y++;
        if (y >= 10) {
            active = false;
        }
    }

    boolean isActive() {
        return active;
    }

    int getX() {
        return x;
    }

    int getY() {
        return y;
    }
}

public class Galag {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Spaceship spaceship = new Spaceship(5, 9);
        List<Bullet> bullets = new ArrayList<>();
        List<Enemy> enemies = new ArrayList<>();

        // 초기 적 생성
        for (int i = 0; i < 5; i++) {
            enemies.add(new Enemy(random.nextInt(10), random.nextInt(3)));
        }

        boolean gameActive = true;

        while (gameActive) {
            // 사용자 입력 처리
            System.out.print("왼쪽(a), 오른쪽(d), 총알 발사(space): ");
            String input = scanner.nextLine();

            // 우주선 이동
            if (input.equals("a")) {
                spaceship.moveLeft();
            } else if (input.equals("d")) {
                spaceship.moveRight();
            } else if (input.equals("space")) {
                // 총알 발사
                bullets.add(new Bullet());
                bullets.get(bullets.size() - 1).shoot(spaceship.getX(), spaceship.getY());
            }

            // 모든 요소들 이동 및 업데이트
            for (Bullet bullet : bullets) {
                bullet.move();
            }

            for (Enemy enemy : enemies) {
                enemy.move();
            }

            // 충돌 체크
            for (Bullet bullet : bullets) {
                for (Enemy enemy : enemies) {
                    if (bullet.isActive() && enemy.isActive() &&
                            bullet.getX() == enemy.getX() && bullet.getY() == enemy.getY()) {
                        bullet.active = false;
                        enemy.active = false;
                    }
                }
            }

            // 화면 출력
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    boolean printSpace = true;

                    if (spaceship.getX() == j && spaceship.getY() == i) {
                        System.out.print("S");
                        printSpace = false;
                    }

                    for (Bullet bullet : bullets) {
                        if (bullet.isActive() && bullet.getX() == j && bullet.getY() == i) {
                            System.out.print("B");
                            printSpace = false;
                        }
                    }

                    for (Enemy enemy : enemies) {
                        if (enemy.isActive() && enemy.getX() == j && enemy.getY() == i) {
                            System.out.print("E");
                            printSpace = false;
                        }
                    }

                    if (printSpace) {
                        System.out.print(".");
                    }
                }
                System.out.println();
            }

            // 게임 종료 체크
            gameActive = false;
            for (Enemy enemy : enemies) {
                if (enemy.isActive()) {
                    gameActive = true;
                    break;
                }
            }

            try {
                Thread.sleep(500); // 0.5초마다 화면을 업데이트
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // 화면 지우기
            System.out.print("\033[H\033[2J");
            System.out.flush();
        }

        scanner.close();
    }
}