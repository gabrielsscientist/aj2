/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Implemente o metodo abrirConta seguindo como modelo o metodo 
 * abrirAgencia da classe Banco. Para isto sera necessario criar os
 * atributos e alterar o construtor conforme foi feito na classe Banco.
 * 
 * 2) Depois de alterar o construtor sera necessario alterar na classe 
 * Banco o metodo abrirAgencia para chamar o construtor valido, ou seja,
 * informando o numero de contas que a agencia podera abrir, utilize um 
 * valor fixo, por exemplo 10.
 *  
 * 3) Crie um metodo que faca a impressao das contas que estao dentro da
 * agencia usando como modelo o metodo imprimirAgencias que esta na classe Banco.
 * 
 */
public class Agencia {

    private Conta contas[];
    private int numContasAbertas = 0;
    private static int numeroProximaConta = 7856;
    private String numero;
    private Banco banco;

    /**
     * @param num
     *            Numero da agencia
     * @param bc
     *            banco ao qual a agencia pertence
     */
    public Agencia(String num, Banco bc, int numMaxContas) {
        numero = num;
        banco = bc;
        contas = new Conta[numMaxContas];
    }

    /**
     * @return Numero do banco
     */
    public Banco getBanco() {
        return banco;
    }

    /**
     * @return Numero da agencia
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param b
     *            banco
     */
    public void setBanco(Banco b) {
        banco = b;
    }

    /**
     * Metodo para impressao de todos os dados da classe
     */
    public void imprimeDados() {
        System.out.println("\nAgencia no. " + numero);
        banco.imprimeDados();
    }

    /**
     * @param num
     *            Numero da agencia
     */
    public void setNumero(String num) {
        numero = num;
    }

    public Conta abrirConta(double saldo, Cliente titular) {
        Conta c = new Conta(saldo, "" + numeroProximaConta++, titular, this);
        adicionaArrayContas(c);
        return c;
    }

    private void adicionaArrayContas(Conta c) {
        if (this.contas.length <= numContasAbertas) {
            System.out.println("Agencia ERROR: Nao foi possivel criar uma nova conta");
        } else {
            System.out.println("Agencia DEBUG: Conta adicionada ao array " + numContasAbertas);
            this.contas[numContasAbertas] = c;
            numContasAbertas++;
        }
    }

    public void imprimeContas() {
        System.out.println("\n\n=============== RELATORIO DE CONTAS DA AGENCIA ==================\n");
        System.out.println("Numero de contas abertas: " + numContasAbertas);
        for (int i = 0; i < numContasAbertas; i++) {
            contas[i].imprimeDados();
        }
        System.out.println("===============================================");
    }
}