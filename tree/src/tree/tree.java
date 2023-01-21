package tree;
import java.util.*;
import java.lang.Math;
class node{
	int data;
	node left,right;
	node(int d){
		data=d;
		this.left=null;
		this.right=null;
	}
}
class btree{
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
	public void dis(node root) {
		if(root!=null) {
			System.out.println(root.data);
			dis(root.left);
			dis(root.right);
		}
	}
	public void level() {
		Queue<node> j=new LinkedList<node>();
		j.offer(root);
		System.out.println(root.data);
		while(!j.isEmpty()) {
			node t=j.poll();
			if(t.left!=null) {
				System.out.println(t.left.data);
				j.offer(t.left);
			}
			if(t.right!=null) {
				System.out.println(t.right.data);
				j.offer(t.right);
			}
		}
	}
	public void search(int key) {
		Queue<node> j=new LinkedList<node>();
		j.offer(root);
		if(root.data==key) {
			
	    System.out.print("found");
	   
			
		}else if(root.data!=key){
			while(!j.isEmpty()) {
				node t=j.poll();
				if(t.left.data==key && t.left!=null) {
					System.out.println("found");
					break;
				}
				j.offer(t.left);
				if(t.right.data==key && t.right!=null) {
					System.out.println("found");
					break;
				}
				j.offer(t.right);
			}
		}else {
			System.out.println("not found");
		}
		
	}
	public int leaf(node root) {
		
		if(root==null) {
			return 0;
		}
		if(root.left==null && root.right==null) {
			return 1;
		}
		return leaf(root.left)+leaf(root.right);
	}
	public void depestnode(node root) {
		Queue<node> h=new LinkedList<node>();
		h.offer(root);
		node tem=null;
		while(!h.isEmpty()) {
			 tem=h.poll();
			if(tem.left!=null) {
				h.offer(tem.left);
			}if(tem.right!=null) {
				h.offer(tem.right);
			}
			
		}
		System.out.println(tem.data);
	}
	public void nonleaf(node root) {
	  if(root==null) {
		  return ;
	  }
		if(root!=null) {
			if(root.left!=null && root.right!=null) {
				System.out.println(root.data);
			}
		}
		nonleaf(root.left);
		nonleaf(root.right);
	}
	public int sum(node root,int s) {
		if(root==null) {
			 return 0;
			}
		
		return (s+root.data+sum(root.left,s)+sum(root.right,s));
	   		
	}
	public void nooftree(int n) {
		if(n==0) {
			System.out.println("no tree can generate");
		}else {
			double b=(Math.pow(2, n));
			int g=(int)b-n;
			System.out.println("tree geenrate are: "+g);
		}
	}
}

public class tree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner s=new Scanner(System.in);
       btree l=new btree();
       while(true) {
    	   System.out.println("1.insert 2.dis 3.level 4.search 5.no of leafnode 6.deepest node 7.non leaf 8.sumof the node 9.no of tree generation");
    	   int c=s.nextInt();
    	   switch(c) {
    	   case 1:
    		   l.insert();
    		   break;
    	   case 2:
    		   l.dis(l.root);
    		   break;
    	   case 3:
    		   l.level();
    		   break;
    	   case 4:
    		   System.out.println("enter the key");
    		   int k=s.nextInt();
    		   l.search( k);
    		   
    		   break;
    	   case 5:
    		   int i=l.leaf(l.root);
    		   System.out.println("the number of leaf node are : "+i);
    		   break;
    	   case 6:
    		   l.depestnode(l.root);
    		   break;
    	   case 7:
    		   l.nonleaf(l.root);
    		   break;
    	   case 8:
    		   int st=0;
    		   int j=l.sum(l.root, st);
    		   System.out.println("the sum is : "+j);
    		   break;
    	   case 9:
    		   System.out.println("number of node are");
    		   int jj=s.nextInt();
    		   l.nooftree(jj);
    		   break;
    	   default:
    		     System.exit(0);
    		   
    	   }
       }
	}

}
