package HW01;

public class User {
    private String login;
    private String password;
    private Basket userBasket = new Basket();

    public User() {
    }

    public User(String login, String password, Basket userBasket) {

        this.login = login;
        this.password = password;
        this.userBasket = userBasket;
    }
}
