class Sort{
	public static void main(String args[]){
		
		int a[] = new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		for(int i=0;i<14;i++){
			for(int j=0;j<14-i;j++){
				if(a[j]>a[j+1]){
					int t = a[j];
					 a[j] = a[j+1];
					a[j+1]= t;
				}
			}
		}
		for(int i=0;i<14;i++){
			System.out.println(a[i]);
		}
	}
}