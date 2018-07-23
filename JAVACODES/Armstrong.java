import java.util.Scanner;
public class Armstrong{
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
			int a = src.nextInt();
			/*if(a<=0){
				System.exit(0);
			}*/
			int b = a;
			int r,s=0;
			while(a != 0){
				r = (a%10);
				a = (a/10);
				r = (r*r*r);
				s = (s + r);
			}
			if(s == b){
				System.out.println("It is Armstrong");
			}
			else{
				System.out.println("It is not Armstrong");
			}
		
	} 
}