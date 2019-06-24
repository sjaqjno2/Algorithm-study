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
		
        Arrays.sort(arr,(conference1 , conference2) -> conference1[1]==conference2[1] ? conference1[0]-conference2[0] : conference1[1]-conference2[1]); //������ �ð���� ����, ���� ������ ���� �ð����� ����
			
        for (int i = 0; i < n; i++) {

            if (arr[i][0] >= endTime){  //���� ���ؽð� ���� ���� �ð��� ���� �� �ش� ȸ�Ǹ� ����.
                result++;
                endTime = arr[i][1];    //ȸ�Ǹ� �����ϸ� ���� �ð��� ������ ȸ���� ���� ������ �ȴ�.
            }
        }

        System.out.println(result);
        
		}
		
	}


