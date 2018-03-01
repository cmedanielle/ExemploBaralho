import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public abstract class Baralho {
	
	protected List<Carta> cartas;
	
	protected String[] naipes;
	protected String[] nomesCartas;
	protected int[] valoresCartas;
	private int contaCartas = 0;
	
	public void insereCarta(Carta c) {
		cartas.add(c);
	}
	
	public int numeroDeCartas() {
		return cartas.size();
	}
	
	public Carta pegarUmaCarta() {
		Random rd = new Random();
		int posicaoAleatoria = rd.nextInt(cartas.size());
		Carta cartaEscolhida = cartas.get(posicaoAleatoria);
		
		cartas.remove(posicaoAleatoria);
		return cartaEscolhida;
	}
	
	public int comparaCartas(Carta a, Carta b) {
		// caso 1: ambas as cartas possuem o mesmo valor
		if (a.getValor() == b.getValor()) {
			return 0;
		// caso 2: a carta A tem valor superior a carta B
		} else if (a.getValor() > b.getValor()) {
			return 1;
		}
		// caso 3: a carta A tem valor inferior a carta B
		return -1;
	}
	
	public abstract void embaralhar();
	
}
