import java.util.*;
class TrimSpace {
	static int[] trimIdx(String s) {
		int n = s.length(), start = 0, end = n - 1;
		while (start < n && s.charAt(start) == ' ') start++;
		while (end >= 0 && s.charAt(end) == ' ') end--;
		return new int[]{start, end};
	}
	static String subStr(String s, int start, int end) {
		StringBuilder sb = new StringBuilder();
		for (int i = start; i <= end; i++) sb.append(s.charAt(i));
		return sb.toString();
	}
	static boolean cmp(String a, String b) {
		if (a.length() != b.length()) return false;
		for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] idx = trimIdx(s);
		String t1 = subStr(s, idx[0], idx[1]);
		String t2 = s.trim();
		System.out.println("Trimmed (manual): '" + t1 + "'");
		System.out.println("Trimmed (built-in): '" + t2 + "'");
		System.out.println("Equal: " + cmp(t1, t2));
	}
}
