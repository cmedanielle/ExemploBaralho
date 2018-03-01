import java.util.ArrayList;
import java.util.Collections;

public class BaralhoBuraco extends Baralho {

	public BaralhoBuraco() {		
		this.cartas = new ArrayList<Carta>();
		// this.cartas = new Carta[40];
		this.naipes = new String[]{"copas", "ouro", "espada", "paus"};
		this.nomesCartas = new String[]{"3", "4", "5", "6", "7", "8", "valete", "dama", "rei", "coringa", "ás"};
		this.valoresCartas = new int[]{5, 5, 5, 5, 5, 10, 10, 10, 10, 10, 15};
	}
	

	@Override
	public void embaralhar() {
//		this.insereCarta(new Carta("3", "copas", 5));
//		this.insereCarta(new Carta("4", "copas", 5));
		
		// inserindo cartas para o naipe de copas
		for (int i = 0; i < nomesCartas.length; i++) {
			super.insereCarta(new Carta(nomesCartas[i], naipes[0], valoresCartas[i]));
		}
		
		// inserindo cartas para o naipe de ouro
		for (int i = 0; i < nomesCartas.length; i++) {
			super.insereCarta(new Carta(nomesCartas[i], naipes[1], valoresCartas[i]));
		}
		
		// inserindo cartas para o naipe de espada
		for (int i = 0; i < nomesCartas.length; i++) {
			super.insereCarta(new Carta(nomesCartas[i], naipes[2], valoresCartas[i]));
		}
		
		// inserindo cartas para o naipe de paus
		for (int i = 0; i < nomesCartas.length; i++) {
			super.insereCarta(new Carta(nomesCartas[i], naipes[3], valoresCartas[i]));
		}
		
		Collections.shuffle(cartas);
	}
	
	public Carta descarte() {
		return super.pegarUmaCarta();
	}

}
