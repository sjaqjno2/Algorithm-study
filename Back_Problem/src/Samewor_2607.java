import java.io.*;
import java.util.*;

public class Samewor_2607 {
	public static HashMap<Character, Integer> origin, other;
	public static void main(String args[]) throws IOException{
		BufferedReader in = 
				new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = 
				new BufferedWriter(new OutputStreamWriter(System.out));
		
		char ch;
		int i, j, len, cnt =0;
		int n = Integer.parseInt(in.readLine()) - 1;
		
		String word = in.readLine();
		len = word.length();
		
		origin = new HashMap<>();
		other = new HashMap<>();
		
		init(origin);
		for(i=0; i<len; i++) {
			ch = word.charAt(i);
			origin.replace(ch, origin.get(ch)+1);
		}
		
		for(i=0; i<n; i++) {
			init(other);
			len = (word = in.readLine()).length();
			for(j=0; j<len; j++) {
				ch = word.charAt(j);
				other.replace(ch, other.get(ch)+1);
			}
			if(isSimilarTo(other)) cnt++;
		}
		out.write(cnt+"");
		out.close();
		in.close();
	}
	
	static void init(HashMap<Character, Integer> hm) {
		for(char ch='A'; ch<='Z'; ch++) {
			hm.put(ch, 0);
		}
	}
	
	static boolean isSimilarTo(HashMap<Character, Integer> other) {
		int a, b, diff = 0, originLen = 0, otherLen = 0;
		for(char ch = 'A'; ch<='Z'; ch++) {
			originLen += (a = origin.get(ch));
			otherLen += (b = other.get(ch));
			diff += Math.abs(a - b);
		}
		return diff<=2 && Math.abs(originLen-otherLen)<=1;
	}

}
