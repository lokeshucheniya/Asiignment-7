import java.util.*;
class pallindrome{
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
		int n = src.nextInt();
		int a = n;
		int r,s=0;
		while(a>0){
			r = a%10;
			a = a/10;
			s = s*10 + r;			
		}
		if(s==n){
			System.out.println("Pallindrome");
		}
		else
			System.out.println("Not Pallindrome");
	}
}