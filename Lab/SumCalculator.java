import java.util.Scanner; // 1. นำเข้าคลาส Scanner

public class SumCalculator {
    public static void main(String[] args) {
        // 2. สร้างวัตถุ Scanner เพื่อรับข้อมูลจากผู้ใช้ (System.in)
        Scanner scanner = new Scanner(System.in);

        // 3. รับค่าจำนวนเต็มตัวแรก
        System.out.println("ป้อนจำนวนเต็มตัวที่ 1:");
        int num1 = scanner.nextInt();

        // 4. รับค่าจำนวนเต็มตัวที่สอง
        System.out.println("ป้อนจำนวนเต็มตัวที่ 2:");
        int num2 = scanner.nextInt();

        // 5. คำนวณผลบวก
        int sum = num1 + num2;

        // 6. แสดงผลลัพธ์
        System.out.println("--- ผลลัพธ์ ---");
        System.out.println("ผลบวกของ " + num1 + " และ " + num2 + " คือ: " + sum);
        
        // 7. ปิดวัตถุ Scanner
        scanner.close();
    }
}