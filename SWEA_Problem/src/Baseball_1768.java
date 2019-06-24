import java.util.Scanner;

public class Baseball_1768 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String answer[] = sc.next().split("");
		int strike = 0;
		int ball = 0;
		
		for(int k=0; k<4; k++) {
			String arr[] = sc.next().split("");

		for(int i=0; i<4; i++) {
			
			for(int j=0; j<4; j++) {
			if(i==j && answer[i].equals(arr[j])) {
				strike++;
			} if(i!=j && answer[i].equals(arr[j])) {
				ball++;
			}
			
			}
			
		}
		System.out.println("Strike: "+strike+" Ball: "+ball);
		
		strike = 0;
		ball = 0;
		
		}
	}

}
