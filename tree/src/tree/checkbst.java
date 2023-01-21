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
class b{
    node root=null;
    public void insert(){
        Queue<node> q=new LinkedList<node>();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the data");
        int a=sc.nextInt();
        if(root==null){
            node p=new node(a);
            root=p;
        }
        q.offer(root);
        while(!q.isEmpty()){
            node temp=q.poll();
            System.out.println("ente rthe left child");
            int b=sc.nextInt();
            if(b!=-1){
                node r=new node(b);
                temp.left=r;
                q.offer(r);
            }
            System.out.println("enter right chiild");
            int c=sc.nextInt();
            if(c!=-1){
                node t=new node(c);
                temp.right=t;
                q.offer(t);
            }
        }
    }
    public void dis(node root){
        if(root!=null){
            dis(root.left);
            System.out.println(root.data);
            dis(root.right);
        }
        if(root==null){
            return;
        }
    }
    public int max(node root){
        if(root==null){
            return 0;
        }
        while(root.right!=null){
            root=root.right;
        }
        return root.data;
    }
    public int min(node root){
        if(root==null){
            return 0;
        }
        while(root.left!=null){
            root=root.left;
        }
        return root.data;
    }
    public int check(node root){
        if(root==null){
            return 1;
        }
        int h=max(root.left);
        int j=min(root.right);
          
        if(root.left!=null && h>root.data){
            return 0;
        }
        if(root.right!=null && j<root.data){
            return 0;
        }
        if((check(root.left))!=1||(check(root.right))!=1){
            return 0;
        }
        return 1;
    }
}
public class checkbst{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        b l=new b();
        while(true){
            System.out.println("1.insert 2.dis 3.check");
            int e=s.nextInt();
            switch(e){
                case 1:
                    l.insert();
                    break;
                case 2:
                    l.dis(l.root);
                    break;
                case 3:
                   int k= l.check(l.root);
                   if(k==1){
                       System.out.println("yes it is a bst");
                   }else{
                       System.out.println("no it is not a bst");
                   }
                    break;
                default:
                     System.exit(0);
            }
        }
    }
}
