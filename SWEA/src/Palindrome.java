import java.util.*;

public class Palindrome {
	public static void main(String args[]) {
		boolean flag;
		int count = 0;
		int rcount = 0;
		String[][] arr = new String[8][8];
		
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		
		for(int a=0; a<8; a++) {
			for(int b=0; b<8; b++) {
				String c = sc.next();
				arr[a][b] = c;
			}
		}
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<8; j++) {
				System.out.print(arr[i][j]);
				if(j==7) {
					System.out.println();
				}
			}
		}
		
		
		
		for(int i=0; i<9-tc; i++) {
			for(int j=0; j<8; j++) {
				for(int k=0; k<tc/2; k++) {
					if(arr[i+k][j].equals(arr[i+tc-1-k][j])) {
						count = count + 1;
					}
					}
				if(count==tc/2) {
					rcount = rcount + 1;
				}
				count = 0;
				}
		}
		
		for(int i=0; i<8; i++) {
			for(int j=0; j<9-tc; j++) {
				for(int k=0; k<tc/2; k++) {
					if(arr[i][j+k].equals(arr[i][j+tc-1-k])) {
						count = count + 1;

					} else { 
						count = count - 1;

						}
					}
				if(count==tc/2) {
					rcount = rcount + 1;

				}
				count = 0;
				}
		}
		
		System.out.println(rcount);
		
	}

}
