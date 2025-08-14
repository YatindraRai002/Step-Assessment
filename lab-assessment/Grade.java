import java.util.*;
class Grade {
	static int[][] randomScores(int n) {
		int[][] arr = new int[n][3];
		Random r = new Random();
		for (int i = 0; i < n; i++)
			for (int j = 0; j < 3; j++)
				arr[i][j] = r.nextInt(90) + 10;
		return arr;
	}
	static double[][] calcStats(int[][] arr) {
		int n = arr.length;
		double[][] stats = new double[n][3];
		for (int i = 0; i < n; i++) {
			int total = arr[i][0] + arr[i][1] + arr[i][2];
			double avg = Math.round((total / 3.0) * 100) / 100.0;
			double perc = Math.round((total / 300.0 * 100) * 100) / 100.0;
			stats[i][0] = total;
			stats[i][1] = avg;
			stats[i][2] = perc;
		}
		return stats;
	}
	static String[] calcGrade(double[] perc) {
		String[] grade = new String[perc.length];
		for (int i = 0; i < perc.length; i++) {
			double p = perc[i];
			grade[i] = p >= 80 ? "A" : p >= 70 ? "B" : p >= 60 ? "C" : p >= 50 ? "D" : p >= 40 ? "E" : p >= 0 ? "R" : "R";
		}
		return grade;
	}
	static void show(int[][] arr, double[][] stats, String[] grade) {
		System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAvg\tPerc\tGrade");
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"\t"+arr[i][0]+"\t"+arr[i][1]+"\t"+arr[i][2]+"\t"+(int)stats[i][0]+"\t"+stats[i][1]+"\t"+stats[i][2]+"\t"+grade[i]);
		}
	}
	public static void main(String[] args) {
		int n = 10;
		int[][] arr = randomScores(n);
		double[][] stats = calcStats(arr);
		double[] perc = new double[n];
		for (int i = 0; i < n; i++) perc[i] = stats[i][2];
		String[] grade = calcGrade(perc);
		show(arr, stats, grade);
	}
}
