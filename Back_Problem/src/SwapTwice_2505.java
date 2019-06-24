import java.io.*;

public class SwapTwice_2505 {
	static int arr[];
	static int ori[];
	static int n;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		int x = 0;
		int y = 0;
		
		n = Integer.parseInt(br.readLine());
		arr = new int[n+1];
		ori = new int[n+1];
		
		String str[] = new String[n];
		str = br.readLine().split(" ");
		
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(str[i-1]);
			ori[i] = arr[i];
		}
		
		for(int i=1; i<=n; i++) {
			if(arr[i] != i) {
				x = i;
				y = search(i);
				
				swap(i, search(i));				
				System.out.println(x+" "+y);

			}
		}	
	}
	
	static void swap(int a, int b) {
		int temp;
		for(int i=a,j=0; i<(a+b)/2.0; i++,j++) {
			temp = arr[i];
			arr[i] = arr[b-j];
			arr[b-j] = temp;
		}
	}
	
	static int search(int a) {
		int ans = 0;
		
		for(int i=1; i<=n; i++) {
			if(arr[i] == a) {
				ans = i;
				break;
			}
		}	
		return ans;

	}
}