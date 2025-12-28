package Lab5_6;
import java.util.Scanner;

public class Media {
    protected String title;

    public Media(String title) {
        this.title = title;
    }

    public void process() {
        System.out.println("Starting generic media processing.");
    }
}

class Video extends Media {
    protected int duration;

    public Video(String title, int duration) {
        super(title);
        this.duration = duration;
    }

    @Override
    public void process() {
        System.out.println("Processing video: " + title + " for " + duration + " minutes.");
    }
}

class Audio extends Media {
    protected String quality;

    public Audio(String title, String quality) {
        super(title);
        this.quality = quality;
    }

    @Override
    public void process() {
        System.out.println("Processing audio: " + title + " with " + quality + " quality.");
    }
}

class Processor {
    public static void runProcessor(Media m) {
        m.process(); 
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String VdoTitle = kb.nextLine();
        int VdoDuration = kb.nextInt();
        kb.nextLine();

        String AudioTitle = kb.nextLine();
        String AudioQuality = kb.nextLine();

        Video Vdo1 = new Video(VdoTitle, VdoDuration);
        Audio Audio1 = new Audio(AudioTitle, AudioQuality);

        Processor.runProcessor(Vdo1);
        Processor.runProcessor(Audio1);

        kb.close();
    }
}