
public class Selection_sort {
	static int ss(int arr[][]){
		int min=0;
		int minX=0, minY=0;
		min = arr[0][0];
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(min > arr[i][j]) {
					min = arr[i][j];
					minX = i;
					minY = j;
				}
				arr[minX][minY] = 1000;
			}
			
		}
		return min;
	}
	
	public static void main(String args[]) {
		int arr[][] = new int[5][5];
		int sorted[][] = new int[5][5];
		int dx[] = {0, 0, -1, 0};
		int dy[] = {1, 1, 0, -1};
		int cur_min = -1;
		int dir_stat = 0;
		int X, Y;
		int newX=0, newY=0;
		
		for(int j=0; j<5; j++) {
			for(int i=0; i<5; i++) {
				arr[i][j] = 5*i + j;
				System.out.print(arr[i][j]+" ");
				if(i==4) {
					System.out.println();
				}
			}
		}
		
		System.out.println();

		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				sorted[i][j] = ss(arr);
				System.out.print(sorted[i][j]+" ");
				
				if(j==4) {
					System.out.println();
				}
			}
		}
				
		/*for(int i=0; i<25; i++) {
			cur_min = ss(arr);
			X = newX;
			Y = newY;
			sorted[X][Y] = cur_min;
			newX = X + dx[dir_stat];
			newY = Y + dy[dir_stat];
			
		
			if(newX>4 || newY>4) {
				dir_stat = (dir_stat + 1) % 4;
				newX = X + dx[dir_stat];
				newY = Y + dy[dir_stat];
			}
		}
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				System.out.print(sorted[i][j]);
			}
		}*/
		
	}

}
