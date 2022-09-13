
public class OperatorDemo {

	private static boolean isPositive (int n) { //method signature
		System.out.println("Inside isPositive method " + n);
		if (n>0) {
			return true;
		}else {
			return false;
		}
	}
	public static void main(String[] args) {
		int a = 1;
		int b = 2;
		int c = a++ + ++b;
		System.out.println("a "+ a );
		System.out.println("b "+ b );
		System.out.println("c "+ c );
		System.out.println("==================");
		int x = 5;
		int y = 3;
		if(isPositive(x) || isPositive(y)) {
			System.out.println("Both numbers are positive");
		}else {
			System.out.println("Both numbers are not positive");
		}
	}

}
