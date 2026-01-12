import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main() {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Nome do proprietário: ");
        // String name = scanner.nextLine();
        String name = "Daniel";

        // System.out.print("Tipo de conta: ");
        // String accountType = scanner.nextLine();
        String accountType = "Conta Corrente";

        // System.out.print("Saldo inicial: ");
        // double openingBalance = scanner.nextDouble();
        double openingBalance = 2500.50;


        System.out.printf("""
            
            === Dados da Conta ===
            
            Nome do proprietário: %s
            Tipo de conta: %s
            Saldo inicial: R$%.2f
            """, name, accountType, openingBalance);

        while (true) {
            System.out.println("""
                
                Operações:
                
                1 - Consultar saldo atual
                2 - Recebimento
                3 - Transferência
                0 - Sair
                """);

            System.out.print("Digite a operação desejada: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.printf("""
                        
                        === Saldo atual da conta ===
                        
                        Saldo: %.2f
                        """, openingBalance);
                    break;
                case 2:
                    System.out.print("\n=== Recebimento ===\n");
                    System.out.print("Valor a receber: ");
                    double receiveValue = scanner.nextDouble();

                    openingBalance += receiveValue;
                    break;
                case 3:
                    System.out.print("\n=== Transferência ===\n");
                    System.out.print("Valor a transferir: ");
                    double transferValue = scanner.nextDouble();

                    if (transferValue <= openingBalance)
                        openingBalance -= transferValue;
                    else
                        System.out.printf("\nErro: saldo insuficiente para a transferência. Saldo atual: R$%.2f.\n", openingBalance);
                    break;
                case 0:
                    System.out.println("Fechando a aplicação...");
                    return;
                default:
                    break;
            }
        }
    }
}