package seminar02CatDog;



public class Dog extends Animal{
    public Dog(String name) {
        super(name);
    }

    @Override
    public void voice() {
        System.out.println(" gav ! gav!");
    }

}

