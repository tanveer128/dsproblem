package seacrchingalgo;
import java.util.*;
public class interpolationsearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size");
       int n=sc.nextInt();
       int [] a=new int[n];
       for(int i=0;i<n;i++) {
    	   a[i]=sc.nextInt();
       }
       System.out.println("enter the key");
       int key=sc.nextInt();
       int l=0;
       int h=n-1;
       int f=-1;
       while(l<=h) {
    	   int e=l+((h-l)/(a[h]-a[l]))*(key-a[l]);
    	   if(a[e]<key) {
    		   l=e;
    	   }else if(a[e]==key) {
    		   f=1;
    		   break;
    	   }else {
    		   h=e;
    	   }
       }
       if(f==1) {
    	   System.out.println("found");
       }else {
    	   System.out.println("not found");
       }
	}

}
