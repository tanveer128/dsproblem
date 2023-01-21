package javacollection;
import java.util.*;
public class priorityqueueex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        PriorityQueue<String> q=new PriorityQueue<String>();
        System.out.println("enter the size");
        int n=sc.nextInt();
        for(int i=0;i<n;i++) {
        	String s=sc.next();
        	q.add(s);
        }
        for(String t:q) {
        	System.out.println(t);
        }
	}

}
//for user input for mixed data type u need to compare with the class i.e implements Comparable<classname>
//also see to that abstract method i.e compareTo(classname variable)