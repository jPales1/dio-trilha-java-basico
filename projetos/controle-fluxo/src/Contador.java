import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);

    System.out.print("Digite o primeiro parâmetro: ");
    int parametroUm = terminal.nextInt();

    System.out.print("Digite o segundo parâmetro: ");
    int parametroDois = terminal.nextInt();

    try {
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException exception) {
      exception.printStackTrace();
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm > parametroDois)
      throw new ParametrosInvalidosException();

    int contagem = parametroDois - parametroUm;
    for (int i = 1; i <= contagem; i++) {
      System.out.println("Imprimindo o número " + i);
    }
  }
}