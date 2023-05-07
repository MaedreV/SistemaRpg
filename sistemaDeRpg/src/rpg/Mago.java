package rpg;

public class Mago extends Personagem{
	private int mana;
	
	
	public Mago(String nome, int nivel, int vida, int mana) {
		super(nome, nivel, vida);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Atacar() {
		System.out.printf("[%s] Atacou com chamas\n", nome);
	}
	@Override
	public void Defender() {
		System.out.printf("[%s] Defendeu com magia\n", nome);
	}
	@Override
	public void AtacarPesado() {
		System.out.printf("[%s] Atacou forte com bola de fogo\n", nome);

	}
	public void Teleporte() {
		System.out.printf("[%s] Teleportou para longe\n", nome);

	}
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		super.receberDano(dano);
	}
}
