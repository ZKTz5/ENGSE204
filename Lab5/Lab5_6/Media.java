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

        String vTitle = kb.nextLine();
        int vDuration = kb.nextInt();
        kb.nextLine();

        String aTitle = kb.nextLine();
        String aQuality = kb.nextLine();

        Video myVideo = new Video(vTitle, vDuration);
        Audio myAudio = new Audio(aTitle, aQuality);

        Processor.runProcessor(myVideo);
        Processor.runProcessor(myAudio);

        kb.close();
    }
}