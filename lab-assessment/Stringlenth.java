import java.util.*;
class Stringlenth {
	static int len(String s) {
		int c = 0;
		try {
			for (;;) 
				s.charAt(c++);
		} catch (Exception e) {}
		return c - 1;
	}
	public static void main(String[] a) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.print(len(s) + " " + s.length());
	}
}
