package recursion;
import java.util.*;
class f{
	public int fact(int n) {
		int val=1;
		if(n==0 ||n==1) {
			val=1;
		}else {
			val=n*fact(n-1);
		}
	return val;
	}
}
public class factriol {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the number");
       int n=sc.nextInt();
       f j=new f();
       System.out.println("factorial of the number is : "+j.fact(n));
	}

}
