import java.util.*;
class CountVowelsConst {
	static String type(char ch) {
		if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
		if (ch >= 'a' && ch <= 'z') {
			if (ch == 'a'||ch == 'e'||ch == 'i'||ch == 'o'||ch == 'u') return "Vowel";
			return "Consonant";
		}
		return "Not a Letter";
	}
	static int[] countVC(String s) {
		int v = 0, c = 0;
		for (int i = 0;; i++) {
			try {
				char ch = s.charAt(i);
				String t = type(ch);
				if (t == "Vowel") v++;
				else if (t == "Consonant") c++;
			} catch (Exception e) { break; }
		}
		return new int[]{v, c};
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] res = countVC(s);
		System.out.println("Vowels: " + res[0]);
		System.out.println("Consonants: " + res[1]);
	}
}
