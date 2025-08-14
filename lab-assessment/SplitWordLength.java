import java.util.*;
class SplitWordLength {
	static int len(String s) {
		int c = 0;
		try {
			for (;;)
				s.charAt(c++);
		} catch (Exception e) {}
		return c - 1;
	}
	static String[] splitWords(String s) {
		int n = len(s), wc = 1;
		for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') wc++;
		int[] idx = new int[wc + 1];
		int k = 1;
		for (int i = 0; i < n; i++) if (s.charAt(i) == ' ') idx[k++] = i;
		idx[0] = -1; idx[wc] = n;
		String[] words = new String[wc];
		for (int i = 0; i < wc; i++) words[i] = s.substring(idx[i] + 1, idx[i + 1]);
		return words;
	}
	static String[][] wordLengths(String[] words) {
		String[][] arr = new String[words.length][2];
		for (int i = 0; i < words.length; i++) {
			arr[i][0] = words[i];
			arr[i][1] = String.valueOf(len(words[i]));
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = splitWords(s);
		String[][] arr = wordLengths(words);
		System.out.println("Word\tLength");
		for (String[] a : arr)
			System.out.println(a[0] + "\t" + Integer.parseInt(a[1]));
	}
}
