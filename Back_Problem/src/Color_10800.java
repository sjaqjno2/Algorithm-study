import java.io.*;
import java.util.StringTokenizer;

public class Color_10800 {
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n+1];
		int b[] = new int[n+1];
		int c[] = new int[n+1];
		
			for(int i=1; i<=n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int j = Integer.parseInt(st.nextToken());
				int k = Integer.parseInt(st.nextToken());
				a[i] = j;
				b[i] = k;			
			}
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(a[i] != a[j] && b[i] > b[j]) {
						c[i] += b[j];
					}
				}
				System.out.println(c[i]);
			}			
	}
}

class Node {
	int i, j, k;
	
	Node(int a, int b, int c){
		this.i = a;
		this.j = b;
		this.k = c;
	}
	
	int Node(int i){
		return j;
	}
}
