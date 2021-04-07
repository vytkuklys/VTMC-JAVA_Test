import java.util.Scanner;

public class U01 {

	public static void main(String[] args) {
		int k, sum, i;
		sum = 0;
		i = 1;
		Scanner input = new Scanner(System.in);
		System.out.println("Kiek kartu sokinejo?");
		k = input.nextInt();
		while (i <= k) {
			System.out.println("Kiek susokinejo kartu " + i + " bandymu?");
			sum += input.nextInt();
			i++;
		}
		System.out.println("Is viso: " + sum + "\nVidutiniskai: " + (sum / k));
	}

}
