import java.util.Scanner;

public class DFS {
	static int stack[] = new int[8];
	static int top = -1;
	static int visited[] = new int[8];
	static int arr[][] = new int[8][8];
	
	static void push(int v) {
		System.out.print(v+" ");
		stack[++top] = v;
		visited[v] = 1;
		return;
	}
	
	static void pop() {
		top--;
		return;
	}
	
	static void dfs(int v){
		push(v); //�ʱ����� ���ÿ� �ֱ�
		
		while(top>=0) {
			for(int i=1; i<=7; i++) {
				if(visited[i] == 0 && arr[stack[top]][i] == 1) {
					//�湮���� ����, �׷��� �󿡼� ���� �Ǿ� �ִ��� Ȯ��
					push(i);
					i = 1;
				}
			}
			pop();
		}
	}
	

	public static void main(String args[]) {
		int a, b;
		for(int i=0; i<7; i++) {
			Scanner sc = new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
		dfs(1);
		
	}

}
