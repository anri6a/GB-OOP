package HW01;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    private List<Product> purchasedProduct;

    public Basket() {
    }

    public Basket(List<Product> purchasedProduct) {
       this.purchasedProduct = new ArrayList<>();
    }
}
