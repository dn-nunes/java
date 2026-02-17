import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<EletronicProduct> cart = new ArrayList<>();

    public void addToCart(EletronicProduct eletronicProduct) {
        cart.add(eletronicProduct);
    }

    public void showCartTotalValue() {
        double total = 0;
        for (var ep : cart) {
            total += ep.TotalValue();
        }

        System.out.printf("Total da compra: R$%.2f", total);
    }

    public void showCart() {
        System.out.println("Produtos no carrinho:");
        for (var item : cart) {
            System.out.println("- " + item);
        }
    }
}
