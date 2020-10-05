/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 *
 */
public class TestaConstrutores {

    public static void main(String[] args) {
        Conta c = new Conta(2000, "5896-8", "Mario Prata", "5896", 104);
        c.imprimeDados();
        Conta c2 = new Conta("5854-7", "Cassiano Gabus", "574", 101);
        c2.imprimeDados();
        Cliente cli = new Cliente("Carlos Alberto Parreira", "589.564.587-78");
        cli.imprimeDados();
    }
}
