package innerclass;

public class Parce {
	
	Parce(){
		System.out.println("Parce test");
	}
	
	private static class ParceInnerStaticClass{
		ParceInnerStaticClass(){
			System.out.println("ParceInnerStaticClass test");
		}
	}
	
	private class ParceInnerClass {
		ParceInnerClass(){
			System.out.println("ParceInnerClass test");
		}
	}
	
	public static void main(String[] args) {
		
		//外部引用普通内部类时需要加上.new 关键字
		Parce parce = new Parce();
		Parce.ParceInnerClass parceInnerClass = parce.new ParceInnerClass();
		
		//外部引用嵌套类时（类声明为static）时直接应用
		ParceInnerStaticClass parceInnerStaticClass = new ParceInnerStaticClass();
		
	}

}
