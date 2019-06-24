import java.io.*;
import java.util.StringTokenizer;

public class Divisor_2591 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int divisor[] = new int[n];
		int j = 1;
		
		for(int i=1; i<=n/2; i++) {
			if(n%i == 0) {
				divisor[j] = i;
				j++;
			}
		}
		
		if(j >= k) System.out.println(divisor[k]);
		else System.out.println(0);
		

	}

}
