package inheritance;
interface ja
{
	public void print();
}
class ha implements ja
{
	public void print() {
		System.out.println("implements class and its excutions");
	}
}
public class interfaceex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ha b=new ha();
        b.print();
	}

}
