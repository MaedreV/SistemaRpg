package rpg;

public class Ladino extends Personagem{

	private int evasão;
	
	public Ladino(String nome, int nivel, int vida, int evasão) {
		super(nome, nivel, vida);
		this.evasão = evasão;
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Atacar() {
		System.out.printf("[%s] Atacou com adaga\n", nome);
	}
	@Override
	public void Defender() {
		System.out.printf("[%s] Evadiu\n", nome);
	}
	@Override
	public void AtacarPesado() {
		System.out.printf("[%s] Atacou forte com adaga\n", nome);

	}
	public void Invisibilidade() {
		System.out.printf("[%s] Ficou invisivel\n", nome);

	}
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		super.receberDano(dano);
	}
}
