package seminar03Game;

import java.lang.constant.Constable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class AbstractGame implements Game {
    Integer sizeWord;
    Integer maxTry;
    String computerWord;
    GameStatus gameStatus = GameStatus.INIT;
    List<Answer> listLog = new ArrayList<>();

    public AbstractGame() {
        super();
    }

    abstract ArrayList<String> generateCharList();

    @Override
    public void start(Integer sizeWord, Integer maxTry) {
        this.sizeWord = sizeWord;
        this.maxTry = maxTry;
        computerWord = generateWord();
        gameStatus = GameStatus.START;
        System.out.println("Computer generated word is - " + computerWord);
    }

    private String generateWord() {
        List<String> alphabet = generateCharList();
        Random random = new Random();
        String res = "";
        for (int i = 0; i < sizeWord; i++) {
            int randomIndex = random.nextInt(alphabet.size());
            res += alphabet.get(randomIndex);
            alphabet.remove(randomIndex);

        }
        return res;
    }

    @Override
    public Constable inputValue(String value) {
        int countBull = 0;
        int countCow = 0;
        for (int i = 0; i < value.length(); i++) {
            if (value.charAt(i) == computerWord.charAt(i)) {
                countBull++;
                countCow++;
            } else if (computerWord.contains(String.valueOf(value.charAt(i)))) {
                countCow++;
            }
        }
        if (countBull == computerWord.length()) {
            gameStatus = GameStatus.WIN;
        }
        maxTry--;
        if (maxTry == 0 && gameStatus != GameStatus.WIN) {
            gameStatus = GameStatus.LOSE;
        }
        Answer answer = new Answer(countBull, countCow, maxTry);
        listLog.add(answer);
        return value;
    }

    public List<Answer> getListLog() {
        return listLog;
    }

    @Override
    public GameStatus getGameStatus() {
        return gameStatus;
    }
}
