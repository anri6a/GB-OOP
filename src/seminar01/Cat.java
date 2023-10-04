package seminar01;

/*Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
Данному классу добавить инкапсуляцию + сделать валидацию на введенный возраст
*/
public class Cat extends Animal {

    private Integer age;
    private String color;


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + getName() + '\'' +
                "age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
    public void catInfo(){
        animalInfo();
    }

    public Cat(String name, Integer age, String color) {
        super(name);
        this.age = age;
        this.color = color;
    }

    /**
     * @apiNote set age
     * @param age
     */
    public void setAge(Integer age) {
        if (age >= 0 && age < 20) {
            this.age = age;
        } else {
            System.out.println("Age is incorrect :" + age);
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
