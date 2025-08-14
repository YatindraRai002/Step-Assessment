import java.util.*;
public class Rock {
	static String compChoice() {
		int c = (int)(Math.random()*3);
		return c==0?"rock":c==1?"paper":"scissors";
	}
	static int winner(String u, String c) {
		if(u.equals(c))return 0;
		if(u.equals("rock")&&c.equals("scissors")||u.equals("paper")&&c.equals("rock")||u.equals("scissors")&&c.equals("paper"))return 1;
		return -1;
	}
	static String[][] stats(int p,int comp,int n){
		String[][] arr=new String[2][3];
		arr[0][0]="Player";arr[1][0]="Computer";
		arr[0][1]=String.valueOf(p);arr[1][1]=String.valueOf(comp);
		arr[0][2]=String.valueOf((int)(p*100.0/n)+"%");arr[1][2]=String.valueOf((int)(comp*100.0/n)+"%");
		return arr;
	}
	static void show(String[][] arr){
		System.out.println("Name\tWins\tWin%");
		for(String[]a:arr)System.out.println(a[0]+"\t"+a[1]+"\t"+a[2]);
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Games: ");
		int n=sc.nextInt(),p=0,comp=0;
		for(int i=0;i<n;i++){
			System.out.print("rock/paper/scissors: ");
			String u=sc.next();
			String c=compChoice();
			int w=winner(u,c);
			if(w==1)p++;else if(w==-1)comp++;
			System.out.println("User: "+u+" Computer: "+c+" Winner: "+(w==0?"Draw":w==1?"User":"Computer"));
		}
		show(stats(p,comp,n));
	}
}
