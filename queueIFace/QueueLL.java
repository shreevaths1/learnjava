package queueIFace;

class QueueLL {
	static Node head = null;
	static Node tail = null;

	static class Node {
		int data;
		Node next;

		Node(int data) {
			this.data = data;
			this.next = null;
		}
	}

	static class Queue {
		boolean isEmpty() {
			return head == null && tail == null;
		}

		void add(int data) {
			Node newNode = new Node(data);

			if (isEmpty()) {
				head = tail = newNode;
				return;
			}
			tail.next = newNode;
			tail = newNode;
		}

		int remove() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			if (head.next == null) // if(head==tail)
			{
				tail = null;
			}
			int front = head.data;
			head = head.next;
			return front;
		}

		int peek() {
			if (isEmpty()) {
				System.out.println("Queue is empty");
				return -1;
			}
			return head.data;
		}

		public static void main(String args[]) {
			Queue q = new Queue();
			q.add(1);
			q.add(2);
			q.add(3);
			q.add(4);

			while (!q.isEmpty()) {
				System.out.println(q.peek());
				q.remove();
			}
		}
	}
}
