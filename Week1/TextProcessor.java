import java.util.*;
public class TextProcessor {
	public static String cleanInput(String input) {
		return input.trim().replaceAll(" +", " ").toLowerCase();
	}
	public static void analyzeText(String text) {
		int words = text.split(" ").length;
		int chars = text.replace(" ","").length();
		int sentences = text.split("[.!?]").length;
		String[] arr = text.split(" ");
		String longest = arr[0];
		for(String w:arr) if(w.length()>longest.length()) longest=w;
		int[] freq = new int[256];
		for(char c:text.toCharArray()) freq[c]++;
		char most=' ';int max=0;
		for(int i=0;i<256;i++) if(freq[i]>max&&i!=' '){max=freq[i];most=(char)i;}
		System.out.println("Words: "+words);
		System.out.println("Characters: "+chars);
		System.out.println("Sentences: "+sentences);
		System.out.println("Longest word: "+longest);
		System.out.println("Most common char: "+most);
	}
	public static String[] getWordsSorted(String text) {
		String[] arr = text.replaceAll("[.,!?]","").split(" ");
		Arrays.sort(arr);
		return arr;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("=== TEXT PROCESSOR ===");
		String input = scanner.nextLine();
		String cleaned = cleanInput(input);
		analyzeText(cleaned);
		System.out.println(Arrays.toString(getWordsSorted(cleaned)));
		scanner.close();
	}
}
