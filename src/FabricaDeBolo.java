
public class FabricaDeBolo {
	
	public static void main(String[] args) {
		BoloFactory bolos = new BoloFactory();
		Bolo boloDeAbacaxi = bolos.getBolo(BoloFactory.Bolos.ABACAXI);
		boloDeAbacaxi.sobreoBolo();
		boloDeAbacaxi.receita();
		
		Bolo boloDeChoconinho = bolos.getBolo(BoloFactory.Bolos.CHOCONINHO);
		boloDeChoconinho.sobreoBolo();
		boloDeChoconinho.receita();
		
		Bolo boloDeFlorestaNegra = bolos.getBolo(BoloFactory.Bolos.FLORESTANEGRA);
		boloDeFlorestaNegra.sobreoBolo();
		boloDeFlorestaNegra.receita();
		
		Bolo boloPrestigio = bolos.getBolo(BoloFactory.Bolos.PRESTIGIO);
		boloPrestigio.sobreoBolo();
		boloPrestigio.receita();
	}
}
