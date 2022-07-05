package junit1;



public class Calculator {
	public void add() {
		int a = 1;
		int b = 2;
		System.out.println(a+b);
	}
	public void sub() {
		int a = 2;
		int b = 1;
		System.out.println(a-b);
	}
	public void mul() {
		int a = 2;
		System.out.println(a*a);
	}
	public void div() {
		int a = 4;
		int b = 2;
		System.out.println(a/b);
	}
	public void beforeCase() {
		System.out.println("Start");
	}
	public void afterCase() {
		System.out.println("End");
	}

}
