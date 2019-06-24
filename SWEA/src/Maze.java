import java.util.Scanner;

public class Maze {
	public final int MAX_SIZE = 100;
	public final static int IS_VISITED = 1;
	public final static int NOT_VISITED = 0;
	public final int POSSIBLE_WAY = 1;
	public final int IMPOSSIBLE_WAY = 0;
	
	static int[][] maze = new int[100][100];
	static int[][] visited = new int[100][100];
	
	int findPath(int x, int y) {
		int tempResult = 0;
		if(maze[x][y] == 1 || visited[x][y] == IS_VISITED) {
			return IMPOSSIBLE_WAY;
		} else if(maze[x][y] == 3) {
			return POSSIBLE_WAY;
		} else {
			visited[x][y] = IS_VISITED;
			
			tempResult += findPath(x-1, y);
			tempResult += findPath(x+1, y);
			tempResult += findPath(x, y-1);
			tempResult += findPath(x, y+1);
			
			visited[x][y] = NOT_VISITED;
			return tempResult;

		}
	}
	
	public static void main(String args[]) {
		
		for(int i=0; i<100; i++) {
			for(int j=0; j<100; j++) {
				maze[i][j] = 1;
				visited[i][j] = NOT_VISITED;
			}
		}
		Scanner sc = new Scanner(System.in);
		int w = sc.nextInt();
		int h = sc.nextInt();
		char input[] = new char[100];
		
		for(int i=0; i<w; i++) {
			input = sc.next().toCharArray();

			for(int j=0; j<h; j++) {
				maze[i][j] = input[j];
				
			}
		}
		
	}

}
