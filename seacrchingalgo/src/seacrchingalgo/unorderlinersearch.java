package seacrchingalgo;
import java.util.*;
public class unorderlinersearch {
   static boolean find(int[] a,int n,int k) {
	   for(int i=0;i<n;i++) {
		   if(a[i]==k) {
			   return true;
		   }
	   }
	   return false;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size");
      int n=sc.nextInt();
      int[] a=new int[n];
      for(int i=0;i<n;i++) {
    	  a[i]=sc.nextInt();
      }
      System.out.println("enter the key");
      int key=sc.nextInt();
      boolean b=find(a,n,key);
      if(b) {
    	  System.out.println("found");
      }else {
    	  System.out.println("not fount");
      }
	}

}
