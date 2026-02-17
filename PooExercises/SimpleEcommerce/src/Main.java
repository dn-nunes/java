public class Main {
    static void main() {
        var sc = new ShoppingCart();
        new EletronicProduct("Teclado", 120.5, 54, sc);
        new EletronicProduct("Memória RAM", 1657.24, 2, sc);
        new EletronicProduct("Mouse", 200, 3, sc);

        sc.showCart();
        sc.showCartTotalValue();
    }
}
