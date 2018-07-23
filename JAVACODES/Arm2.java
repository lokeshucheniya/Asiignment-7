import java.util.Scanner;
public class Arm2{
	public static void main(String args[]){
		
		for(int i=153;i<1000;i++){
			int c,b,r=0,s=0;
			
			c = i;
			while(c > 0){
			r = (c%10);
			c = (c/10);
			r = (r*r*r);
			s = (s + r);
			
		}
		
		if(s == i){
			System.out.println(i);
		}
		
		}
		
	} 
}