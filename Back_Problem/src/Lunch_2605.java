import java.io.*;
import java.util.StringTokenizer;

public class Lunch_2605 {
	public static void main(String args[]) throws IOException {
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		int r[] = new int[n+1];
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int temp = 0;

		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=1; i<=n; i++) {
			r[i] = i;
		}
		
		for(int i=1, j=1; i<=n; i++, j++) {	
				while(arr[j]>0) {
					temp = r[i];
					r[i] = r[i-1];
					r[i-1] = temp;
					arr[j]--;	
					i--;
					}
				i = j;
		}
		
		for(int i=1; i<=n; i++) {
			System.out.println(r[i]);
		}
		
		
	}

}
