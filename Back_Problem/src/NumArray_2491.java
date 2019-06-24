import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumArray_2491 {


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n];
		int cnt=1;
		int max=0;
		
		String str[] = new String[n];
		str = br.readLine().split(" ");
		
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		
		for(int i=0; i<n-1; i++) {
			if(arr[i+1]>=arr[i]) {
				cnt++;
				if(max<cnt) max=cnt;
			} else cnt=0;
		}
		
		System.out.println(max);
	}

}
