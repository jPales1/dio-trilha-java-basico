public class ComparacaoAvancada {
  public static void main(String[] args) {
    String nome1 = "JAVA";
    String nome2 = "JAVA";

    System.out.println(nome1 == nome2); // true

    String nome3 = new String("JAVA");

    System.out.println(nome1 == nome3); // false

    String nome4 = nome3;

    System.out.println(nome3 == nome4); // true

    // Quando queremos comparar objetos, usamos o método equals
    System.out.println(nome1.equals(nome2)); // ??
    System.out.println(nome2.equals(nome3)); // ??
    System.out.println(nome3.equals(nome4)); // ??

    // LÓGICOS ###
    boolean condicao1 = true;

    boolean condicao2 = false;

    /*
     * Aqui estamos utilizando o operador lógico E para fazer a união de duas
     * expressões.
     * É como se estivesse escrito:
     * "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
     */

    if (condicao1 && condicao2)
      System.out.print("Os dois valores precisam ser verdadeiros");
    ;

    // Se condicao1 OU condicao2 for verdadeira, executar código.
    if (condicao1 || condicao2)
      System.out.print("Um dos valores precisa ser verdadeiro");
  }
}
