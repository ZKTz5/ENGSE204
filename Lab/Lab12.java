package Lab;
import java.util.Scanner;

public class Lab12 {
   public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
    
         System.out.print("กรอกจำนวนชนิดสินค้า:");
         int n = scanner.nextInt();

        int[] productID = new int[n];
        int[] StockQuantity = new int[n];

        for(int i = 0 ; i < n ; i++){
            System.out.println("-----------------------");
            System.out.println("กรอกรหัสสินค้าชิ้นที่ " + (i + 1) + ": " );
            productID[i] = scanner.nextInt();
            System.out.println("กรอกจำนวนคงคลังของสินค้าชิ้นที่ " + (i + 1) + ": " );
            StockQuantity[i] = scanner.nextInt();
        }

        System.out.println("========================");
        System.out.print("รหัสสินค้าที่ต้องการค้นหา : ");
        int searchID = scanner.nextInt();

        for(int i = 0 ; i < n ; i++){
            if(productID[i] == searchID){
                System.out.println("จำนวนคงคลัง = "+ StockQuantity[i]);
                break;
            }
            else{
                System.out.println("Product " + searchID + " not found");
            }
        }
        
         scanner.close();
   }     
}
