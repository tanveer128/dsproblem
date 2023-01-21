package javacollection;
import java.util.*;

public class arrayliststring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size");
       int n=sc.nextInt();
       ArrayList<String> l=new ArrayList<String>();
       for(int i=0;i<n;i++) {
    	   System.out.println("enter the value");
    	   String s=sc.next();
    	   l.add(s);
       }
       Iterator <String> i=l.iterator();
       System.out.println("string value are");
       while(i.hasNext()) {
    	
    	   System.out.println(i.next());
       }
    
	}

}
