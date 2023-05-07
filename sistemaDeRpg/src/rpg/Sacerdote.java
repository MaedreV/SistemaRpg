package rpg;

public class Sacerdote extends Personagem{
	private int mana;
	private int fe;
	
	public Sacerdote(String nome, int nivel, int vida, int mana,int fe) {
		super(nome, nivel, vida);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void Atacar() {
		System.out.printf("[%s] Atacou com luz\n", nome);
	}
	@Override
	public void Defender() {
		System.out.printf("[%s] Usou luz para se defender\n", nome);
	}
	@Override
	public void AtacarPesado() {
		System.out.printf("[%s] Atacou forte com luz sagrada\n", nome);

	}
	public void Curar() {
		System.out.printf("[%s] Curou aliado\n", nome);

	}
	@Override
	public void receberDano(int dano) {
		// TODO Auto-generated method stub
		super.receberDano(dano);
	}
}
