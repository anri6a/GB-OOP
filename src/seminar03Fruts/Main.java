package seminar03Fruts;

/**
 * 2) Практика перечислений :
 * Создать перечисление фруктов, сравнить их значение в switch case с различным выводом по каждому типу.
 */
public class Main {
    public static void main(String[] args) {
        Fruit fruit = Fruit.ORANGE;
        System.out.println(fruit);
        System.out.println(fruit.getRuTranslate());
//switch (fruit){
//    case APPLE -> System.out.println(fruit.getRuTranslate());
//    case BANANA -> System.out.println("fruit.getRuTranslate() = " + fruit.getRuTranslate());
//    case LEMON -> System.out.println("fruit.getRuTranslate() = " + fruit.getRuTranslate());
//    case ORANGE -> System.out.println("fruit.getRuTranslate() = " + fruit.getRuTranslate());
//    case PINEAPPLE -> System.out.println("fruit.getRuTranslate() = " + fruit.getRuTranslate());
//    case WATERMELON -> System.out.println("fruit.getRuTranslate() = " + fruit.getRuTranslate());
//    default -> System.out.println("this fruct does not exist");
//}

        switch (fruit){
            case APPLE, BANANA, LEMON, ORANGE, PINEAPPLE, WATERMELON -> System.out.println("fruit.getRuTranslate() = " + fruit.getRuTranslate());
            default -> System.out.println("this fruct does not exist");
        }
    }
}
