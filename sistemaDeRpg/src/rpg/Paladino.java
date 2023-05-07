package rpg;

public class Paladino extends Personagem{

	private int fe;
	
	public Paladino(String nome, int nivel, int vida,int fe) {
		super(nome, nivel, vida);
		this.fe = fe;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void Atacar() {
		System.out.printf("[%s] Atacou com espada\n", nome);
	}
	@Override
	public void Defender() {
		// TODO Auto-generated method stub
		System.out.printf("[%s] Defendeu com escudo\n", nome);
	}
	
	@Override
	public void AtacarPesado() {
		// TODO Auto-generated method stub
		System.out.printf("[%s] Usou um ataque forte com a espada\n", nome);
	}
	
	public void AtacarDivino() {
		// TODO Auto-generated method stub
		System.out.printf("[%s] Usou um ataque divino com a espada\n", nome);
	}
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		super.receberDano(dano);
	}
}
