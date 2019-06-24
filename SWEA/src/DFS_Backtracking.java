import java.util.Scanner;

public class DFS_Backtracking {
	static int[] visited = new int [8];
	static int[][] arr = new int [8][8];
	
	static void dfs(int v) {   //dfs¿Á±Õ
		System.out.print(v+" ");
		visited[v] = 1;
		
		for(int i=1; i<=7; i++) {
			if(visited[i] == 0 && arr[v][i] == 1) {
				dfs(i);
			}
		}
	}
	
	public static void main(String args[]) {
		int a, b;
		for(int i=0; i<7; i++) {
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		dfs(1);
		
	}

}
