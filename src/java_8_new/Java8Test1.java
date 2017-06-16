package java_8_new;

public class Java8Test1 {
	
	private String salutation = "ddd";
	
	public void print(){
		System.out.print(salutation);
	}
	
	
	public static void main(String args[]) {
		
		Java8Test1 tester = new Java8Test1();
		
		// 无法在静态方法中引用非静态变量
		//System.out.print(salutation);

		// 类型声明
		MathOperation addition = (int a, int b) -> a + b;

		// 不用类型声明
		MathOperation subtraction = (a, b) -> a - b;

		// 大括号中的返回语句
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// 没有大括号及返回语句
		MathOperation division = (int a, int b) -> a / b;
		

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));
		
		
		String salutation1 = "Hello! ";
		
		//salutation1 = "xxxx";
		

		// 不用括号  
		// lambda 表达式只能引用 final 或 final 局部变量，这就是说不能在 lambda 内部修改定义在域外的变量，否则会编译错误。(这句话有问题)
		// Local variable salutation defined in an enclosing scope must be final or effectively final
		GreetingService greetService1 = message -> System.out.println(salutation1 + message);

		// 用括号
		GreetingService greetService2 = (message) -> System.out.println(salutation1 + message);

		greetService1.sayMessage("Runoob");
		greetService2.sayMessage("Google");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}