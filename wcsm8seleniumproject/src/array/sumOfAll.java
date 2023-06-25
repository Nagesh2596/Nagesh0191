package array;

public class sumOfAll {
       public static void main(String[] args) {
		
    	   int [] x = {25,35,64,8};
    	   
    	   int sum=0;
    	   for(int index=0;index<x.length;index++)
    	   {
    		sum=sum+x[index];   
    	   }
    	   System.out.println(sum);
	}
}
