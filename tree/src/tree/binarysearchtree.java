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
class bst{
    node root=null;
    public node insert(node root,int d){
        if(root==null){
            node p=new node(d);
            root=p;
            return root;
        }else{
            node temp=root;
            if(temp.data>d){
                temp.left=insert(temp.left,d);
            }else{
                temp.right=insert(temp.right,d);
            }
        }
        return root;
    }
    public void dis(node root){
        if(root==null){
            return ;
        }else{
            dis(root.left);
            System.out.println(root.data);
            dis(root.right);
        }
    }
    public void sea(node root,int d){
        if(root!=null){
            if(root.data==d){
                System.out.println("found");
            }else if(root.data>d){
                sea(root.left,d);
            }else if(root.data<d){
                sea(root.right,d);
            }else{
                System.out.println("not found");
            }
        }else{
            return;
        }
    }
    public node minnode(node root){
        node temp=root;
        if(root!=null){
            
            while(temp.left!=null){
                temp=temp.left;
            }
        }else{
            System.out.println("no node present");
        }
        return temp;
    }
    public node maxnode(node root){
         node temp=root;
        if(root!=null){
           
            while(temp.right!=null){
                temp=temp.right;
            }
        }else{
            System.out.println("no node present");
        }
        return temp;
    }
    // public int leftheight(node root){
    //     int v=0;
    //     while(root!=null){
    //         root=root.left;
    //         v=v+1;
    //     }
    //     while(root.right!=null){
    //         root=root.right;
    //         v=v+1;
    //     }
    // }
    // public node noofnode(node root){
    //     int g=leftheight(root.left);
    //     int h=rightheight(root.right);
    //     return g+h+1;
    // }
    public node lca(node root,int n1,int n2){
        node t=root;
        if(root==null){
            System.out.println("no tree is present");
        }
        if(root.left!=null && n1<root.data && n2<root.data){
            t= lca(root.left,n1,n2);
        }
        if(root.right!=null && n1>root.data && n2>root.data){
            t= lca(root.right ,n1,n2);
        }
        
        return t;
    }
    public int fact(int n){
        int s=1;
        if(n==0 || n==1){
            return 1;
        }else{
            for(int i=1;i<=n;i++){
                s=s*i;
            }
        }
        return s;
    }
    public void cla(int d){
        if(d==0){
            System.out.println("zero tree");
        }else if(d==1){
            System.out.println("one tree");
        }else{
            int c=fact(d);
            int a=fact(2*d);
            int b=fact((d+1));
            int v= (a/(c*b));
            System.out.println("no of tree are : "+v);
        }
    }
}
public class binarysearchtree{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        node t=null;
        int c=0;
        bst l=new bst();
        node r=l.root;
        while(true){
            System.out.println("1.insert 2.dis 3.search 4.min 5.max 6.lca 7.find tree");
            int a=sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("enter the data");
                    int b=sc.nextInt();
                    r=l.insert(r,b);
                    if(c==0){
                        t=r;
                        // System.out.println(r+"\t"+t);
                        c++;
                    }
                    break;
                case 2:
                    // System.out.println(t);
                    l.dis(t);
                    break;
                case 3:
                    System.out.println("entr the ele");
                    int cc=sc.nextInt();
                    if(t!=null){
                    l.sea(t,cc);}else{
                        System.out.println("tree is empty");
                    }
                    break;
                case 4:
                    node tt=l.minnode(t);
                    System.out.println("min node is: "+tt.data);
                    break;
                case 5:
                    node ff=l.maxnode(t);
                    System.out.println("max node is: "+ff.data);
                    break;
                case 6:
                    System.out.println("enter the n1 and n2");
                    int kk=sc.nextInt();
                    int k=sc.nextInt();
                    node rrr=l.lca(t,kk,k);
                    if(rrr!=null){
                    System.out.println(rrr.data);}
                    else{
                        System.out.println("we cannt do this");
                    }
                    break;
                case 7:
                    System.out.println("enter the node");
                    int j=sc.nextInt();
                    l.cla(j);
                    break;
                    
                default:
                    System.exit(0);
            }
        }
    }
}