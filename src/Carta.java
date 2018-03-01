
public class Carta {
	
	private String nome;
	private String naipe;
	private int valor;
	
	public Carta(String nome, String naipe, int valor) {
		this.nome = nome;
		this.naipe = naipe;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public String getNaipe() {
		return naipe;
	}

	public int getValor() {
		return valor;
	}
	
	@Override
	public String toString() {
		return nome + " de " + naipe + " - vale: " + valor;
	}

}
