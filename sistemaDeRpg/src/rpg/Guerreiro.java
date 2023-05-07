package rpg;

public class Guerreiro extends Personagem{

	private int furia;
	
	public Guerreiro(String nome, int nivel, int vida, int furia) {
		super(nome, nivel, vida);
		this.furia = furia;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar() {
		System.out.printf("[%s] Atacou com machado\n", nome);
	}
	@Override
	public void Defender() {
		System.out.printf("[%s] Defendeu com escudo\n", nome);
	}
	@Override
	public void AtacarPesado() {
		System.out.printf("[%s] Atacou forte com machado\n", nome);

	}
	public void AtacarFuriosamente() {
		System.out.printf("[%s] Atacou furiosamente\n", nome);

	}
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		super.receberDano(dano);
	}
}
