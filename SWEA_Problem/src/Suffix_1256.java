import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Suffix_1256 {
	public static void main(String args[]) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int tcase = Integer.parseInt(br.readLine());
		int t = tcase;
		while(tcase-- > 0) {
			int k = Integer.parseInt(br.readLine());
			String str = br.readLine();
			String arr[] = new String[str.length()];

			for(int i=0; i<str.length(); i++) {
				arr[i] = str.substring(i);
			}
			int count = t - tcase;
			Arrays.sort(arr);
			System.out.println("#" + count + " " + arr[k-1]);
			
		}
	
	}
	
}
