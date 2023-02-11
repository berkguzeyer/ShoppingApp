package ShoppingApp;

public class MainClass {
    public static void main(String[] args) {
        /** Create abjects of all Typs of Seller,
         * Create objects of Product and add them to product list of sellers
         * Create all types of Buyers
         * add products to their cart and call checkOut methods.
         * Check if the results are correct*/
        Seller regularSeller = new RegularSeller("John", "Main Street");
        Seller premiumSeller = new PremiumSeller("Jane", "Third Street");
        Product apple = new Product("apple", 2, 10);
        Product strawberry = new Product("strawberry", 1, 20);
        Product watermelon = new Product("watermelon", 3, 15);
        regularSeller.addProduct(apple);
        regularSeller.addProduct(watermelon);
        premiumSeller.addProduct(strawberry);
        Buyer regularBuyer = new RegularBuyer("Emily", "NewYork");
        Buyer premiumBuyer = new PremiumBuyer("David", "NewJersey");
        regularBuyer.addToCart(apple);
        premiumBuyer.addToCart(watermelon);
        regularBuyer.checkOut(PaymentMethod.CASHonDELIVERY);
        premiumBuyer.checkOut(PaymentMethod.CREDITCARD);



    }
}
