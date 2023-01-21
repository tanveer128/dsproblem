package javacollection;
import java.util.*;

public class vectorlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int n=sc.nextInt();
        Vector<Integer> v=new Vector<Integer>();
        for(int i=0;i<n;i++) {
        	System.out.println("enter the value");
        	int a=sc.nextInt();
        	v.add(a);
        }
        for(int i: v) {
        	System.out.println(i);
        }
	}

}
