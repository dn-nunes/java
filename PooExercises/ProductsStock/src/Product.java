public class Product {
    private String name;
    private double price;
    private int amount;

    public void ShowProduct() {
        System.out.printf("Nome: %s\n", name);
        System.out.printf("Preço: %.2f\n", price);
        System.out.printf("Quantidade em estoque: %d\n", amount);
        System.out.println();
    }

    public Product(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public void AddAmount(int amount) {
        this.amount += amount;
    }

    public void RemoveAmount(int amount) {
        if (this.amount < amount) {
            System.out.println("Quantidade indisponível em estoque!");
            return;
        }

        this.amount -= amount;
    }
}
