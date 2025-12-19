package Lab4.Lab4_6;
import java.util.Scanner;

public class Point {
    private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x; }
    public int getY() { return y; }

    public Point move(int dx, int dy) {
        int newX = this.x + dx;
        int newY = this.y + dy;
        return new Point(newX, newY);
    }

    public void displayInfo() {
        System.out.printf("(%s, %s)%n",x ,y);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        int x = kb.nextInt();
        int y = kb.nextInt();
        int dx = kb.nextInt();
        int dy = kb.nextInt();
        kb.close();

        Point p1 = new Point(x,y);
        Point p2 = p1.move(dx, dy);
        Point p3 = p2.move(dx, dy);

        p1.displayInfo();
        p2.displayInfo();
        p3.displayInfo();
    }
}
