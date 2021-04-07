import java.util.Arrays;

public class TestAlgoritmaiVytautas {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6 };
		AlgoritmaiVytautas test1 = new AlgoritmaiVytautas();

		System.out.println("Contains 2: " + test1.contains(arr, 2));
		System.out.println("Contains 7: " + test1.contains(arr, 7));
		System.out.println("Before: " + Arrays.toString(arr));
		test1.reverse(arr);
		System.out.println("After: " + Arrays.toString(arr));
	}
}