package static_test;
import static util.Print.*;


public class Initialized {
	
	public static int i ;
	
	
	static {
		i = 0;
		print("begin static");
	}
	
	public int ii = 1;
	
	public Initialized(){
		print("begin Initialized");
	}
	
	
	public static void main(String[] args) {
		
		Initialized init = new Initialized();
		print(init.ii);
		print(Initialized.i);
	}

}
