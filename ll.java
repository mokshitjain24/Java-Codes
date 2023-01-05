

public class ll {
	static node head;

	static class node {
		int data;
		node next;

		public void Node(int da) {
			data = da;
			next = null;

		}
	}

	public node in(int data) {

		node node = new node();
		node.data = data;

		if (head == null) {
			head = node;
		} else {
			node n = new node();
			n = head;
			while (n.next != null) {
				n = n.next;
			}
			n.next = node;

		}
		return head;
	}

	public void show() {
		node n = new node();
		n = head;
		while (n != null) {
			System.out.println(n.data);
			n = n.next;
		}
	}

	public node out(int d) {
		node n = new node();
		node p = new node();
		n = head;
		p = null;
		if (n.next != null && n.data == d) {
			head = n.next;
			return head;
		}
		while (n.next != null) {
			if (n.data == d) {
				p.next = n.next;
			}
			p = n;
			n = n.next;
			if (n.next == null && n.data == d) {
				p.next = null;
				return head;
			}
		}
		return head;

	}

	public void add(int i, int d) {
		node n = new node();
		node p = new node();
		node node = new node();
		p = null;
		node.data = d;
		n = head;

		if (i == 0) {
			head = node;
			node.next = n;
			return;
		}
		for (int j = 0; j < i; j++) {
			p = n;
			n = n.next;
		}
		p.next = node;
		node.next = n;
	}
	public void empty(){
		head=null;
	}
}