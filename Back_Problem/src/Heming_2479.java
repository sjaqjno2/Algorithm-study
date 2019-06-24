import java.io.*;
import java.util.ArrayList;

public class Heming_2479 {
	static int A;
	static int B;
	static int N;
	static int K;
	static String arr[];
	static boolean visit[];
	static int adj[][];
	static ArrayList ans;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str[] = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		K = Integer.parseInt(str[1]);
		arr = new String[N + 1];
		adj = new int[N + 1][N + 1];
		visit = new boolean[N + 1];
		ans = new ArrayList();

		for (int i = 1; i <= N; i++) {
			arr[i] = br.readLine();
		}

		str = br.readLine().split(" ");
		A = Integer.parseInt(str[0]);
		B = Integer.parseInt(str[1]);

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= N; j++) {
				if (search(i, j)) {
					adj[i][j] = 1;
					adj[j][i] = 1;
				}
			}
		}
		System.out.print(A + " ");

		dfs(A);

	}

	static void dfs(int A) {
		for (int i = 1; i <= N; i++) {
			if (adj[A][i] == 1 && visit[i] != true) {
				visit[A] = true;
				ans.add(i);
				if (i == B) {
					for (int j = 0; j < ans.size(); j++) {
						System.out.print(ans.get(j) + " ");
					}
				} dfs(i);

			}
		}
	}

	static boolean search(int x, int y) {
		int cnt = 0;

		for (int i = 0; i < K; i++) {
			if (arr[x].charAt(i) != arr[y].charAt(i)) {
				cnt++;
				if (cnt >= 2) {
					cnt = 0;
					return false;
				}
			}
			if (cnt == 0 && i == K - 1) {
				return false;
			}

		}
		return true;

	}

}
