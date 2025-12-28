package Lab5_11;
import java.util.Scanner;

public class Document {
    protected String title;

    public Document(String title) {
        this.title = title;
    }

    public void displayDetails() {
        System.out.println("Document: " + title);
    }
}

class TextDocument extends Document {
    protected int wordCount;

    public TextDocument(String title, int wordCount) {
        super(title);
        this.wordCount = wordCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("Text: " + title + ", Words: " + wordCount);
    }
}

class PDFDocument extends Document {
    protected int pageCount;

    public PDFDocument(String title, int pageCount) {
        super(title);
        this.pageCount = pageCount;
    }

    @Override
    public void displayDetails() {
        System.out.println("PDF: " + title + ", Pages: " + pageCount);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String t1Title = kb.nextLine();
        int t1Words = kb.nextInt();
        kb.nextLine();

        String p1Title = kb.nextLine();
        int p1Pages = kb.nextInt();
        kb.nextLine();

        String t2Title = kb.nextLine();
        int t2Words = kb.nextInt();
        kb.nextLine();

        String p2Title = kb.nextLine();
        int p2Pages = kb.nextInt();

        Document[] docs = new Document[4];
        docs[0] = new TextDocument(t1Title, t1Words);
        docs[1] = new PDFDocument(p1Title, p1Pages);
        docs[2] = new TextDocument(t2Title, t2Words);
        docs[3] = new PDFDocument(p2Title, p2Pages);

        int totalPages = 0;

        for (Document d : docs) {
            if (d instanceof PDFDocument) {
                PDFDocument pdf = (PDFDocument) d;
                totalPages = totalPages + pdf.pageCount;
            }
        }

        for (Document d : docs) {
            d.displayDetails();
        }

        System.out.println("Total Pages: " + totalPages);

        kb.close();
    }
}