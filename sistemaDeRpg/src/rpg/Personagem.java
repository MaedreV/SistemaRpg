package rpg;

public class Personagem {
 protected String nome;
 protected int nivel;
 protected int vida;
 protected int mana;

 
 public Personagem(String nome, int nivel, int vida) {
     this.nome = nome;
     this.nivel = nivel;
     this.vida = vida;
     
 }
 
 public void Atacar() {
	 System.out.printf("[%s] Atacou/n",nome);
 }
 public void Defender() {
	 System.out.printf("[%s] Defendeu/n",nome);
 }
 
 public void AtacarPesado() {
	 System.out.printf("[%s] Atacou forte/n",nome);
 }
 public void receberDano(int dano) {
     vida -= dano;
     System.out.printf("[%s] recebeu %d de dano",nome,dano);
     if (vida <= 0) {
         System.out.printf("[%s] morreu",nome);
     }
 }
}
