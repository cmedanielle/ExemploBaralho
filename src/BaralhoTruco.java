import java.util.ArrayList;
import java.util.Collections;

public class BaralhoTruco extends Baralho {
	
	private int totalRetruco;
	
	public BaralhoTruco() {
		this.totalRetruco = 0;
		
		this.cartas = new ArrayList<Carta>();
		// this.cartas = new Carta[40];
		this.naipes = new String[]{"copas", "ouro", "espada", "paus"};
		this.nomesCartas = new String[]{"2", "3", "4", "5", "6", "7", "valete", "dama", "rei"};
		this.valoresCartas = new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10};
	}
	

	@Override
	public void embaralhar() {
//		this.insereCarta(new Carta("2", "copas", 2));
//		this.insereCarta(new Carta("2", "copas", 3));
		
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
	
	public Carta retruco(Carta atual) {
		if (totalRetruco <= 3) {
			super.insereCarta(atual);
			Carta novaCarta = super.pegarUmaCarta();
			totalRetruco++;
			return novaCarta;
		}
		return atual;
	}

}
