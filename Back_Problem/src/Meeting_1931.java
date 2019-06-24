import java.util.Scanner;
import java.util.Arrays;

public class Meeting_1931 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = new int [n][2];
		int result = 0;
		int endTime = 0;
		
		for(int i=0; i<n; i++) {
			arr[i][0] = sc.nextInt();
			arr[i][1] = sc.nextInt();
		}
		
        Arrays.sort(arr,(conference1 , conference2) -> conference1[1]==conference2[1] ? conference1[0]-conference2[0] : conference1[1]-conference2[1]); //끝나는 시간대로 정렬, 만약 같으면 시작 시간으로 정렬
			
        for (int i = 0; i < n; i++) {

            if (arr[i][0] >= endTime){  //현재 기준시간 보다 시작 시간이 빠를 시 해당 회의를 선택.
                result++;
                endTime = arr[i][1];    //회의를 선택하면 기준 시간이 선택한 회의의 종료 시점이 된다.
            }
        }

        System.out.println(result);
        
		}
		
	}


