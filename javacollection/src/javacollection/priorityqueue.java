package javacollection;
import java.util.*;
public class priorityqueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        PriorityQueue<String> q=new PriorityQueue<String>(); 
        while(true) {
        	System.out.println("1.add 2.pop 3.del 4.lastelement 5.display");
            int a=sc.nextInt();
            switch(a) {
            case 1:
            	System.out.println("enter the value");
            	String s=sc.next();
            	q.add(s);
            	break;
            case 2:
            	System.out.println(q.poll());
            	break;
            case 3:
            	System.out.println(q.remove());
            	break;
            case 4:
            	System.out.println(q.peek());
            	break;
            case 5:
            	if(q.isEmpty()) {
            		System.out.println("nothing is present");
            	}else {
            		for(String i:q) {
            			System.out.println(i);
            			
            		}}
            	break;
            default:
            	System.exit(0);
            	
            }
        }
        

	}

}
