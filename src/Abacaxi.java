
public class Abacaxi extends Bolo{
		
	public Abacaxi() {
		setNome("Abacaxi");
		setPreco(5);
		setTipo("Quadrado");
	}
	
	@Override
	public void receita() {
		System.out.println("Bolo quadrado de abacaxi");
	}
}
