package seminar02CatDog;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
        cat.setName("Тиша");
        cat.setColor("Black");
        cat.setAge(31);
        System.out.println("cat = " + cat);
        cat.jump();
        cat.voice();
        cat.animalInfo();
        Animal animal = new Cat("хвостик");
        animal.voice();
        ((Cat)animal).klubok();
        Animal [] catAndDog = {
                new Cat("cat1"),
                new Dog("dog1"),
                new Cat("cat2"),
                new Cat("cat3")
        };
        for (Animal element : catAndDog) {
            element.voice();
        }
        for (Animal element : catAndDog) {
            if (element instanceof Cat){
                ((Cat)element).klubok();
                element.voice();
            } else {
                element.voice();
            }

        }
    }

}
