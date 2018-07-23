import java.util.*;
class Marks{
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
		int A[] = new int[3];
		int B[] = new int[3];
		int C[] = new int[3];
		
		for(int i=0;i<3;i++){
			A[i] = src.nextInt();
		}
		for(int i=0;i<3;i++){
			B[i] = src.nextInt();
		}
		for(int i=0;i<3;i++){
			C[i] = src.nextInt();
		}
		int t1 = A[0] + B[0] + C[0];
		System.out.println(t1);
		int t2 = A[1] + B[1] + C[1];
		System.out.println(t2);
		int t3 = A[2] + B[2] + C[2];
		System.out.println(t3);
		
		int a1 = t1/3;
		System.out.println(a1);
		int a2 = t2/3;
		System.out.println(a2);
		int a3 = t3/3;
		System.out.println(a3);
		int t4 = t1 +t2 +t3;
		System.out.println(t4);
		int a4 = t4/3;
		System.out.println(a4);
		
	}
}