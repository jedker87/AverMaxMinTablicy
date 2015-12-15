package pakiet;

public class Main {

	public static double averageElements(int[] tab, int n) {
		double sum = 0;
		double averageElements = 0;

		for (int i = 0; i < n; i++) {
			sum = sum + tab[i];
		}
		averageElements = sum / n; 
		return averageElements;
	}

	public static int minElement(int[] tab, int n) {
		int min = tab[0];
		int minElement = 0;

		for (int i = 0; i < n; i++) {
			if (tab[i] < min) {
				min = tab[i];
			}
		}
		minElement = min;
		return minElement;
	}

	public static int maxElement(int[] tab, int n) {
		int max = tab[0];
		int maxElement = 0;

		for (int i = 0; i < n; i++) {
			if (tab[i] > max) {
				max = tab[i];
			}
		}
		maxElement = max;
		return maxElement;
	}

	public static double closeAverage(int[] tab, int n) {
		double average = 22.75;
		double x = tab[0];
		double closeAverage = 0;

		for (int i = 0; i < n; i++) {
			if (Math.abs(tab[i] - average) < Math.abs(tab[0] - average)) {
				x = tab[i];
			}
		}
			closeAverage = x;
			return closeAverage;
		}
	

	public static void main(String[] args) {

		int[] tablica1 = new int[10];
		tablica1[0] = 10;
		tablica1[1] = 63;
		tablica1[2] = 2;
		tablica1[3] = 16;

		int n = 4;
		System.out.println("srednia z tablicy wynosi: " + averageElements(tablica1, n));
		System.out.println("najmniejsza wartosc to: " + minElement(tablica1, n));
		System.out.println("najwieksza wartosc to: " + maxElement(tablica1, n));
		System.out.println("najbardziej zblizona wartosc sredniej to: " + closeAverage(tablica1, n));
	}

}
