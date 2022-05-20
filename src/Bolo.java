
public abstract class Bolo {
	private String nome;
	private String tipo;
	private float preco;
	
	public abstract void receita();
	
	public void sobreoBolo() {
		System.out.println("Sabor: " + nome + " Preco:R$" + preco + " Tipo: " + tipo);
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}
}
