package goldmachquestion;

import java.util.*;
class node{
    int data;
    node next;
    node down;
    node(int d){
        data=d;
        this.next=null;
        this.down=null;
    }
}
class ssl{
    node head=null;
    public void insert(int d){
        Scanner s=new Scanner(System.in);
        node p=new node(d);
        if(head==null){
            head=p;
        }
        Queue<node> q=new LinkedList<node>();
        q.offer(head);
        while(!q.isEmpty()){
            node temp=q.poll();
            System.out.println("enter the next child:  "+temp.data);
            int a=s.nextInt();
            if(a!=-1){
                node r=new node(a);
                temp.next=r;
                q.offer(r);
            }
            System.out.println("enter the down child:  "+temp.data);
            int b=s.nextInt();
            if(b!=-1){
                node e=new node(b);
                temp.down=e;
                q.offer(e);
            }
        }
    }
    public void  dis(){
        node t=head;
        int c=0;
        // System.out.println(t.data);
        Queue<node> w=new LinkedList<node>();
        w.offer(t);
        while(!w.isEmpty()){
            node tt=w.poll();
            if(tt!=null){
                c=c+1;
                w.offer(tt.next);
                w.offer(tt.down);
            }
            
        }
        int g[]=new int[c];
        int i=0;
        Queue<node> wi=new LinkedList<node>();
        wi.offer(t);
        while(!wi.isEmpty()){
            node tt=wi.poll();
            if(tt!=null){
                g[i]=tt.data;
                i=i+1;
                wi.offer(tt.next);
                wi.offer(tt.down);
            }
            
        }
        for(int k=0;k<c;k++){
            for(int l=1;l<(c-k);l++){
                if(g[l-1]>g[l]){
                    int r=g[l-1];
                    g[l-1]=g[l];
                    g[l]=r;
                }
            }
        }
        for(int j=0;j<c;j++){
            System.out.println(g[j]);
        }
    }
    
}
public class flatteningssl{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        ssl l=new ssl();
        
        while(true){
            System.out.println("1.insert 2.dis");
            int x=sc.nextInt();
            switch(x){
                case 1:
                    System.out.println("ente rhe data");
                    int b=sc.nextInt();
                    l.insert(b);
                    break;
                case 2:
                    l.dis();
                    break;
                
                default:
                    System.exit(0);
            }
        }
    }
}