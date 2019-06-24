import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Password_1240 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		String[] arr = new String[a*b];
		arr = sc.next().split("");
		Queue<String> que = new LinkedList<>();
		LinkedList<String> list = new LinkedList<>();
		list.add("0");
		list.add("1");
		list.add("1");
		list.add("1");
		list.add("0");
		list.add("1");
		list.add("1");


		int result;

				
		/*for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				if(i*j <= arr.length) {
				arr[i][j] = sc.next().charAt(i*b+j);
				}
			}
		}
		*/
		System.out.println();
		/*for(int i=0; i<120; i++) {
			System.out.print(arr[i]);
		}*/

		/*for(int i=0; i<a; i++) {
			for(int j=0; j<b; j++) {
				System.out.print(arr[i*b+j]);
				if(j==b-1) {
					System.out.println();
				}
			}
		}*/
		for(int i=0; i<arr.length-6; i++) {
			for(int j=0; j<7; j++) {
				que.add(arr[i+j]);
				System.out.print(que);
			}
				if(que.equals("0001101")) {
					result = 0;
					i += 7;
					System.out.print(result+" ");
				}
				if(que.equals("0011001")) {
					result = 1;
					i += 7;
					System.out.print(result+" ");
				}
				if(que.equals("0010011")) {
					result = 2;
					i += 7;
					System.out.print(result+" ");
				}
				if(que.equals("0111101")) {
					result = 3;
					i += 7;
					System.out.print(result+" ");
				}
				if(que.equals("0100011")) {
					result = 4;
					i += 7;
					System.out.print(result+" ");
				}
				if(que.equals("0110001")) {
					result = 5;
					i += 7;
					System.out.print(result+" ");
				}
				if(que.equals("0101111")) {
					result = 6;
					i += 7;
					System.out.print(result+" ");
				}
				if(que.equals(list)) {
					result = 7;
					i += 7;
					System.out.println(result+" ");
				}
				if(que.equals("0110111")) {
					result = 8;
					i += 7;
					System.out.print(result+" ");
				}
				if(que.equals("0001011")) {
					result = 9;
					i += 7;
					System.out.print(result+" ");
				}
				else {
					que.clear();
				}
		}
	}

}
