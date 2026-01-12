import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome do proprietário: ");
        String name = scanner.nextLine();

        System.out.print("Tipo de conta: ");
        String accountType = scanner.nextLine();

        System.out.print("Saldo inicial: ");
        double openingBalance = scanner.nextDouble();

        System.out.printf("""
                
                === Dados da Conta ===
                
                Nome do proprietário: %s
                Tipo de conta: %s
                Saldo inicial: R$%.2f
                
                """, name, accountType, openingBalance);

        System.out.println("""
                Operações:
                
                1 - Consultar saldo atual
                2 - Recebimento
                3 - Transferência
                0 - Sair
                """);

        System.out.print("Digite a operação desejada: ");
        int option = scanner.nextInt();
    }
}