import java.util.*;
public class sici{
	public static void main(String args[]){
		Scanner src = new Scanner(System.in);
		double p = src.nextDouble();
		double n = src.nextDouble();
		double r = src.nextDouble();
		double s = (p*n*r)/100;
		System.out.println(s);
		
		double c = p*Math.pow((1+r/n),n);
		System.out.println(c);
	}
}