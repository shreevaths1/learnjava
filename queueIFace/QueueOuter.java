package queueIFace;

class QueueOuter {
	static int arr[];
	static int rear, size;

	static class Queue {

		Queue(int n) {
			arr = new int[n];
			size = n;
			rear = -1;
		}

		boolean isEmpty() {
			return rear == -1;
		}

		void add(int data) {
			if (rear == size-1) {
				System.out.println("Queue full");
				return;
			}
			rear++;
			arr[rear] = data;
		}

		int remove() {
			if (isEmpty()) {
				System.out.println("Queue empty");
				return -1;
			}

			int front = arr[0];
			for (int i = 0; i < rear; i++) {
				arr[i] = arr[i + 1];
			}
			rear--;
			return front;
		}

		int peek() {
			if (isEmpty()) {
				System.out.println("Queue empty");
				return -1;
			}
			return arr[0];
		}
	}

	public static void main(String args[]) {
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		q.add(6);
		
		System.out.println(q.peek());
		
		q.remove();
		q.remove();
		q.remove();
		System.out.println(q.peek());
	}
}
