import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FixNum_2494 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int cur[] = new int [N];
		int arr[] = new int [N];
		String str[] = new String[N];
		str = br.readLine().split("");
		int sum = 0;
		
		for(int i=0; i<N; i++) {
			cur[i] = Integer.parseInt(str[i]);
		}
		int ans[] = new int[N];
		str = br.readLine().split("");
		
		for(int i=0; i<N; i++) {
			ans[i] = Integer.parseInt(str[i]);		
		}
		
		for(int i=0; i<N; i++) {
			arr[i] = ans[i] - cur[i];
			sum += Math.abs(arr[i]);
			if(i+1<N) {
				for(int j=1; j<N; j++) {
					cur[j] += arr[i];
				}
			}			
		}
		System.out.println(sum);
		
		for(int i=0; i<N; i++) {
			System.out.println(i+1+" "+ arr[i]);
		}	
				
	}

}
