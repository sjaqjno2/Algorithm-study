import java.io.*;
import java.util.ArrayList;

public class xLadder_2528 {
	static ArrayList<LD> arr;
	static int N;
	static int dir, Ndir;
	static int left, Nleft;
	static int right, Nright;
	static int k = 1;
	static int cnt = 0;
	
	public static void main(String args[]) throws IOException{
		BufferedReader br = new BufferedReader(
				new InputStreamReader(System.in));
		String str[] = new String[2];
		str = br.readLine().split(" ");
		N = Integer.parseInt(str[0]);
		int L = Integer.parseInt(str[1]);
		int length[] = new int[N+1];
		int direction[] = new int[2];
		arr = new ArrayList();
		
		for(int i=1; i<=N; i++) {
			str = br.readLine().split(" ");
			int a = Integer.parseInt(str[0]);
			int dir = Integer.parseInt(str[1]);
			if(dir==0) {
				arr.add(new LD(0,a,dir));
			}
			else {
				arr.add(new LD(L-a,L,dir));
			}		
		}
		
		for(int i=0; i<N; i++) {
			if(i<N-1) {
			dir = arr.get(i).dir;
			Ndir = arr.get(i+1).dir;
			left = arr.get(i).left;
			Nleft = arr.get(i+1).left;
			right = arr.get(i).right;
			Nright = arr.get(i+1).right;
			}
			
			if(Ndir == dir) {
				k++;
			} else {
				switch(dir) {
				case 0:
					for(int j=0; j<(Nleft - right)/2.0; j++) {
						start();
					}
					k++;
					break;
				
				case 1:
					for(int j=0; j<(left - Nright)/2.0; j++) {
						start();
					} 
					k++;
					break;
					}				
			}
			//if(k==5) break;
		}			
		System.out.println(cnt+" "+k);		
	}
	
	static void start() {
		for(int i=0; i<N; i++) {				
			if(dir == 0) {
				left++;
				right++;
			} else {
				left--;
				right--;
			}		
		}
		cnt++;
	}
		
		
}

class LD{
	int left;
	int right;
	int dir;
	
	LD(int a, int b, int c){
		left = a;
		right = b;
		dir = c;
	}
}
