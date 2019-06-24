import java.util.*;

public class Dumping {
	
	public static int dump(int data[], int dumpcount){
		int max=0;
		int min=0;
		int maxindex, minindex;

		
		while(dumpcount!=0) {
			max = data[0];
			min = data[0];
			maxindex = 0;
			minindex = 0;
			
			for(int i=1; i<100; i++) {
				if(max < data[i]) {
					max = data[i];
					maxindex = i;
				}
				
				if(min > data[i]) {
					min = data[i];
					minindex = i;
				}
			}
			
			data[maxindex] = data[maxindex]-1;
			data[minindex] = data[minindex]+1;
			dumpcount = dumpcount - 1;
		}
		
		max = data[0];
		min = data[0];
		
		for(int i=1; i<100; i++) {
			if(max < data[i]) {
				max = data[i];
			}
			if(min > data[i]) {
				min = data[i];
			}
		}
		return max - min;
	}
	
	
	
	
	public static void main(String args[]) {
		int[] data = new int[100];

		for(int i=0; i<100; i++) {
			Random r = new Random();
			data[i] = r.nextInt(100);
			for(int j=0; j<i; j++) {
				if(data[i]==data[j]) {
					i--;
				}
			}
		}
		
		for(int i=0; i<100; i++) {
			System.out.print(data[i]+" ");
			if(i%10==9) {
				System.out.println();
			}
		}
	
		System.out.println(dump(data, 10));
	}

}
