
public class linkedlist {

public class Node {

int data;
Node next;

public Node(int d) {
this.data = d;
this.next = null;
}
}

public Node head = null;
public Node tail = null;
public void insertNode(int d) {
	//create new node and insert at the end

	Node newNode = new Node(d);

	
	if(head == null) {
	head = newNode;

	}
	else {
	//get the head to start 
	Node node = head;

	while (node.next!=null) {
	node = node.next;
	}
	node.next = newNode;
	}
	tail = newNode;

	}
public void displaySLL()
{
Node node = head;

while(node.next!=null)
{
System.out.println(node.data);
node = node.next;
}
System.out.println(node.data);
}

public static void main(String[] args) {

linkedlist list = new linkedlist();

list.insertNode(18);
list.insertNode(45);
list.insertNode(12);

list.displaySLL();

}

}
