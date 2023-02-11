package ShoppingApp;

public class PremiumBuyer extends Buyer{
    /**This class inherits from Buyer class. It has no additional variables.
     *
     * Create corresponding constructor to super. In the constructor
     *                           set the shippingCost to the value you are getting from calculateShippingCost method
     *
     * Implement checkOut method same as RegularBuyer class
     *
     * Implement calculateShippingCost method. return 0.
     * */
    public PremiumBuyer(String name, String address ) {
        super(name, address);
        setShippingCost(calculateShippingCost());
    }
    @Override
    public void checkOut(PaymentMethod paymentMethod) {
        for (Product product : this.getCart().getCartProducts()){
            product.getSeller().sellProduct(product);
        }

        PaymentMethod paymentCredit = PaymentMethod.CREDITCARD;
        PaymentMethod paymentCash = PaymentMethod.CASHonDELIVERY;
        if (paymentMethod.equals(paymentCredit)){
            System.out.println("$" + (getCart().getTotal() + this.calculateShippingCost()) + " has been deducted from your card");
        } else if (paymentMethod.equals(paymentCash)) {
            System.out.println("The amount you must pay on delivery is $" + (getCart().getTotal() + this.calculateShippingCost()));
        }
    }

    @Override
    public double calculateShippingCost() {
        return 0;
    }

}
