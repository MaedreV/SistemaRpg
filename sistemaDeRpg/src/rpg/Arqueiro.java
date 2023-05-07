package rpg;

public class Arqueiro extends Personagem{

	private int precisão;
	
	public Arqueiro(String nome, int nivel, int vida,int precisão) {
		super(nome, nivel, vida);
		this.precisão = precisão;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Atacar() {
		System.out.printf("[%s] Fez um disparo\n", nome);
	}
	@Override
	public void Defender() {
		System.out.printf("[%s] Usou armadilha para se defender\n", nome);
	}
	@Override
	public void AtacarPesado() {
		System.out.printf("[%s] Fez um disparo poderoso\n", nome);

	}
	public void AtaqueElemental() {
		System.out.printf("[%s] Fez um disparo elemental\n", nome);

	}
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		super.receberDano(dano);
	}
}
