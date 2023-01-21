package inheritance;
import java.util.*;
public class trycatchblock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the two values");
        int a=sc.nextInt();
        int b=sc.nextInt();
        try
        {
        	int c=a/b;
        }
        catch(ArithmeticException e) {
        	System.out.println("divide by zero");
        }
        catch(NullPointerException e) {
        	System.out.println("null value");
        }
        catch(Exception e) {
        	System.out.println("somethings went wrong");
        }
        finally {
        	System.out.println("finally block exceute");
        }
	}

}
