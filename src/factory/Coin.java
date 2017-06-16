package factory;

import java.util.Random;

public class Coin implements Game {
	private Coin() {}
	
	public static GameFactory factory = new GameFactory() {
		public Game getGame(){
			return new Coin();
		}
	};
	
	static Random random = new Random();
	
	private int min = 1;
	private int max = 2;
	@Override
	public void play() {
		int num = random.nextInt(max)%(max-min+1) + min;
		if(1==num)
			System.out.println("正面");
		else
			System.out.println("反面");
	}

}
