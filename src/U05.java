import java.util.Scanner;

public class U05 {

	public static void main(String[] args) {
		int p1;
		int p2;
		int p3;
		Scanner input = new Scanner(System.in);

		System.out.println("Iveskite pirma rezultata: ");
		p1 = input.nextInt();
		System.out.println("Iveskite antra rezultata: ");
		p2 = input.nextInt();
		System.out.println("Iveskite trecia rezultata: ");
		p3 = input.nextInt();

		System.out.println(Metodai.gautiGeriausiaIvertinima(p1, p2, p3));
	}

}
