
public class U03 {

	public static void main(String[] args) {
		int start = -100;
		int end = -199;
		System.out.println("While ciklas:");
		while (start >= end) {
			System.out.print(start + " ");
			start -= 4;
		}
		System.out.println(" ");
		System.out.println("For ciklas:");
		for (start = -100; start >= end; start -= 4) {
			System.out.print(start + " ");
		}
	}

}
