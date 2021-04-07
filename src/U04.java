import java.util.Scanner;

public class U04 {
	public static void main(String[] args) {
		int k, sum, i;
		sum = 0;
		i = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Iveskite kauliuku kieki: ");
		k = input.nextInt();
		while (i <= k) {
			System.out.print(i + "-o kauliuko tasku kiekis: ");
			sum += input.nextInt();
			i++;
		}
		System.out.println("Maksimalus tasku kiekis: " + (k * 6));
		System.out.println("Tomas is viso surinko: " + sum + " tasku");
		System.out.println("Jo tasku vidurkis: " + String.format("%.1f", ((double) sum / k)));
		if (sum <= (k * 6) / 2) {
			System.out.println("Loterija pralaimeta");
		} else {
			System.out.println("Loterija laimeta");
		}
	}
}
