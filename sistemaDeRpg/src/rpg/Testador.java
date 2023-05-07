package rpg;

public class Testador {


public static void main(String[] args) {
	
	
	Ladino ladino = new Ladino("Tiago", 12, 180, 70);
	ladino.Atacar();
	Guerreiro guerreiro = new Guerreiro("Lyan", 9, 300, 100);
	guerreiro.AtacarFuriosamente();
	Sacerdote sacerdote = new Sacerdote("Lucio", 8, 170, 190, 42);
	sacerdote.Curar();
	Bruxo bruxo = new Bruxo("Raul", 15, 200, 210);
	bruxo.Invocar();
	Paladino paladino = new Paladino("Macedo", 12, 350, 36);
	paladino.Atacar();
	Arqueiro arqueiro = new Arqueiro("Kia", 13, 170, 59);
	arqueiro.Defender();
	Mago mago = new Mago("Ingrid", 15, 190, 250);
	mago.Atacar();
}
	
	
}
