import java.util.Scanner;

public class U06 {

	public static void main(String[] args) {
		int n, sum, i, aVal, aMin, bVal, bMin, tmp;
		sum = 0;
		tmp = 0;
		i = 1;
		Scanner input = new Scanner(System.in);
		System.out.print("Kiek kartu Jonas mokesi anglu kalbos? ");
		n = input.nextInt();
		while (i <= n) {
			System.out.println("Iveskite pradzios valandas ir minutes, bei pabaigos valandas ir minutes: ");
			aVal = input.nextInt();
			aMin = input.nextInt();
			bVal = input.nextInt();
			bMin = input.nextInt();
			tmp = Metodai.gautiTrukmeMinutemis(aVal, aMin, bVal, bMin);
			if (tmp <= 0) {
				System.out.println("Ivesti klaidingi duomenys");
				break;
			}
			sum += tmp;
			i++;
		}
		if (tmp > 0) {
			System.out.println(Metodai.gautiLaikoFormata(sum / 60, sum % 60));
		}
	}

}
