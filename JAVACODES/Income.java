import java.util.*;
class Income{
	public static void main(String aregs[]){
		Scanner src = new Scanner(System.in);
		double amt = src.nextDouble();
		
		if(amt<0){
			System.exit(0);
		}
		else if(amt>0 && amt<=180000){
			System.out.println("Tax payable in percentage Nil");
		}
		else if(amt>181001 && amt<=300000){
			System.out.println("Tax payable in percentage 10%");
		}
		else if(amt>300000 && amt<=500000){
			System.out.println("Tax payable in percentage 20%");
		}
		else if(amt>500001 && amt<=1000000){
			System.out.println("Tax payable in percentage 30%0%");
		}
	}
}