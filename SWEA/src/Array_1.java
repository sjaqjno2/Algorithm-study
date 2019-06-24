import java.util.Arrays;
import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int roomwidth = sc.nextInt();
		int roomheight = sc.nextInt();
		int[][] room = new int[roomwidth][roomheight];
		int testCase = 1;
		int countEmptySpace = 0;
		int maxdif=0;

		
		
		for(int T=0; T<testCase; T++) {
			for(int i=0; i<roomwidth; i++) {
				for(int j=0; j<roomheight; j++) {
					room[i][j]=0;
				}
			}
			
			for(int i=0; i<roomwidth; i++) {
				int boxheight = sc.nextInt();

				for(int j=0; j<boxheight; j++) {
					room[i][j]=1;
				}
			}
			for(int i=0; i<roomwidth; i++) {
				for(int j=0; j<roomheight; j++) {
					if(j==roomheight-1) {
					}
				}
			}
			
			
			for(int i=0; i<roomwidth; i++) {
				for(int j=0; j<roomheight; j++) {
					if(room[i][j]==1) {
						countEmptySpace = 0;
						for(int k=i+1; k<roomwidth; k++) {
							if(room[k][j]==0) {
								countEmptySpace += 1;
								if(countEmptySpace > maxdif) {
									maxdif = countEmptySpace;
								}
								
							}
						}
					}
				}
			}
		}
		System.out.println(maxdif);
		for(int j=room.length-1; j>=0; j--) {
			for(int i=0; i<room.length; i++) {
				System.out.print(room[i][j]);
				if(i==room.length-1) {
					System.out.println();
					}
		};
		}			
	}
}

