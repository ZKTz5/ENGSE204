package Lab4.Lab4_11;
import java.util.Scanner;

public class Configuration {
    private final String theme;
    private final int fontSize;
    private final boolean darkMode;

    public Configuration (String theme, int fontSize, boolean darkMode) {
            this.theme = theme;
            if (fontSize < 10) {
            this.fontSize = 10;
        } else if (fontSize > 20) {
            this.fontSize = 20;
        } else {
            this.fontSize = fontSize;
        }
        this.darkMode = darkMode;
    }

    public Configuration (Configuration base, Configuration user) {
        this.theme = user.theme;
        this.darkMode = user.darkMode;
        this.fontSize = base.fontSize;
    }

    public void displaySetting() {
        System.out.printf("Theme: %s, Size: %s, Dark: %s%n", theme, fontSize, darkMode);
    }
}

class Main{
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String baseTheme = kb.nextLine();
        int baseSize = kb.nextInt();
        boolean baseDark = kb.nextBoolean();
        kb.nextLine();
        String userTheme = kb.nextLine();
        int userSize = kb.nextInt();
        boolean userDark = kb.nextBoolean();

        Configuration baseConfig = new Configuration(baseTheme, baseSize, baseDark);
        Configuration userConfig = new Configuration(userTheme, userSize, userDark);

        Configuration finalConfig = new Configuration(baseConfig, userConfig);

        finalConfig.displaySetting();

        kb.close();
    }
}