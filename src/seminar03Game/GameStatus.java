package seminar03Game;

public enum GameStatus {
    INIT("Game initialized"),
    START("Game started"),
    WIN("You are WIN!!!"),
    LOSE("You are Lose...");
    private String statusDescription;

    GameStatus(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    public String getStatusDescription() {
        return statusDescription;
    }
}
