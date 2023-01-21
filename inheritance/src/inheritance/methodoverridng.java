package inheritance;
class f
{
	public void display() {
		System.out.println("hello world");
	}
}
class s extends f
{
	public void display() {
		System.out.println("inhertiance class");
	}
}
class h extends s
{
	public void display() {
		super.display();
	}
}
public class methodoverridng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f v=new f();
        f si=new s();
        si.display();
        v.display();
        s m=new h();
        m.display();
	}

}
