package tree;
import java.util.*;
class node {
	int data;
	node left,right;  //miroor image code look once again conmir function
	node(int d){
		data=d;
		this.left=null;
		this.right=null;
	}
}
class bm{
	node root=null;
	node roo=null;
	public void insert1(int d) {
		Scanner sc=new Scanner(System.in);
		if(root==null) {
			node p=new node(d);
			root=p;
		}
		Queue<node> q=new LinkedList<node>();
		q.offer(root);
		while(!q.isEmpty()) {
			node temp=q.poll();
			System.out.println("enter the left child");
			int b=sc.nextInt();
			if(b!=-1) {
				node t=new node(b);
				temp.left=t;
				q.offer(t);
			}
			System.out.println("enter the right child");
			int c=sc.nextInt();
			if(c!=-1) {
				node r=new node(c);
				temp.right=r;
				q.offer(r);
			}
		}
	}
	public void insert2(int d) {
		
		Scanner sc=new Scanner(System.in);
		if(roo==null) {
			node p=new node(d);
			roo=p;
		}
		Queue<node> q=new LinkedList<node>();
		q.offer(roo);
		while(!q.isEmpty()) {
			node temp=q.poll();
			System.out.println("enter the left child");
			int b=sc.nextInt();
			if(b!=-1) {
				node t=new node(b);
				temp.left=t;
				q.offer(t);
			}
			System.out.println("enter the right child");
			int c=sc.nextInt();
			if(c!=-1) {
				node r=new node(c);
				temp.right=r;
				q.offer(r);
			}
		}
	}
	public node conmir(node root) {
		node tem=null;
		
		if(root!=null) {
			conmir(root.left);
			conmir(root.right);
			tem=root.left;
			root.left=root.right;
			root.right=tem;
		}
		return root;
	}
	public boolean mir(node root1,node root2) {
		if(root1==null && root2==null) {
			return true;
		}
		if((root1==null && root2!=null)||(root1!=null && root2==null)) {return false;}
		if(root1.data!=root2.data) {return false;}
		return (mir(root1.left,root2.right)&& mir(root1.right,root2.left));
	}
}
public class mrriorbinary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       bm l=new bm();
       while(true) {
    	   System.out.println("1.insert1 2.insert2 3.check mirror");
    	   int g=s.nextInt();
    	   switch(g) {
    	   case 1:
    		   System.out.println("enter the data");
    		   int j=s.nextInt();
    		   l.insert1( j);
    		   break;
    	   case 2:
    		   System.out.println("enter the data");
    		   int k=s.nextInt();
    		   l.insert2( k);
    		   break;
    	   case 3:
    		  boolean w= l.mir(l.root, l.roo);
    		   if(w) {
    			   System.out.println("yes");
    		   }else {
    			   System.out.println("no they are mirror image");
    		   }
    		   break;
    		 default:
    			 System.exit(0);
    	   }
       }
	}

}
