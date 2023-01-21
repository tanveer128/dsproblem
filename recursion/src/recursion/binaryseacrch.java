package recursion;
import java.util.*;
public class binaryseacrch {
     static boolean bin(int[] a,int k,int l,int h) {
    	 while(l<=h) {
    		 int m=(l+h)/2;
    		 if(a[m]>k) {
    			return bin(a,k,l,m-1);
    		 }else if(a[m]<k) {
    			 return bin(a,k,m+1,h);
    		 }else {
    			 return true;
    		 }
    	 }
    	 return false;
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner (System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        int low=0;
        int high=n-1;
        System.out.println("enter the key");
        int key=sc.nextInt();
        boolean b=bin(a,key,low,high);
        if(b) {
        	System.out.println("found");
        }else {
        	System.out.println("not found");
        }
	}

}
