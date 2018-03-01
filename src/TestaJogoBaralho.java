
public class TestaJogoBaralho {
	
	public static void main(String[] args) {
		Baralho baralhoBuraco = new BaralhoBuraco();
		
		System.out.println("Inicializando o baralho...");
		baralhoBuraco.embaralhar();
		
		System.out.println("Player1 está sacando uma carta...");
		Carta player1 = baralhoBuraco.pegarUmaCarta();
		
		System.out.println("Player2 está sacando uma carta...");
		Carta player2 = baralhoBuraco.pegarUmaCarta();
		
		int resultado = baralhoBuraco.comparaCartas(player1, player2);
		
		System.out.println("Carta sacada pelo player1: " + player1.toString());
		System.out.println("Carta sacada pelo player2: " + player2.toString());
		
		if (resultado == 1) {
			System.out.println("Player1 ganhou!");
		} else if (resultado == -1) {
			System.out.println("Player2 ganhou!");
		} else {
			System.out.println("Deu empate!");
		}	
		
	}

}
