package static_test;
import static util.Print.*;

class Poppet {
	private int i;
	public Poppet(int ii) {
		i = ii;
	}

}

public class BlankFinal {
	
	private final int i = 0;
	
	private final int j;
	
	private final Poppet p ;
	
	public BlankFinal(){
		j = 1;
		p = new Poppet(1);
	}
	
	public static void main(String[] args) {
		BlankFinal blankFinal = new BlankFinal();
		//BlankFinal blankFina2 = BlankFinal.BlankFinal();
        print(blankFinal.i);
}
}
