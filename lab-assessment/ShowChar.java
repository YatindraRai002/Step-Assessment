import java.util.*;
class ShowChar {
	static String type(char ch) {
		if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
		if (ch >= 'a' && ch <= 'z') {
			if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') return "Vowel";
			return "Consonant";
		}
		return "Not a Letter";
	}
	static String[][] charTypes(String s) {
		int n = s.length();
		String[][] arr = new String[n][2];
		for (int i = 0; i < n; i++) {
			arr[i][0] = String.valueOf(s.charAt(i));
			arr[i][1] = type(s.charAt(i));
		}
		return arr;
	}
	static void show(String[][] arr) {
		System.out.println("Char\tType");
		for (String[] a : arr)
			System.out.println(a[0] + "\t" + a[1]);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		show(charTypes(s));
	}
}
