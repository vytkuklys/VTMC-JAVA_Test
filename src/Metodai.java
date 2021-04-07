public class Metodai {
	public static int gautiGeriausiaIvertinima(int p1, int p2, int p3) {
		return Math.max(p1, Math.max(p2, p3));
	}

	public static int gautiTrukmeMinutemis(int aVal, int aMin, int bVal, int bMin) {
		return (bVal * 60 + bMin) - (aVal * 60 + aMin);
	}

	public static String gautiLaikoFormata(int val, int min) {
		return (val + "val. " + min + "min.");
	}
}