package Lab4.Lab4_7;
import java.util.Scanner;

public class Resource {
    private String id;

    public Resource(String id) {
        this.id = id;
        System.out.printf("Resource [%s] created.%n", id);
    }

    @Override
    protected void finalize() throws Throwable {
        try{
            System.out.printf("Resource [%s] finalized (destroyed).%n", id);
        }finally {
            super.finalize();
    }
}
}

class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String id1 = kb.nextLine();
        String id2 = kb.nextLine();
        String id3 = kb.nextLine();
        
        Resource r1 = new Resource(id1);
        Resource r2 = new Resource(id2);
        Resource r3 = new Resource(id3);

        r1 = null;
        r2 = null;
        System.gc();

        r3 = null;
        System.gc();

        kb.close();
    }
}