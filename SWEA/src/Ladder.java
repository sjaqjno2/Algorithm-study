import java.util.Scanner;

public class Ladder {
	public static void main(String args[]) {
		int[][] arr = new int[5][5];
		int sum = 0;
		int newX, newY = 0;
		int dx[] = {0,0,-1,1};
		int dy[] = {-1,1,0,0};
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				arr[i][j] = (int)(Math.random()*100) + 1;
				System.out.print(arr[i][j]+" ");
				if(j==4) {
					System.out.println();
				}
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				for(int k=0; k<4; k++) {
					newX = i + dx[k];
					newY = j + dx[k];
					if(!wall(newX, newY)) {
						sum += abs(arr[i][j], arr[newX][newY]);
					}
				}
				
				

			}
		}
		System.out.print(sum);
	}
	
	static boolean wall(int x, int y) {
		if(x<0 || x>=5) return true;
		if(y<0 || y>=5) return true;
		return false;
	}
	
	static int abs(int a1, int a2) {
		return(a1-a2) > 0 ? (a1-a2) : -(a1-a2);
	}
}
