package goldmachquestion;
import java.util.*;
public class stringreserve {
public static void main(String[] args){
		
        System.out.println("enter the string");
        Scanner sc=new Scanner(System.in);
        String si=sc.nextLine();
        System.out.println("enter the index");
        int n=sc.nextInt();
        String[] s=si.split(" ");
        String rs="";
        String h=s[n-1];
        for(int i=h.length()-1;i>=0;i--) {
        	rs=rs+h.charAt(i);
        }
        System.out.println("the reverse string is :"+rs);
}
}
