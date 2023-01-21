package goldmachquestion;
import java.util.*;
public class arrayequal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         System.out.println("enter two the size");
         int ai=sc.nextInt();
         int bi=sc.nextInt();
         int [] a=new int[ai];
         int [] b=new int[bi];
         boolean flag=false;
         for(int i=0;i<ai;i++) {
        	 a[i]=sc.nextInt();
         }
         for(int i=0;i<bi;i++) {
        	 b[i]=sc.nextInt();
         }
         if(a.length==b.length) {
        	 for(int i=0;i<ai;i++) {
        		 if(a[i]==b[i]) {
        			 flag=true;
        		 }
        		 else {
        			 System.out.println("not equal");
        			 System.exit(0);
        		 }
        	 }
         }else {
        	 System.out.println("not equal");
         }
         if(flag==true) {
        	 System.out.println("equal");
         }
	}

}
