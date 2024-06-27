public class App {
    public static void main(String[] args) throws Exception {
        SmartTv st1 = new SmartTv();

        System.out.println("TV Ligada? " + st1.powerState);
        System.out.println("Canal atual? " + st1.channel);
        System.out.println("Volume atual? " + st1.volume);

        st1.buttonPower();
        System.out.println("\nTV Ligada? " + st1.powerState);

        st1.changeChannel(10);
        System.out.println("Canal atual? " + st1.channel);
    }
}
