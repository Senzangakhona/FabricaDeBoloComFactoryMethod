
public class Prestigio extends Bolo{

	public Prestigio() {
		setNome("Prestigio");
		setPreco(70);
		setTipo("Redondo");
	}
	
	@Override
	public void receita() {
		System.out.println("Bolo de prestigio redondo.");
	}
}
