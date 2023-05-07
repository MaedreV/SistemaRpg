package rpg;

public class Bruxo extends Personagem{
private int mana;
	public Bruxo(String nome, int nivel, int vida, int mana) {
		super(nome, nivel, vida);
		this.mana = mana;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Atacar() {
		System.out.printf("[%s] Atacou com Lacaio de fogo\n", nome);
	}
	@Override
	public void Defender() {
		System.out.printf("[%s] Defendeu com Lacaio de pedra\n", nome);
	}
	@Override
	public void AtacarPesado() {
		System.out.printf("[%s] Atacou forte com Lacaio de raio\n", nome);

	}
	public void Invocar() {
		System.out.printf("[%s] Invocou Lacaio\n", nome);

	}
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		super.receberDano(dano);
	}
}
