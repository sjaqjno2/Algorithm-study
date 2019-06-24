import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Flower_2457 {
	static int[] st;
	static int[] ed;
	static int cnt = 0;
	static int N;
	static int a = 308;
	static int b = 1131;
	static int max;
	
	public static void main(String args[]) throws IOException {
		long startTime = System.currentTimeMillis();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		st = new int[N];
		ed = new int[N];
		
		String[] str = new String[4];

		for (int i = 0; i < N; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int b = Integer.parseInt(str[1]);
			st[i] = 100*a + b;
			int c = Integer.parseInt(str[2]);
			int d = Integer.parseInt(str[3]);
			ed[i] = 100*c + d;
		}
		
		search(a);
		System.out.println(cnt);
		long estimatedTime = System.currentTimeMillis() - startTime;
		System.out.println(estimatedTime);

	}
	
	static void search(int sf) {
		for (int i = 0; i < N; i++) {
			if (sf >= st[i]) {
				if (sf <= ed[i]) {
					max = ed[i];

				}
			}
		}
		cnt++;
		if(max < b) {
			search(max);
		}  
	}

}
