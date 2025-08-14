import java.util.*;
class SplitWords {
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
	static boolean cmp(String[] a, String[] b) {
		if (a.length != b.length) return false;
		for (int i = 0; i < a.length; i++) if (!a[i].equals(b[i])) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] w1 = splitWords(s);
		String[] w2 = s.split(" ");
		System.out.println(Arrays.toString(w1));
		System.out.println(Arrays.toString(w2));
		System.out.println(cmp(w1, w2));
	}
}
