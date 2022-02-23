package com.project6;
//import java.util.LinkedList;
public class SinglyLinkedList {

	public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        System.out.println("Displaying Data: size is:"+list.size());
        list.display();
        list.remove(2);
        System.out.println("Displayiong data after removind 2nd index");
        list.display();
        System.out.println("size"+list.size());
        
	}

}
class Node{
	int data;
	Node address;
}
class MyLinkedList{
	Node head=null;
	Node tail=null;
	int size=0;
	public void add(int data) {
		size++;
		Node node=new Node();
		node.data=data;
		node.address=null;
		
		if(isEmpty()) {
			head=node;
			tail=node;
			
		}else {
			tail.address=node;
			tail=node;
			
		}
		
	}
	public void add(int data,int index) {
		size++;
		Node node=new Node();
		node.data=data;
		node.address=null;
		
		if(isEmpty()) {
			head=node;
			tail=node;	
			
		}else {
			tail.address=node;
			tail=node;
			
		}
		
	}
	public void display() {
		Node temp=head;
		while(temp!=null) {
			System.out.println("Address of current node:"+temp);
			System.out.println("Data:"+temp.data);
			System.out.println("Address:"+temp.address);
			System.out.println("------------");
			temp=temp.address;
		}
	}
	public boolean isEmpty() {
		return head==null;
	}
	public Integer remove() {
		Integer value=null;
		if(!isEmpty()) {
			Node temp=head;
			value=head.data;
			head=head.address;
			temp.address=null;
			temp=null;
		}
		return value;
	}
	public Integer remove(int index) {
	
		Integer value=null;
		Node next=head;
		Node current=null;
		if(index>=0&&index<size&&!isEmpty()) {
			size--;
			int ind=0;
			while(ind<index)
			{
				current=next;
				next=next.address;
				ind++;
			}
			current.address=next.address;
			next.address=null;
			Node temp=head;
			value=head.data;
			head=head.address;
			temp.address=null;
			temp=null;
		}
		return value;
	}
	public int size() {
		return size;
	}
}
