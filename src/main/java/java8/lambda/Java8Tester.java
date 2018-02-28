package java8.lambda;

public class Java8Tester {
	public static void main(String args[]) {
		Java8Tester tester = new Java8Tester();

		// 类型声明
		MathOperation add = (int a, int b) -> a + b;
		// 不用类型声明
		MathOperation subtraction = (a, b) -> a - b;

		// 大括号中的返回语句
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// 没有大括号及返回语句
		MathOperation division = (int a, int b) -> a / b;
		System.out.println("10 + 5 ="  +String.valueOf(add.operation(10, 5)));//需要进行包装
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// 不用括号
		GreetingService greetService1 = message -> System.out.println("Hello " + message);

		// 用括号
		GreetingService greetService2 = (message) -> System.out.println("Hello " + message);

		greetService1.sayMessage("Runoob");
		greetService2.sayMessage("Google");
		Runnable thread1 = new Runnable() {
			public void run() {
				System.out.println("您好");
			}
		};
		thread1.run();
		Runnable thread2 = () -> System.out.println("哈哈哈");
		thread2.run();
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