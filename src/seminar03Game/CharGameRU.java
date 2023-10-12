package seminar03Game;

import java.util.ArrayList;
import java.util.Arrays;

public class CharGameRU extends AbstractGame {
    @Override
    ArrayList<String> generateCharList() {
        return new ArrayList<>(Arrays.asList("ц", "й", "у", "к", "е", "н", "г", "ш", "щ", "з", "д", "л",
                "о", "р", "п", "а", "в", "ы", "ф", "я", "ч", "с", "м", "и", "т", "ь", "б", "ю"));
    }
}
