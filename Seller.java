package ShoppingApp;
import java.util.ArrayList;
import java.util.List;

/** This is an abstract class and it inherits from User class. It has //done
 *                      private list of Product named products, //done
 *                      private double balance, //done
 *                      private double feeFromPerSale variables //done
 * Create a corresponding constructor to super. Set balance to 0 and initialize necessary fields. //done
 * Create getters and setters for all fields. //done
 * Create a void addProduct method with a Product product parameter.
 *                      In this method set productSeller to this
 *                      and add the product to products list.
 * Create abstract sellProduct method with a Product product parameter. //done
 */

public abstract class Seller extends User{
//    declaring the variables
    private List<Product> products = new ArrayList<>();
    private double balance;
    private double feeFromPerSale;

//    creating the constructor

    public Seller(String name, String address, List<Product> products, double balance, double feeFromPerSale) {
        super(name, address);
        this.balance = 0;
        this.feeFromPerSale = feeFromPerSale;
    }

//    creating the getters and setters
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

//    creating a method called addProduct with a Product product parameter
    public void addProduct(Product product){
//        In this method set productSeller to this ********* I could not find the productSeller variable in the Product class
        this.products.add(product); // adding the product to List of Product products
    }

    //    creating an abstract method called sellProduct with a Product product parameter
    public abstract void sellProduct(Product product);


}
