import java.util.Arrays;

public class AlgoritmaiVytautas {

	public static boolean contains(int[] array, int key) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == key) {
				return true;
			}
		}
		return false;
	}

	public static void reverse(int[] array1) {
		int i = 0, tmp;
		while (i < array1.length / 2) {
			tmp = array1[array1.length - 1 - i];
			array1[array1.length - 1 - i] = array1[i];
			array1[i] = tmp;
			i++;
		}
	}
}
