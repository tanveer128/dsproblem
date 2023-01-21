package recursion;
import java.util.*;
public class fabnoci {
	static int n1=0;
	static int n3=0;
	static int n2=1;
	static void fab(int n) {
		if(n>0) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			fab(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int n=sc.nextInt();
       System.out.println(n1+"\n"+n2);
       
       fab(n-2);
       
	}

}
