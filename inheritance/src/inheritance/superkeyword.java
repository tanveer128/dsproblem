package inheritance;
import java.util.*;
class hello
{
	String color="white";
	public void display() {
		System.out.println("first class");
	}
}
class second extends hello
{
	public void present() {
		System.out.println("second class");
		super.display();
		System.out.println(super.color);
	}
}
public class superkeyword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       second sc=new second();
       sc.present();
	}

}
