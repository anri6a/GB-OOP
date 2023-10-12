package seminar03Game;

import java.util.ArrayList;
import java.util.Arrays;

public class CharGameEN extends AbstractGame {
    @Override
    ArrayList<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("q", "w", "e", "r", "t", "y", "u", "i", "o", "p",
                "a", "s", "d", "f", "g", "h", "j", "k", "l", "z", "x", "c", "v", "b", "n", "m"));
    }
}
