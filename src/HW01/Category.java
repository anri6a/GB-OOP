package HW01;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String categoryName;
    private List<Product> productList;

    public Category(String categoryName, List<Product> productList) {
        this.categoryName = categoryName;
        this.productList = new ArrayList<>();
    }

    public Category() {
        // this(new ArrayList<>());
    }

    @Override
    public String toString() {
        return "Category{" +
                "categoryName='" + categoryName + '\'' +
                ", productList=" + productList +
                '}' + "\n";
    }

    public String getCategoryName() {
        return categoryName;
    }

    public List<Product> getProductList() {
        return productList;
    }

}
