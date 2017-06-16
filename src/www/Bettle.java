package www;
import static util.Print.*;

class Insect {
	private int i = 9;
	protected int j;
	
	Insect() {
		print("i=" + i +  ", j=" + j);
	}
	
	//private static int x1 = printInit("Static Insect.x1 initialized");

}


public class Bettle extends Insect {
	
	private  int k = printInit("Bettle.k initialized");
	
	public Bettle(){
		print("k = " + k);
		print("j = " + j);
	}
	
	private static int x2 = printInit("Static Bettle.x2 initialized");
	
	
	static int printInit(String s){
		print(s);
		return 47;
	}
	
	public static void main(String[] args) {
		print("Bettle constructor");
		//Bettle b = new Bettle();
	}
	

}
