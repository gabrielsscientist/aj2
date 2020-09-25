package aj2;

class Produto{
	String codigo;
	String nome;
	double preco;
	String fabricante;
	
	void aumentarPreco() {
		preco += preco * 0.05;
	}
	void diminuirPreco(double p) {
		preco -= p;
	}
}

public class labs {

	public static void main(String[] args) {
		Produto produto1 = new Produto();
		
		produto1.codigo = "001";
		produto1.nome = "Fogão";
		produto1.preco = 500.0;
		
		System.out.println(produto1.preco);
		
		produto1.aumentarPreco();
		System.out.println(produto1.preco);
		
		produto1.diminuirPreco(15.0);
		System.out.println(produto1.preco);		
		
	}

}
