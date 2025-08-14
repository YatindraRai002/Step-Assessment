import java.util.*;
public class StringMethods {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String fullName = scanner.nextLine();
		String lang = scanner.nextLine();
		String sentence = scanner.nextLine();
		String[] names = fullName.split(" ");
		String first = names[0], last = names[names.length-1];
		int charCount = sentence.replace(" ","").length();
		String langUp = lang.toUpperCase();
		System.out.println("First Name: " + first);
		System.out.println("Last Name: " + last);
		System.out.println("Language: " + langUp);
		System.out.println("Sentence Characters: " + charCount);
		System.out.println("Summary: " + first + " " + last + " likes " + langUp + ". Experience: " + sentence);
		scanner.close();
	}
}
