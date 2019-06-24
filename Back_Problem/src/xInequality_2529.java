import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
public class xInequality_2529 {
	public static void main(String args[]) throws IOException{
		
	}
	static boolean[] visited = new boolean[10];
	static ArrayList<String> list = new ArrayList<String>();
	static String[] input;
	static int k;
	 
	private void solve() {
	    /*k = sc.nextInt();
	    input = sc.readLine().split(" ");*/
	 
	    for (int i = 0; i <= 9; i++) {
	        visited[i] = true;
	        dfs(i, 0, i + "");
	    }
	    System.out.println(list.get(list.size() - 1));
	    System.out.println(list.get(0));
	}
	 
	public static void dfs(int v, int cnt, String str) {
	    if (cnt == k) {
	        // success
	        list.add(str);
	    } else {
	        for (int i = 0; i <= 9; i++) {
	            if (!visited[i]) {
	                if (input[cnt].equals("<")) {
	                    if (v >= i) {
	                        continue;
	                    }
	                } else {
	                    if (v <= i) {
	                        continue;
	                    }
	                }
	                visited[i] = true;
	                dfs(i, cnt + 1, str + i);
	            }
	        }
	    }
	    // backtracking
	    visited[v] = false;
	}

}
