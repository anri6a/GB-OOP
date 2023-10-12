package seminar03Game;

import java.util.Scanner;

public class UserMenu {
    String choice = "";

    String selectGame() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Select your game:\n" +
                "1 - with numbers\n" +
                "2 - with EN alphabet\n" +
                "3 - with RU alphabet");
        choice = scanner.nextLine();
        return choice;
    }

    String printLog() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Do you want print GameLog - y/n");
        choice = scanner.nextLine();
        return choice;
    }
}
