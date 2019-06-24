import java.util.*;

public class Pattern_match {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine().replaceAll("\\p{Z}", "");
		String pattern = "ti";
		char[] st = sentence.toCharArray();
		char[] pt = pattern.toCharArray();
		int count = 0;
		int rcount = 0;
		
		for(int i=0; i<st.length - pt.length; i++) {
			for(int j=0; j<pt.length; j++) {
				if(st[i+j]==pt[j]) {
					count++;
				}
			} if(count == 2) {
				rcount++;
			}
			count = 0;
			
		}
		System.out.println(rcount);
		
	}

}
