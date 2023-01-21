package recursion;
import java.util.*;
public class binarynumber {
     
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System. out .println(":enter the number");
       int n=sc.nextInt();
  	 for(int jj=0;jj>=n;jj++ ) {
		 System.out.println("h");
		 if(jj==0) {
		 System.out.println("00");
	    }
		
		 else {
		String s=" ";
		String re=" ";
		while(jj>0) {
			int j=n%2;
			s=s+Integer.toString((j));
			jj=jj/2;
			
		}
		for(int i=0;i<s.length();i++) {
			re=s.charAt(i)+re;
		}
		s=null;
		
		  System.out.println(re);
		  re=null;
		
	 }
	
 }
	}

}
