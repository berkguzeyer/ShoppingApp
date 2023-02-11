package ShoppingApp;

public class PremiumSeller extends Seller{
    public PremiumSeller(String name, String address) {
        super(name, address);
        super.setUserType(UserType.PREMIUM);
        setFeeFromPerSale(0.5);

    }

    @Override
    public void sellProduct(Product product) {
        this.setBalance(this.getBalance() + (product.getPrice() - product.getPrice() * getFeeFromPerSale()));
        product.setStock(product.getStock() - 1);
    }


    /** This class inherits from Seller class. It has no additional variables.
     *
     * Create a corresponding constructor. In the constructor
     *                      set feeFromPerSale to 0.5
     *                      set userType as PREMIUM
     *
     * Implement sellProduct method the same way from RegularSeller class
     * */

}
