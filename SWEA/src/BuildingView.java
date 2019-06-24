import java.util.Scanner;

public class BuildingView {
	public static void main(String args[]) {
		for(int k=0; k<10; k++) {
			
		Scanner sc = new Scanner(System.in);
		int tc = Integer.parseInt(sc.nextLine());
		int[][] arr = new int[255][tc];
		int count = 0;
		
		
		for(int i=0; i<tc; i++) {
			int height = Integer.parseInt(sc.next());
			for(int j=0; j<height; j++) {
				arr[j][i] = 1;
			}
		}
		
		for(int i=2; i<tc-2; i++) {
			for(int j=0; j<255; j++) {
				if(arr[j][i]==1 && arr[j][i-1]==0 && arr[j][i-2]==0 && arr[j][i+1]==0 && arr[j][i+2]==0) {
					count++;
				}
			}
		}
		int num = k+1;
		System.out.println("#"+num+" "+count);
		num++;	
		}
		
	}
}
