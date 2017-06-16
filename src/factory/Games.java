package factory;

public class Games {
	
	public static void playGame(GameFactory factory){
		Game game = factory.getGame();
		game.play();
	}
	
	public static void main(String[] args) {
//		playGame(new CoinFactory());
//		playGame(new DiceFactory());
		playGame(Coin.factory);
		playGame(Dice.factory);
	}
}
