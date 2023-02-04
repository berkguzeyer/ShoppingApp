package ShoppingApp;

public class RegularSeller extends User {

    public RegularSeller() {
        super();

    }
    /** This class inherits from Seller class. It has no additional variables.
     * Create a corresponding constructor with super and in the constructor
     *                  set feeFromPerSale to 0.10,
     *                  set userType as REGULAR
     *
     * Implement sellProduct method and in the method
     *                  set balance to productPrice-productPrice*feeFromPerSale
     *                  and reduce product stock by 1
     * */
}
