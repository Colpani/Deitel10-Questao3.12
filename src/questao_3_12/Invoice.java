package questao_3_12;

public class Invoice { //fatura

	//numero - string
	//descricao - string
	//quantidade comprada - int
	//preco por item - double (se for negativo, deixar 0)
	
	//classe - contrutor que inicializa as quatro variaveis acima
	//set e get para cada uma
	//getInvounceAmount - qtde x preco (double) - se menor que 0, deixar 0
	//fazer a classe InvoiceTest
	
	private String numero;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice(String numero, String descricao, int quantidade, double preco) {
		this.numero = numero;
		this.descricao = descricao;
		this.quantidade = quantidade;
		this.preco = preco;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	public String getNumero() {
		return numero;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public double getInvoiceAmount() {
		if ((preco * quantidade) > 0)
			return preco * quantidade;
			else return 0.0;
	}
	
}
