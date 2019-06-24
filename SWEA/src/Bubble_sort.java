
public class Bubble_sort {

	public static void main(String[] args) {
		int[] arr = {55, 7, 78, 12, 42};
		int temp;
		
		for(int loop=0; loop<arr.length-1; loop++) {
			for(int i=0; i<arr.length-1-loop; i++) {
			if(arr[i]>arr[i+1]) {
				temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
				
			}
		}
		}
		for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" ");
		}

	}

}
