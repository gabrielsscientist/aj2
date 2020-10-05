public class TestaConta {

    public static void main(String[] args) {
        Conta c = new Conta();

        c.inicializaConta(1000.0, "1040-8", "João da Silva", 254, 104);

        c.deposito(200);

        c.imprimeDados();

        c.saque(1000);

        c.imprimeDados();

        c.saque(500);

        c.imprimeDados();
    }
}
