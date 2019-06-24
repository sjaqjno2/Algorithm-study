import java.io.*;

public class xLock_2478 {
	static int ans[];
	static int N;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader
				(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		String str[] = new String[N];
		ans = new int[N+1];
		str = br.readLine().split(" ");
		int cnt = 0;
		int bnt = 0;
		int x = 0;
		int y = 0;
		int z = 0;
		
		for(int i=1; i<=N; i++) {
			ans[i] = Integer.parseInt(str[i-1]);
		}
		ans[0] = Integer.parseInt(str[N-1]);
		
		for(int i=1; i<=N; i++) {
			bnt++;
			if(bnt>10) break;
			if(i==N) i=0;
			if(ans[i] == ans[i+1]-1) {
				continue;
			}
			else if(ans[i]==ans[i+1]+1 || ans[i]==ans[i+1]-9) {
				cnt++;
				y = i;
				x = y - cnt + 1;
			}
			
		}
		swap(x, y);
		
		for(int i=1; i<=N; i++) {
			if(ans[i]!=i) {
				z = search(i);
				

				break;
			}
		}
		
		System.out.println(x+" "+y);
		System.out.println(z);
		
	}
	
	static void swap(int x, int y) {
		int temp;
		for(int i=x, j=y; i<(x+y)/2; i++, j--) {
			temp = ans[i];
			ans[i] = ans[j]; 
			ans[j] = temp;
		}
	}
	
	static int search(int i) {
		int index = 0;
		for(int j=1; j<=N; j++) {
			if(ans[j]==i) {
				index = j;
			}
		}
		return index;
	}
}