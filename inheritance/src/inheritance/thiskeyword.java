package inheritance;
import java.util.*;
class first
{
	int i,j,k;
	first(int i,int j,int k){
		this.i=i;
		this.j=j;
		this.k=k;
	}
	public void display() {
		System.out.println("the vale are:"+i+" "+j+" "+k);
	}
}
public class thiskeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        first m=new first(a,b,c);
        m.display();
	}

}
