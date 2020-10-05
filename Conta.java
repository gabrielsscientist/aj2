public class Conta {

    private double saldo;
    private String numero;
    private String titular;
    private int agencia;
    private int banco;

    public void inicializaConta(double saldoInicial, String num, String tit, int ag, int bc) {
        saldo = saldoInicial;
        numero = num;
        titular = tit;
        agencia = ag;
        banco = bc;
    }

    public void saque(double valor) {
        System.out.println("Realizando saque de R$ " + valor + " da conta " + numero);
        if (valor > 0) {
            if (saldo >= valor) {
                saldo -= valor;
            } else
                System.out.println("Saldo insuficiente");
        } else {
            System.out.println("O valor do saque deve ser positivo");
        }
    }

    public void deposito(double valor) {
        System.out.println("Realizando deposito de R$" + valor + " da conta " + numero);
        if (valor >= 0) {
            this.saldo += valor;
        } else
            System.out.println("O valor do deposito deve ser positivo");
    }

    public void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println(" AGENCIA:" + agencia);
        System.out.println(" NUMERO : " + numero);
        System.out.println(" TITULAR: " + titular);
        System.out.println(" SALDO  : R$" + saldo);
        System.out.println("-----------------------------\n");
    }

    public double getSaldo() {
        return saldo;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getBanco() {
        return banco;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }
    
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
