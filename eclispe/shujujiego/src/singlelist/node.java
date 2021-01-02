package singlelist;

public class node {
int data;
node next;
public node(node n) {
	next=n;
	
}

public node(int obj,node n) {
	data=obj;
	next=n;
}

}
