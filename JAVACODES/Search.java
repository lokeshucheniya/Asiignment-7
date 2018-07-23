import java.util.*;
class Search{
	public static void main(String args[]){
		int a[]=new int[15];
		Scanner src = new Scanner(System.in);
		for(int i=0;i<15;i++){	
			a[i] = src.nextInt();
		}
		System.out.println("Enter value to be searched");
		int n = src.nextInt();
		for(int i=0;i<15;i++){
			if(a[i]==n){
				System.out.println("Found");
				System.exit(0);
			}
		}
	}
}