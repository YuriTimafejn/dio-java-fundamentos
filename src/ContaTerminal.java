import cliente.Cliente;

import java.io.InputStream;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();

        System.out.println("Digite o número da conta: ");
        cliente.setNumero(scanner.nextInt());
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        cliente.setAgencia(scanner.nextLine());

        System.out.println("Digite o nome do cliente: ");
        cliente.setNomeCliente(scanner.nextLine());

        System.out.println("Digite o saldo do sr(a). " + cliente.getNomeCliente() + ": ");
        cliente.setSaldo(scanner.nextDouble());
        scanner.close();

        System.out.println(cliente);
    }
}
