import model.Iphone;

public class App {
    public static void main(String[] args) throws Exception {
        Iphone iphone = new Iphone("123456789");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("I Want To Break Free");
        iphone.ligar("(99) 987654321");
        iphone.atender();
        iphone.iniciarCorreioVoz();
        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}