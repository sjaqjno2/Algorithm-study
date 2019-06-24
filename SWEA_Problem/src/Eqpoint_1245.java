import java.util.Scanner;
import java.math.*;
public class Eqpoint_1245 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		int[] m = new int[N];
		double [] d = new double[N-1];
		
		for(int i=0; i<N; i++) {
			p[i] = sc.nextInt();
		}
		for(int i=0; i<N; i++) {
			m[i] = sc.nextInt();
		}
		for(int i=0; i<N-1; i++) {
			d[i] = 
Math.sqrt(m[i])*(p[i+1]-p[i])/(Math.sqrt(m[i+1])+Math.sqrt(m[i]));

		}
	
		for(int i=0; i<N-1; i++) {
		System.out.println(p[i]+d[i]);
		}
	}

}
