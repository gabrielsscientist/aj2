public class Cliente {

    private String nome;
    private String cpf;

    public void inicializaCliente(String nomeCliente, String cpfCliente) {
        this.cpf = cpfCliente;
        this.nome = nomeCliente;
    }

    void imprimeDados() {
        System.out.println("----------------------");
        System.out.println("Nome do cliente :" + this.nome);
        System.out.println("CPF:" + this.cpf);
        System.out.println("----------------------");
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome() {
        return nome;
    }
}
