package Lab1;
import java.util.Scanner;

public class Lab14 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int r = kb.nextInt();
        int c = kb.nextInt();
        char[][] map = new char[r][c];
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                map[i][j] = kb.next().charAt(0);
            }
        }
        int tr = kb.nextInt();
        int tc = kb.nextInt();
        if(map[tr][tc] == '*') {
            System.out.println("Mine");
        } 
        else {
            int count = 0;
            for(int i = tr - 1; i <= tr + 1; i++) {
                for(int j = tc - 1; j <= tc + 1; j++) {
                    if(i >= 0 && i < r && j >= 0 && j < c) {
                        if(map[i][j] == '*') {
                            count = count + 1;
                        }
                    }
                }
            }
            System.out.println(count);
        }
        
        kb.close();
    }
}