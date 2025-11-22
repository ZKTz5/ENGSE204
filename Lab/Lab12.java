package Lab;
import java.util.Scanner;

public class Lab12 {
   public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

         int n = scanner.nextInt();

        int[] productID = new int[n];
        int[] StockQuantity = new int[n];

        for(int i = 0 ; i < n ; i++){
            productID[i] = scanner.nextInt();
            StockQuantity[i] = scanner.nextInt();
        }

        int searchID = scanner.nextInt();

        boolean found = false;
        for(int i = 0 ; i < n ; i++){
            if(productID[i] == searchID){
                found = true;
                break;
            }
        }
        
        if (found == false) {
            System.out.println("Product " + searchID + " not found");
        }
        
         scanner.close();
   }     
}
