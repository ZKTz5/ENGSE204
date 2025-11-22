package Lab;
import java.util.Scanner;

public class Lab13 {
    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        int r = kb.nextInt();
        int c = kb.nextInt();
        int[][] data = new int[r][c];

        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                data[i][j] = kb.nextInt();
            }
        }

        int ans = 0; 
        
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                if(data[i][j] == 1) {
                    ans = ans + 1;
                }
            }
        }

        System.out.println(ans);
        
        kb.close();
    }
}