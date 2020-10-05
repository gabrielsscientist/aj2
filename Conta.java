/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 * 1) Sobrecarregue o metodo inicializaConta permitindo que ele
 * seja executado sem informar o saldo, e neste caso o saldo inicial
 * devera ser 0.
 *
 */
public class Conta {

    private double saldo;
    private String numero;
    private String titular;
    private String agencia;
    private int banco;

    /**
     * @param saldoInicial
     *            Saldo inicial da conta
     * @param num
     *            Numero da conta
     * @param tit
     *            Titular da conta
     * @param ag
     *            Agencia que a conta pertence
     * @param bc
     *            Banco que a agencia pertence
     */
    public void inicializaConta(double saldoInicial, String num, String tit, String ag, int bc) {
        this.saldo = saldoInicial;
        this.numero = num;
        this.titular = tit;
        this.agencia = ag;
        this.banco = bc;
    }

    /**
     *
     * @param num
     *            Número da conta
     * @param tit
     *            Titular da conta
     * @param ag
     *            Agencia que a conta pertence
     * @param bc
     *            Banco que a agência pertence
     */
    public void inicializaConta(String num, String tit, String ag, int bc) {
        this.inicializaConta(0, num, tit, ag, bc);
    }

    /**
     * @param valor
     *            Valor a ser sacado da conta
     */
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

    /**
     * @param valor
     *            Valor a ser depositado na conta
     */
    public void deposito(double valor) {
        System.out.println("Realizando deposito de R$" + valor + " da conta " + numero);
        if (valor >= 0)
            this.saldo += valor;
        else
            System.out.println("O valor do deposito deve ser positivo");
    }

    /**
     * Este metodo imprime todos os dados da conta corrente
     */
    public void imprimeDados() {
        System.out.println("\n----------------------------");
        System.out.println(" AGENCIA:" + agencia);
        System.out.println(" NUMERO : " + numero);
        System.out.println(" TITULAR: " + titular);
        System.out.println(" SALDO  : R$" + saldo);
        System.out.println("-----------------------------\n");
    }

    /**
     * @return Saldo da conta
     */
    public double getSaldo() {
        return this.saldo;
    }

    /**
     * @return Número da agencia da conta
     */
    public String getAgencia() {
        return agencia;
    }

    /**
     * @return Número do banco da conta
     */
    public int getBanco() {
        return banco;
    }

    /**
     * @return Número da conta
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return Nome do titular da conta
     */
    public String getTitular() {
        return titular;
    }

    /**
     * @param titular
     *            Nome do titular da conta
     */
    public void setTitular(String titular) {
        this.titular = titular;
    }
}
