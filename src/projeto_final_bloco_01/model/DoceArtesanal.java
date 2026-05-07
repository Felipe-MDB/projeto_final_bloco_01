package projeto_final_bloco_01.model;

public class DoceArtesanal extends Doce{
	
	private int validade;

	public DoceArtesanal( String nome, int tipo, float preco, int validade) {
		super(nome, tipo, preco);
		this.validade = validade;
    }

    // Sobrecarga/Sobrescrita (Polimorfismo)
    @Override
    public void visualizar() {
        System.out.println("Validade: " + this.validade);
    }
		
		
}
