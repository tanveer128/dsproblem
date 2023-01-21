package javacollection;
import java.util.*;
public class arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      ArrayList<Integer> l=new ArrayList<Integer>();
      System.out.println("enter the size");
      int n=sc.nextInt();
      for(int i=0;i<n;i++) {
    	  System.out.println("enter the values");
    	  int a=sc.nextInt();
    	  l.add(a);
      }
      Iterator <Integer> i=l.iterator();
      while(i.hasNext()) {
    	  System.out.println("elements are : "+i.next());
      }
	}

}
