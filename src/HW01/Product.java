package HW01;

import java.util.List;

public class Product extends Category {
    private String productName;
    private Integer price;

    public String getProductName() {
        return productName;
    }

    private Integer rating;
    //private Category category;

    public Product(String productName, String categoryName, List<Product> productList, Integer price, Integer rating) {
        super(categoryName, productList);
        this.productName = productName;
        this.price = price;
        this.rating = rating;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return getInfo();
//                "Product{" +
//                "categoryName='" + getCategoryName() + '\'' +
//                "productName='" + productName + '\'' +
//                ", price=" + price +
//                ", rating=" + rating +
//                '}'+"\n";
    }

    private String getInfo() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Category - ");
        stringBuilder.append(getCategoryName());
        stringBuilder.append("; Product name - ");
        stringBuilder.append(productName);
        stringBuilder.append("; price = ");
        stringBuilder.append(price);
        stringBuilder.append("; rating = ");
        stringBuilder.append(rating);
        stringBuilder.append(".\n");
        return stringBuilder.toString();
    }

//    public void addToBasket(Product name, List<Product> userBasketList) {
//
//    }
}
