package goldmachquestion;
import java.util.*;
class node{
    int d;
    node next;
    node(int d){
        this.d=d;
        this.next=null;
    }
}
class s{
    node head=null;
    public void insert(int d){
        node p=new node(d);
        if(head==null){
            head=p;
            System.out.println("hi");
        }else{
            node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=p;
        }
    }
    public void del (int i){
        node temp=head;
        int c=0;
        while(c!=i){
            temp=temp.next;
            c=c+1;
        }
        int j=0;
        node t=temp;
        while(t!=null){
            j=j+1;
            t=t.next;
        }
        node r=null;
        while(temp.next!=null){
            r=temp;
            temp.d=temp.next.d;
            temp=temp.next;
        }
        r.next=null;
    }
    public void dis(node hea){
        node w=hea;
        while(w!=null){
            System.out.println(w.d);
            w=w.next;
        }
    }
}
public class singlearreyrefernce{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        s l=new s();
        while(true){
            System.out.println("1.insert 2.del 3.dis");
            int a=sc.nextInt();
            switch(a){
                case 1:
                    System.out.println("entr data");
                    int b=sc.nextInt();
                    l.insert(b);
                    break;
                case 2:
                    System.out.println("enter the index");
                    int g=sc.nextInt();
                    l.del(g);
                    break;
                case 3:
                    l.dis(l.head);
                    break;
                default:
                    System.exit(0);
            }
        }
    }}

