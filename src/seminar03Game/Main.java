package seminar03Game;

import java.lang.constant.Constable;
import java.util.Scanner;

public class Main {
    static Game game;

    public static void main(String[] args) {
        UserMenu userMenu = new UserMenu();

        switch (userMenu.selectGame()) {
            case "1" -> game = new NumberGame();
            case "2" -> game = new CharGameEN();
            case "3" -> game = new CharGameRU();
            default -> System.out.println("wrong choice");
        }

        game.start(5, 2);
        while (game.getGameStatus() != GameStatus.WIN && game.getGameStatus() != GameStatus.LOSE) {
            Scanner scanner = new Scanner(System.in);

            // Answer answer = game.inputValue(scanner.nextLine());
            Constable answer = game.inputValue(scanner.nextLine());
            System.out.println("Your answer is  " + answer);
        }
        System.out.println(game.getGameStatus().getStatusDescription());
        switch (userMenu.printLog()) {
            case "y" -> System.out.println("Log of the game is - \n" + game.getListLog());
            default -> System.out.println("bue");
        }
    }


}
