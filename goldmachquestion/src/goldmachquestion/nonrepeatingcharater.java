package goldmachquestion;
import java.util.*;
public class nonrepeatingcharater {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		for(int i=0;i<s.length();i++) {
			for(int j=1;j<s.length();j++) {
				if(s.charAt(i)==s.charAt(j)) {
					break;
				}else {
					System.out.println("the duplicate"+s.charAt(i));
					System.out.println(i);
					System.exit(0);
				}
			}
		}

	}

}
