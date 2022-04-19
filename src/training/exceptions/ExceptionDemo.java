package training.exceptions;

public class ExceptionDemo {
	public static void main(String[] args) {
		System.out.println("hello");

		try {
			System.out.println("try");
			int a=1/0;//arithmetic exception
		} catch (Exception e) {
			System.out.println("catch");
		} finally {
			System.out.println("finally");
		}

		System.out.println("hi");
	}
}

//exception are logical errors 
//that are handled by the programmer
//try catch blocks to handle exceptions