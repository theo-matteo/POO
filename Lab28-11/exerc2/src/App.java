public class App {
    public static void main(String[] args) throws Exception {

        ContaCorrente conta1 = new ContaCorrente("John");
        ContaCorrente conta2 = new ContaCorrenteEspecial("James");

        conta1.deposito(1000.0);
        conta2.deposito(1000.0);

        conta1.saque(500);
        conta2.saque(500);

        System.out.println(conta1);
        System.out.println(conta2);

    }
}
