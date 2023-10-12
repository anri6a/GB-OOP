package seminar03Game;

import java.lang.constant.Constable;
import java.util.List;

public interface Game {
    void start(Integer sizeWord, Integer maxTry);

    Constable inputValue(String value);

    GameStatus getGameStatus();

    List<Answer> getListLog();

}
