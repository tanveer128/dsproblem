package tree;

import java.util.*;
class node{
    int d;
    node left,right;
    node(int d){
        this.d=d;
        this.left=null;
        this.right=null;
    }
}
class b{
    node root=null;
    public void insert(){
        System.out.println("enter the data");
        Scanner sc=new Scanner(System.in);
        int d=sc.nextInt();
        node p=new node(d);
        if(root==null){
            root=p;
        }
        Queue<node> q=new LinkedList<node>();
        q.offer(root);
        while(!q.isEmpty()){
            node temp=q.poll();
            System.out.println("enter left child");
            int g=sc.nextInt();
            if(g!=-1){
                node e=new node(g);
                temp.left=e;
                q.offer(e);
            }
            System.out.println("enter the right child");
            int j=sc.nextInt();
            if(j!=-1){
                node ff=new node(j);
                temp.right=ff;
                q.offer(ff);
            }
        }
    }
    public void insertanode(int d){
        node t=new node(d);
        node temp=root;
        if(temp==null){
            
            temp=t;
        }
        Queue<node> w=new LinkedList<node>();
        w.offer(temp);
        while(!w.isEmpty()){
            node y=w.poll();
            if(y.left==null){
                y.left=t;
                break;
            }else{
                w.offer(y.left);
            }
            if(y.right==null){
                y.right=t;
                break;
            }else{
                w.offer(y.right);
            }
        }}
        public void dis(node root){
            if(root==null){
                return;
            }
            if(root!=null){
            System.out.println(root.d);
            dis(root.left);
            
            dis(root.right);
        }}
        public void deldeep(){
            
            node t=null;
            if(root==null){
                System.out.println("no node is present'");
            }
            Queue<node > q=new LinkedList<node>();
            q.offer(root);
            while(!q.isEmpty()){
                node temp=q.poll();
                if(temp.right!=null){
                    q.offer(temp.right);
                    t=temp;
                }
            }
            System.out.println("del node is: "+t.right.d);
            t.right=null;
        }
        public void delroot(){
            if(root==null){
                System.out.println("no node ");
            }
            node t=null;
            node temp=null;
            Queue<node> q=new LinkedList<node>();
            if(root.right!=null){
            q.offer(root.right);
                
            }
            while(!q.isEmpty()){
                 temp=q.poll();
                if(temp.left!=null){
                    q.offer(temp.left);
                    t=temp;
                }
            }
            System.out.println("root node del : "+root.d);
            root.d=temp.d;
            t.left=null;
        }
}
public class Main{
    public static void main(String[] args){
        Scanner p=new Scanner(System.in);
        b l=new b();
        while(true){
            System.out.println("1.insert 2.inserrta node 3.dis 4.deldeep 5.delroot");
            int h=p.nextInt();
            switch(h){
                case 1:
                    l.insert();
                    break;
                case 2:
                    System.out.println("enter the node");
                    int v=p.nextInt();
                    l.insertanode(v);
                    break;
                case 3:
                    l.dis(l.root);
                    break;
                case 4:
                    l.deldeep();
                    break;
                case 5:
                    l.delroot();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}