import java.io.*;
import java.util.Arrays;

public class Short_2309 {
	public static void main(String args[]) throws IOException{
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int arr[] = new int [9];
		int sum = 0;
		
		for(int i=0; i<9; i++) {
			arr[i] += Integer.parseInt(br.readLine());

			sum += arr[i];
		}
		
		Arrays.sort(arr);

		for(int i=0; i<9; i++) {
			System.out.println(arr[i]);
		}

		
		for(int i=0; i<9; i++) {
			for(int j=0; j<9; j++) {
				
				if(sum - arr[i] - arr[j] == 100) {
					for(int k=0; k<9; k++) {
						if(k != i && k != j) {
						System.out.println(arr[k]);
						}
					}
					break;
				}
				break;

			}
			break;
		}
		
	}

}
