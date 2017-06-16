package factory;

import java.util.Random;

public class Dice implements Game {
	
	static Random random = new Random();
	
	private Dice(){}
	
	
	/*匿名内部类*/
	public static GameFactory factory = new GameFactory() {
		public Game getGame(){
			return new Dice();
		}
	};
	
	private int min = 1;
	private int max = 6;
	@Override
	public void play() {
		int num = random.nextInt(max)%(max-min+1) + min;
		System.out.println("本次掷色子的点数是" + num);
	}
}
