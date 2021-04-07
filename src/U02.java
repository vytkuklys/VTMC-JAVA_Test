import java.util.Scanner;

public class U02 {

	public static void main(String[] args) {
		String[] var = { "a", "b", "c" };
		int i, tmp, m3;
		i = 0;
		m3 = 0;
		Scanner input = new Scanner(System.in);
		while (i < var.length) {
			System.out.print("Iveskite " + var[i] + " reiksme: ");
			tmp = input.nextInt();
			if (tmp % 3 == 0 && m3 == 0) {
				m3 = tmp;
			}
			i++;
		}
		if (m3 == 0) {
			System.out.println("Atsakymas: nera");
		} else {
			System.out.println("Atsakymas: " + m3);
		}
	}

}
