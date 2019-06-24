import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;
 
public class Baseball_2503 {
 
    private static final File file = new File("src\\input.txt");
    private static FileInputStream fis = null;
    
    static InputStreamReader isr;
    static BufferedReader br;
    static OutputStreamWriter osw;
    static BufferedWriter bw;
    static StringTokenizer st;
    
    static int N = 0;
    
    public static void main(String[] args) throws IOException {
        
//        fis = new FileInputStream(file);
//        isr = new InputStreamReader(fis);
        
        isr = new InputStreamReader(System.in);
        
        br = new BufferedReader(isr);
        osw = new OutputStreamWriter(System.out);
        bw = new BufferedWriter(osw);
 
        int N = Integer.parseInt(br.readLine());
        ArrayList<int[]> game = new ArrayList<int[]>();
        
        while(N > 0) {
            st = new StringTokenizer(br.readLine());
            
            int[]value = new int[3];
            value[0] = Integer.parseInt(st.nextToken());
            value[1] = Integer.parseInt(st.nextToken());
            value[2] = Integer.parseInt(st.nextToken());
            
            game.add(value);
            
            N--;
        }
        
        int result = 0;
        
        for(int i = 1; i <= 9; i++) {
            for(int j = 1; j <= 9; j++) {
                for(int k = 1; k <= 9; k++) {
                    if(i == j || j == k || i == k) {
                        continue;
                    }
                    
                    String askNum = i + "" + j + "" + k;
                    if(isPossible(game, askNum)){
                        result += 1;
                    }
                }
            }
        }
        
        bw.write(result + "\n");
        bw.flush();
        bw.close();
        br.close();
    }    
    
    private static boolean isPossible(ArrayList<int[]> game, String paramAskNum) {
        
        char[] askNum = paramAskNum.toCharArray();
        int trueCount = 0;
        
        for(int value[] : game) {
            String num = String.valueOf(value[0]);
            int strike = value[1];
            int ball = value[2];
            
            char[]numArray = num.toCharArray();
            
            int localStrike = 0;
            int localBall = 0;
            
            for(int i = 0; i < 3; i++) {
                for(int j = 0; j < 3; j++) {
                    if(numArray[i] == askNum[j]) {
                        if(i == j) {
                            localStrike += 1;
                        }
                        else {
                            localBall += 1;
                        }
                    }
                }
            }
            
            if(strike == localStrike && ball == localBall) {
                trueCount += 1;
            }
        }
        
        if(trueCount == game.size()) {   //입력된 4개의 숫자 모두에 대해서 strike, ball 수가 똑같아야 되기 때문(똑같으면 truecount++하니까)
        	System.out.println(game.size());
            return true;
        }
            
        return false;
    }
}


