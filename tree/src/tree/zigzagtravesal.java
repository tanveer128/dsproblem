package tree;
import java.util.*;
class node{
	int data;
	node left,right;
	node(int d){
		data=d;
		this.left=null;
		this.right=null;
	}
}
class bh{
	node root=null;
	public void insert() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the data");
		int a=sc.nextInt();
		Queue<node> q=new LinkedList<node>();
		node p=new node(a);
		if(root==null) {
			root=p;
			q.offer(root);
		}
		while(!q.isEmpty()) {
			node temp=q.poll();
			System.out.println("enter the left child");
			int b=sc.nextInt();
			if(b!=-1) {
				node w=new node(b);
				temp.left=w;
				q.offer(w);
			}
			System.out.println("enter the right child");
			int c=sc.nextInt();
			if(c!=-1) {
				node e=new node(c);
				temp.right=e;
				q.offer(e);
			}
		}
	}
	public void zi(node root) {
		Stack<node> c=new Stack<node>();
		Stack<node> n=new Stack<node>();
		c.push(root);
		boolean f=true;
		while(!c.isEmpty()) {
			node temp=c.pop();
			System.out.println(temp.data);
			if(f) {
				if(temp.left!=null) {
					n.push(temp.left);
				}
				if(temp.right!=null) {
					n.push(temp.right);
				}
			}else {
				if(temp.right!=null) {
					n.push(temp.right);
				}
				if(temp.left!=null) {
					n.push(temp.left);
				}
			}
			if(c.isEmpty()) {
				f=!f;
				Stack<node> t=new Stack<node>();
				while(!n.isEmpty()) {
					t.push(n.pop());
					
				}
				while(!t.isEmpty()) {
					c.push(t.pop());
				}
			}
		}
		
	}
}
public class zigzagtravesal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner s=new Scanner(System.in);
        bh l=new bh();
        while(true) {
        	System.out.println("1.insert 2.zigzag traversal");
        	int a=s.nextInt();
        	switch(a) {
        	case 1:
        		l.insert();
        		break;
        	case 2:
        		l.zi(l.root);
        		break;
        	default:
        		System.exit(0);
        	}
        }
	}

}
