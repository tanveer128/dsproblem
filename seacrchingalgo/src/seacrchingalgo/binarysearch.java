package seacrchingalgo;
import java.util.*;
public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size");
        int n=sc.nextInt();
        int[] a=new int [n];
        for(int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        }
        System.out.println("enter key");
        int key=sc.nextInt();
        for(int i=1;i<n;i++) {
        	int temp=a[i];
        	int j=i-1;
        	while(j>=0 && temp<a[j]) {
        		a[j+1]=a[j];
        		j--;
        	}
        	a[j+1]=temp;
        }
       
        int l=0;
        int falg=-1;
        int h=n-1;
        while(l<=h) {
        	int m=(l+h)/2;
        	if(key==a[m]) {
        		falg=1;
        		break;
        	}else if(key<a[m]) {
        		h=m-1;
        	}else {
        	 l=m+1;
        	}
        }
        if(falg==1) {
        	System.out.println("found");
        }else {
        	System.out.println("not found");
        }
	}

}
