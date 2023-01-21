package javacollection;
import java.util.*;
public class cstacks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         Stack<Integer> s=new Stack<Integer>();
         
         
         while(true) {
        	 System.out.println("1.push 2.pop 3.display");
    		 int h=sc.nextInt();
        	 switch(h) {
        	 case 1:
        		 
        		 
        		 
        		 System.out.println("enter the value");
            	 int b=sc.nextInt();
            	 s.push(b);
            	 break;
        	 case 2:
        		int a=s.pop();
        		System.out.println("the value is: "+a);
        		break;
        	 case 3:
        		System.out.println("teh element are");
        		for(int i:s) {
        				 System.out.println(i);
        				 
        			 }
        		break;
       
        	 default :
        			 System.exit(0);
        		 
        	 }
         }
	}

}
