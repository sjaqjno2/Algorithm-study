import java.util.*;

public class Baby_gin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[6];
		int[] count = new int[10];
		String answer1=null;
		String answer2=null;


		for(int i=0; i<6; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<10; i++) {
			count[i] = 0;
		}
		
		for(int i=0; i<6; i++) {
		switch(arr[i]) {
			case 0: count[0]+=1;
			break;
			
			case 1: count[1]+=1;
			break;
			
			case 2: count[2]+=1;
			break;
			
			case 3: count[3]+=1;
			break;
			
			case 4: count[4]+=1;
			break;
			
			case 5: count[5]+=1;
			break;
			
			case 6: count[6]+=1;
			break;
			
			case 7: count[7]+=1;
			break;
			
			case 8: count[8]+=1;
			break;
			
			case 9: count[9]+=1;
			break;
		}
		}
		for(int i=0; i<10; i++) {
			if(count[i]>=3) {
				answer1 = "Triple";
				count[i]-=3;
			}
		}
		for(int i=0; i<7; i++) {
			if(count[i]==1&&count[i+1]==1&&count[i+2]==1) {
				answer2= "Run";
				count[i]-=1;
				count[i+1]-=1;
				count[i+2]-=1;
			}
		}
		if(answer1=="Triple" && answer2=="Run") {
			System.out.println("Baby-Gin");
		} else {
			System.out.println("Nothing");
		}
	}

}
