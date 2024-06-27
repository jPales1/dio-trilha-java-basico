public class Operadores {
  public static void main(String[] args) {
    // CONCATENAÇÃO ###
    String nomeCompleto = "LINGUAGEM" + "JAVA";

    // qual o resultado das expressoes abaixo?
    String concatenacao = "?";
    System.out.println(concatenacao);

    concatenacao = 1 + 1 + 1 + "1";
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + 1;
    System.out.println(concatenacao);

    concatenacao = 1 + "1" + 1 + "1";
    System.out.println(concatenacao);

    concatenacao = "1" + 1 + 1 + 1;
    System.out.println(concatenacao);

    concatenacao = "1" + (1 + 1 + 1);
    System.out.println(concatenacao);

    // UNÁRIOS ###
    int numero = 5;

    // Imprimindo o numero negativo
    System.out.println(-numero);

    // incrementando numero em mais 1 numero, imprime 6
    numero++;
    System.out.println(numero);

    // incrementando numero em mais 1 numero, imprime 7
    System.out.println(numero++);// ops algo de errado não está certo

    System.out.println(numero);// agora sim, numero virou 7

    // ordem de precedencia conta aqui
    System.out.println(++numero);

    boolean verdadeiro = true;

    System.out.println("Inverteu: " + !verdadeiro);

    // TERNÁRIO ###
    int a, b;

    a = 5;
    b = 6;

    /*
     * EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
     * if(a==b)
     * resultado = "verdadeiro";
     * else
     * resultado = "falso";
     */

    // MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
    String resultado = (a == b) ? "verdadeiro" : "false";

    System.out.println(resultado);

    // RELACIONAIS ###
    int numero1 = 1;
    int numero2 = 2;

    if (numero1 > numero2)
      System.out.print("Numero 1 maior que numero 2");

    if (numero1 < numero2)
      System.out.print("Numero 1 menor que numero 2");

    if (numero1 >= numero2)
      System.out.print("Numero 1 maior ou igual que numero 2");

    if (numero1 <= numero2)
      System.out.print("Numero 1 menor ou igual que numero 2");

    if (numero1 != numero2)
      System.out.print("Numero 1 é diferente de numero 2");

    
  }
}
