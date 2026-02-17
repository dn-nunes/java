public class EletronicProduct {
    private String name;
    private double price;
    private int amount;

    public EletronicProduct(String name, double price, int amount, ShoppingCart cart) {
        this.name = name;
        this.price = price;
        this.amount = amount;

        cart.addToCart(this);
    }

    @Override
    public String toString() {
        return String.format("%s | %.2f | %d", name, price, amount);
    }

    public double TotalValue() {
        return price * amount;
    }
}
