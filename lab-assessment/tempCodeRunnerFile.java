import java.util.*;
class Eligibity {
	static int[] randomAges(int n) {
		int[] ages = new int[n];
		Random r = new Random();
		for (int i = 0; i < n; i++) ages[i] = r.nextInt(90) + 10;
		return ages;
	}
	static String[][] canVote(int[] ages) {
		String[][] arr = new String[ages.length][2];
		for (int i = 0; i < ages.length; i++) {
			arr[i][0] = String.valueOf(ages[i]);
			arr[i][1] = (ages[i] < 0 ? "false" : (ages[i] >= 18 ? "true" : "false"));
		}
		return arr;
	}
	static void show(String[][] arr) {
		System.out.println("Age\tCanVote");
		for (String[] a : arr)
			System.out.println(a[0] + "\t" + a[1]);
	}
	public static void main(String[] args) {
		int[] ages = randomAges(10);
		String[][] arr = canVote(ages);
		show(arr);
	}
}
