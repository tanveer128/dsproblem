package javacollection;
import java.util.*;
public class dequeueexmaple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Deque <String> d=new ArrayDeque();
        while(true) {
        	System.out.println("1.frontadd 2.endadd 3.delfirst 4.dellast 5.dispaly");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:
        		System.out.println("enter the string");
        		String h=sc.next();
        		d.offerFirst(h);
        		break;
        	case 2:
        		System.out.println("enter the string");
        		String i=sc.next();
        		d.add(i);
        		break;
        	case 3:
        		System.out.println("ele del is : "+d.pollFirst());
        		break;
        	case 4:
        		System.out.println("ele del is: "+d.pollLast());
        		break;
        	case 5:
        		if(d.isEmpty()) {
        			System.out.println("no ele is present");
        		}else {
        			for(String j:d) {
        				System.out.println("ele is: "+j);
        			}
        		}
        		break;
        	default :
        		System.exit(0);
        	}
        }
	}

}
