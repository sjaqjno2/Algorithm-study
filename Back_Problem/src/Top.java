import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Top {

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		String str[] = new String[n];
		str = br.readLine().split(" ");
		int ans[] = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		for(int i=n-1; i>=0; i--) {
			for(int j=i-1; j>=0; j--) {
				if(arr[i]<arr[j]) {
					ans[i] = j+1;
					break;
				}
				
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(ans[i]+" ");
		}
	}

}
