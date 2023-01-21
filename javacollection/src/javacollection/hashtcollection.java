package javacollection;
import java.util.*;
class store{
	int num;               //linkedhashset is also simliar to this
	String bookname,author;
	store(int n,String b,String a){
		num=n;
		bookname=b;
		author=a;
	}
}
public class hashtcollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc =new Scanner(System.in);
        System.out.println("enter how many u want to add to store");
        int n=sc.nextInt();
        HashSet<store> l=new HashSet<store>();
        for(int i=0;i<n;i++) {
        	System.out.println("enter booknumber bookname bookauthor");
        	int a=sc.nextInt();
        	String b=sc.next();
        	String ba=sc.next();
        	store s=new store(a,b,ba);
        	l.add(s);
        }
        for(store i:l) {
        	System.out.println("number bookname bookauthor "+i.num+" "+i.bookname+" "+i.author);
        }
	}

}
