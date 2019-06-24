import java.util.*;
//최빈수 구하기
public class Frequency {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int testcase = sc.nextInt();
		int[] arr = new int[1000];
		int[] count = new int[1000];
		int max = 0;
		int num = 0;
		
        while(testcase>0){
        	testcase--;
		for(int i=0; i<1000; i++) {
			arr[i] = Integer.parseInt(sc.next());
		}
		
		for(int i=0; i<1000; i++) {
			count[arr[i]]++;
		}
		
		for(int i=0; i<count.length; i++) {
			if(max<count[i]) {
				max = count[i];
				num = i;
			}
		}
		System.out.println(max);
		System.out.println(num);
        }
	}
}

