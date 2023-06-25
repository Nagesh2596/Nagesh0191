package array;

public class averageOfall {
	public static void main(String[] args) {
		
		int [] a = {50,80,100};
		
		int sum =0;
		 for(int index=0;index<a.length;index++)
  	   {
  		sum=sum+a[index];  
  		
  	   }
	System.out.println("average of all");
	double average = sum/a.length;
	System.out.println(average);
	}

}
