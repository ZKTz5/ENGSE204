package Lab5_6;
import java.util.Scanner;

// Superclass สำหรับเก็บข้อมูลสื่อพื้นฐาน
public class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

// Subclass สำหรับจัดการไฟล์วิดีโอ
class Video extends Media {
    protected int duration;

    public Video(String title, int duration) {
        super(title); // ส่งชื่อเรื่องไปให้คลาสแม่จัดการ
        this.duration = duration;
    }

    @Override
    public void process() {
        // แสดงผลการประมวลผลวิดีโอพร้อมระบุเวลา
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

// Subclass สำหรับจัดการไฟล์เสียง
class Audio extends Media {
    protected String quality;

    public Audio(String title, String quality) {
        super(title); // ส่งชื่อเรื่องไปให้คลาสแม่จัดการ
        this.quality = quality;
    }

    @Override
    public void process() {
        // แสดงผลการประมวลผลเสียงพร้อมระบุคุณภาพ
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

// Utility Class สำหรับรันกระบวนการผ่าน Polymorphism
class Processor {
    public static void runProcessor(Media m) {
        // เรียกใช้เมธอดตามประเภทออบเจ็กต์จริงที่ส่งเข้ามา
        m.process(); 
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        // รับข้อมูลวิดีโอ
        String vTitle = kb.nextLine();
        int vDuration = kb.nextInt();
        kb.nextLine(); // เคลียร์ buffer หลังรับตัวเลข

        // รับข้อมูลเสียง
        String aTitle = kb.nextLine();
        String aQuality = kb.nextLine();

        Video myVideo = new Video(vTitle, vDuration);
        Audio myAudio = new Audio(aTitle, aQuality);

        // ประมวลผลผ่านเมธอดที่รับ Parameter เป็นคลาสแม่
        Processor.runProcessor(myVideo);
        Processor.runProcessor(myAudio);

        kb.close();
    }
}