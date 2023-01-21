package javacollection;
import java.util.*;
public class clinkelist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        LinkedList<String> l=new LinkedList<String>();
        LinkedList<Integer> k=new LinkedList<Integer>();
        System.out.println("enter the value 1.string 2.integer");
        int n=sc.nextInt();
        switch(n) {
        case 1:
        	System.out.println("enter the size");
        	int a=sc.nextInt();
        	for(int i=0;i<a;i++) {
        	System.out.println("enter the value");
        	String s=sc.next();
        	l.add(s);
        	}
        	for(String i:l) {
        	System.out.println(i);
        	}
        	break;
        case 2:
        	System.out.println("enter the value");
        	int b=sc.nextInt();
        	for(int i=0;i<b;i++) {
        		System.out.println("enter the value");
        		int c=sc.nextInt();
        		k.add(c);
        	}
        	for(int i:k) {
        		System.out.println(i);
        	}
        	break;
        default :
        	System.exit(0);
        	
	}
        }

}
