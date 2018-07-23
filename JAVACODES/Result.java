import java.util.*;
class Result{
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
		int s1 = src.nextInt();
		int s2 = src.nextInt();
		int s3 = src.nextInt();
		if(s1<0 || s2<0 || s3<0){
			System.exit(0);
		}
		if(s1>60 && s2>60 && s3>60){
			System.out.println("Passed");
		}
		else if((s1>60 && s2>60) || (s1>60 && s3>60) || (s2>60 && s3>60)){
			System.out.println("Promoted");
		}
		else
			System.out.println("Fail");
	}	
}