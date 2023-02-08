package ShoppingApp;

public class Product {

    private String name;
    private double price;
    private int stock;
    private Seller seller;

    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    /** This class has
     *              private String name;
     *              private double price;
     *              private int stock;
     *              private Seller seller;
     *
     * Create a constructor with name, price, stock variables
     * Create getters and setters for all varibles
     * */

}
