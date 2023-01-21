package javacollection;
import java.util.*;
public class hashmapex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        Map<Integer,String> m=new HashMap<Integer,String>();
        Map<Integer,String> p=new HashMap<Integer,String>();

        while(true) {
        	System.out.println("1.add 2.display");
        	int a=sc.nextInt();
        	switch(a) {
        	case 1:
        		System.out.println("enter key and values");
        		int b=sc.nextInt();
        		String f=sc.next();
        		m.put(b,f);
        		break;
        	case 2:
        		
        		for(Map.Entry o:m.entrySet()) {
        			System.out.println(o.getKey()+" "+o.getValue());
        			
        		}
        		break;
            default:
        		System.exit(0);
        	}
        }
      
        
	}

}
