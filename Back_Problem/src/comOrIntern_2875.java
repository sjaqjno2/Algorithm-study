import java.util.Scanner;

public class comOrIntern_2875 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		
		for(int i=0; i<k; i++) {
			if(n>2*m) {
				n = n-1;
				} else { 
					m = m-1;
				}
		}
		System.out.println(n);
		System.out.println(m);
		if(n>2*m)
		System.out.println("ÆÀ °³¼ö :"+m);
		else
		System.out.println("ÆÀ °³¼ö :"+n/2);



	}

}
