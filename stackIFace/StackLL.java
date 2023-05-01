package stackIFace;

//implementing stack using linked list
class StackLL {

	Node head;

	class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	boolean isEmpty() {
		return head == null;
	}

	void push(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	int pop() {
		if (head == null) {
			return -1;
		}
		Node top = head;
		head = head.next;
		return top.data;
	}

	int peek() {
		if (isEmpty()) {
			return -1;
		}
		return head.data;
	}

	public static void main(String args[]) {
		StackLL mystack = new StackLL();
		mystack.push(1);
		mystack.push(2);
		mystack.push(3);
		mystack.push(4);

		while (!mystack.isEmpty()) {
			System.out.println(mystack.peek());
			mystack.pop();
		}
	}

}
