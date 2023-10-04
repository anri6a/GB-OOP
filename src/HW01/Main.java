package HW01;

import java.util.ArrayList;
import java.util.List;

public class Main {
   static List<Product> allProducts = new ArrayList<>();
    public static void main(String[] args) {
        List<Product> dairyList = new ArrayList<>();
        Category dairy = new Category("dairy", dairyList);
        List<Product> meetList = new ArrayList<>();
        Category meet = new Category("meet", meetList);
        List<Product> toysList = new ArrayList<>();
        Category toys = new Category("toys", toysList);
        List<Product> clothList = new ArrayList<>();
        Category cloth = new Category("cloth", clothList);


        Product iceCream1 = new Product("iceBear", "dairy", dairyList, 12, 7);
        Product iceCream2 = new Product("25cent", "dairy", dairyList, 9, 5);
        Product sousage1 = new Product("milkSousage", "meet", meetList, 23, 8);
        Product sorter1 = new Product("spaceVagon", "toys", meetList, 54, 10);
        Product tShort1 = new Product("Amster", "cloth", clothList, 48, 4);

        dairyList.add(iceCream1);
        dairyList.add(iceCream2);
        meetList.add(sousage1);
        toysList.add(sorter1);
        clothList.add(tShort1);


        List<Product> user1BasketList = new ArrayList<>();
        Basket user1Basket = new Basket(user1BasketList);
        User user1 = new User("user1", "123", user1Basket);

        List<Product> user2BasketList = new ArrayList<>();
        Basket user2Basket = new Basket(user2BasketList);
        User user2 = new User("user2", "123", user2Basket);

        List<Product> user3BasketList = new ArrayList<>();
        Basket user3Basket = new Basket(user3BasketList);
        User user3 = new User("user3", "123", user3Basket);



        generateAllProductsList(dairyList);
        generateAllProductsList(toysList);
        generateAllProductsList(meetList);
        generateAllProductsList(clothList);


        System.out.println(allProducts);

        addToBasket(iceCream1, user3BasketList, dairyList);

        //System.out.println(user3BasketList);

        System.out.println(allProducts);


    }

    private static void addToBasket(Product name, List<Product> userBasketList, List<Product> productList) {
        userBasketList.add(name);
        productList.remove(name);
        allProducts.remove(name);
    }
    static void generateAllProductsList(List<Product> productList){
        allProducts.addAll(productList);
    }

}
