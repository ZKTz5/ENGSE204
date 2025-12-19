    package Lab4.Lab4_3;
    import java.util.Scanner;

    public class Player {
        private String username;
        private int level;

        public Player() {
            this.username = "Guest";
            this.level = 1;
        }

        public Player(String username, int level) {
            this.username = username;
            this.level = level;
        }

        public void displayProfile() {
            System.out.printf("User: %s, Level: %d", username, level);
        }
    }

    class Main{
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            
            int mode = kb.nextInt();
            kb.nextLine();

            if (mode == 1) {
                Player p = new Player();
                p.displayProfile();
            }else if (mode == 2) {
                String username = kb.nextLine();
                int level = kb.nextInt();
                Player p = new Player(username, level);
                p.displayProfile();
            }
            kb.close();
        }
    }