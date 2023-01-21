package javacollection;
import java.util.*;
class book implements Comparable<book>{
	int id;
	String name,author;
	book(int i,String n,String a){
		id=i;
		name=n;
		author=a;
	}
	public int compareTo(book b) {
		if(id>b.id) {
			return -1;
		}
		return 0;
	}
}
public class treecollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the size");
       int n=sc.nextInt();
       TreeSet<book> t=new TreeSet<book>();
     
       for(int i=0;i<n;i++) {
    	   System.out.println("enter bookid bookname bookauthor");
    	   int d=sc.nextInt();
    	   String  f=sc.next();
    	   String g=sc.next();
    	   book o=new book(d,f,g);
    	   t.add(o);
    	   
       }
       for(book y:t) {
    	   System.out.println(y.id+" "+y.name+" "+y.author);
       }
       
	}

}
