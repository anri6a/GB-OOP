package seminar03Fruts;

public enum Fruit {
    ORANGE ("apelsin"),
    APPLE ("yabloko"),
    BANANA ("banan"),
    PINEAPPLE ("ananas"),
    WATERMELON ("arbuz"),
    LEMON ("lemon");
    private String ruTranslate;

    Fruit(String ruTranslate) {
        this.ruTranslate = ruTranslate;
    }

    public String getRuTranslate() {
        return ruTranslate;
    }
}
