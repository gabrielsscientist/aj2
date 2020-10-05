public class Agencia {

    private String numero;
    private int banco;

    public void inicializaAgencia(String num, int bc) {
        numero = num;
        banco = bc;
    }

    public void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Agencia no. " + numero);
        System.out.println("Banco no." + banco);
        System.out.println("----------------------");
    }

    public int getBanco() {
        return banco;
    }

    public String getNumero() {
        return numero;
    }
}
