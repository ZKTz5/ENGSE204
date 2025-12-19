package Lab4.Lab4_5;
import java.util.Scanner;

public class Color {
    private int red;
    private int green;
    private int blue;

    public Color(int r, int g, int b) {
        this.red = validate(r);
        this.green = validate(g);
        this.blue = validate(b);
    }

    private int validate(int value) {
        if (value < 0) return 0;
        if (value > 255) return 255;
        return value;
    }

    public int getRed() { return red; }
    public int getGreen() { return red; }
    public int getBlue() { return red; }

    public void displayRGB() {
        System.out.printf("R=%d, G=%d, B=%d%n", red, green, blue);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        
        int red = kb.nextInt();
        int green = kb.nextInt();
        int blue = kb.nextInt();

        Color color1 = new Color(red, green, blue);

        color1.displayRGB();

        kb.close();
    }
}
