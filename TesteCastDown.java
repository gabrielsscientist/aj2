public class TesteCastDown {

    public static void main(String[] args) {

        double saldoInicial = args.length > 0 ? Double.parseDouble(args[0]) : 0d;
        
        Banco banco = new Banco("GlobalcodeBank", 123);
        Agencia ag = new AgenciaStandard("9999", banco);
        Cliente clienteW = new Cliente("Mr. W", "55446688-77");
        Conta conta = ag.abrirConta(clienteW, saldoInicial);

        System.out.println("Foi criada a conta " + conta.getNumero() + 
                           " para " + conta.getTitular().getNome() + 
                           " com saldo de " + conta.getSaldo());
        
        if (conta instanceof ContaPoupanca) {
            
            ContaPoupanca contaPoupanca = (ContaPoupanca) conta;
            System.out.println("Trata-se de uma conta poupanca");
            System.out.println("Aniversario: " + contaPoupanca.getDataAniversario());
            
        } else if (conta instanceof ContaEspecial) {
            
            ContaEspecial contaEspecial = (ContaEspecial) conta;
            System.out.println("Trata-se de uma conta especial");
            System.out.println("Limite: " + contaEspecial.getLimite());
            
        } else {
            
            System.out.println("Trata-se de uma conta simples");
            
        }
        
    }
}
