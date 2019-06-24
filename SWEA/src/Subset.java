import java.util.Scanner;

public class Subset {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int test = sc.nextInt();
		int[] arr = new int[test];
		int sum, ret = 0;
		
		for(int a=0; a<test; a++) {
		arr[a] = sc.nextInt();
		}
		
		for(int i=0; i<(1<<5); i++) {
			sum = 0;
			for(int j=0; j<5; j++) {
				if(i==(1<<j)) {
					sum += arr[j];
				}
			}
			
			if(sum==0) {
				ret = 1;
			} else ret = 0;
		}
		
		System.out.println(ret);
		
		
		
	}
}
