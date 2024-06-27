import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int accountNumber;
    String agency, clientName;
    double balance;

    System.out.print("Por favor, digite o nome do cliente: ");
    clientName = sc.nextLine();

    System.out.print("Por favor, digite o número da agência: ");
    agency = sc.nextLine();

    System.out.print("Por favor, digite o número da conta: ");
    accountNumber = sc.nextInt();

    System.out.print("Por favor, digite o saldo da conta: ");
    balance = sc.nextDouble();

    System.out.printf(
        "Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
        clientName, agency, accountNumber, balance);

    sc.close();
  }
}
