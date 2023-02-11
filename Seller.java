package ShoppingApp;


import java.util.ArrayList;
import java.util.List;

public abstract class Seller extends User{

/** This is an abstract class and it inherits from User class. It has
 *                      private list of Product named products,
 *                      private double balance,
 *                      private double feeFromPerSale variables
 * Create a corresponding constructor to super. Set balance to 0 and initialize necessary fields.
 * Create getters and setters for all fields.
 * Create a void addProduct method with a Product product parameter.
 *                      In this method set productSeller to this
 *                      and add the product to products list.
 * Create abstract sellProduct method with a Product product parameter.
 */
    private List<Product> products;
    private double balance;
    private double feeFromPerSale;


    public Seller(String name, String address) {
        super(name, address);
        this.balance = 0;
        this.products = new ArrayList<>();
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getFeeFromPerSale() {
        return feeFromPerSale;
    }

    public void setFeeFromPerSale(double feeFromPerSale) {
        this.feeFromPerSale = feeFromPerSale;
    }
    public void addProduct(Product product){
        product.setSeller(this);
        this.products.add(product);
    }
    public abstract void sellProduct(Product product);
}
