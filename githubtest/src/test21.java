//Code 湲곗빟遺꾩닔

import java.util.Scanner; 
import java.io.FileInputStream;  

public class Solution2222 { 

static int A; // 遺꾩옄1
static int B; // 遺꾨え1
static int C; // 遺꾩옄2
static int D; // 遺꾨え2
static int X; //湲곗빟遺꾩닔 遺꾩옄
static int Y; //湲곗빟遺꾩닔 遺꾨え
static int M; //�빀遺꾩옄
static int N; //�빀遺꾨え

	public static void main(String[] args) throws Exception { 
		
	    System.setIn(new FileInputStream("C:\\sample_input.txt")); 
	    Scanner sc = new Scanner(System.in); 

	    //�뀒�뒪�듃耳��씠�뒪 �닔
	    int T = sc.nextInt(); 
	    for(int test_case = 1; test_case <= T; test_case++){
	    	A = sc.nextInt();
	    	B = sc.nextInt();
	    	C = sc.nextInt();
	    	D = sc.nextInt();
	    	
		    if(B==D){
		    	N = B;
		    	M = A + C;
		    }
		    if(B!=D){
		    	M = A*D + C*B;
		    	N = B*D;
		    }

			int U = gcd(M,N);
			X = M/U;
			Y = N/U;
		    
		    System.out.println("#"+test_case+" "+X+" "+Y);
	    }
	}
	
	   static int gcd(int p, int q) {
	        while(q!=0){
	        	int temp = p%q;
	        	p = q;
	        	q = temp;
	        }
	        return p;
	    }

}

