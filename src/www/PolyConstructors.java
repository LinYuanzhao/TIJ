package www;
import static util.Print.*;

class Glyph{
	void draw(){
		print("Glyph.draw()");
	}
	
	Glyph(){
		print("Glyph() before draw()");
		draw();
		print("Glyph() after draw()");
	}
}

class RounGlyph extends Glyph{
	private int radius = 1;
	RounGlyph(int r){
		radius = r;
		print("RounGlyph.RounGlyph(),radius = " + radius);
	}
	
	void draw(){
		print("RounGlyph.draw(),radius = " + radius);
	}
	

	
}

public class PolyConstructors {
	public static void main(String[] args) {
		new RounGlyph(5);
	}

}
