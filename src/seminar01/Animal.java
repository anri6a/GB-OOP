package seminar01;

public class Animal {
    private String name;

    protected void animalInfo() {
        System.out.println("info");
    }

    protected void voice() {
        System.out.println("voice");
    }

    protected void jump() {
        System.out.println("jump");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}
