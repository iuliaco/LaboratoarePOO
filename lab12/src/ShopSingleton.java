import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ShopSingleton {
    private String name;
    private ArrayList<Product> products;
    private static ShopSingleton app_instance = null;
    private ShopSingleton() {
        products = new ArrayList<>();
    }
    public static ShopSingleton getInstance() {
        if(app_instance == null) {
            app_instance = new ShopSingleton();
        }
        return app_instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }
    public void addProduct(Product produs) {
        products.add(produs);
    }
    public void removeProduct(Product produs) {
        if(products.contains(produs)) 
            products.remove(produs);
    }
    public Product getCheapestProduct() {
        Product cheapest = products.get(0);
        for (Product produs: products) {
            if(produs.getPret() < cheapest.getPret()) {
                cheapest = produs;
            }
        }
        return  cheapest;
        
    }

    public static void main(String[] args) {
        ShopSingleton shop1 = ShopSingleton.getInstance();
        shop1.setName("Magazinul la Iulia");
        ProductFactory productFactory = new ProductFactory();
        shop1.addProduct(productFactory.factory("Food", "mere",(float) 1.25));
        shop1.addProduct(productFactory.factory("Computer", "Laptop Hp",(float) 3.5));
        shop1.addProduct(productFactory.factory("Book", "Jules Verne",(float) 14.6));
        shop1.addProduct(productFactory.factory("Beverage", "Cola", ((float) 1.00)));
        Product produsDeSters = productFactory.factory("Food", "sarmale", (float)30);
        System.out.println(shop1);
        ShopSingleton shop2 = ShopSingleton.getInstance();
        shop2.removeProduct(produsDeSters);
        System.out.println(shop2);
        ShopSingleton shop3 = ShopSingleton.getInstance();
        System.out.println(shop3.getCheapestProduct());
        System.out.println(shop3.getCheapestProduct().getPriceReduced());

    }

    @Override
    public String toString() {
        return "ShopSingleton{" +
                "name='" + name + '\'' +
                ", products=" + products +
                '}';
    }
}

