import java.util.*;
public class PrimeBetweenRange
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int count=0;
		for(int i=start;i<=end;i++){
		    count=0;
		    for(int j=1;j<=i;j++){
		        if(i%j==0){
		            count++;
		        }
		        
		    }
		    if(count==2){
		        System.out.print(i+" ");
		        
		    }
		    
		}
		
	}
}
