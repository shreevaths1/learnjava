package queueIFace;

class CircularQueue {
	static int arr[];
	static int rear = -1;
	static int front = -1;
	static int size;

	static class Queue {
		Queue(int n) {
			size = n;
			arr = new int[n];
		}

		boolean isEmpty() {
			return rear == -1 && front == -1;
		}

		boolean isFull() {
			return (rear + 1) % size == front;
		}

		void add(int data) {
			if (isFull()) {
				System.out.println("Queue Full");
				return;
			}
			if (front == -1) {
				front = 0;
			}
			rear = (rear + 1) % size;
			arr[rear] = data;

		}

		int remove() {
			if (isEmpty()) {
				System.out.println("Queue Empty");
				return -1;
			}
			
			int result=arr[front];
			if (front == rear) {
				front = rear = -1;
			} else {
				front = (front + 1) % size;
			}
			return result;
			

		}

		int peek() {
			if (isEmpty()) {
				System.out.println("Queue Empty");
				return -1;
			}
			return arr[front];
		}
	}

	public static void main(String args[]) {
		Queue q = new Queue(5);
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q.remove());
		q.add(6);
		
		System.out.println(q.remove());
		q.add(7);
		
		System.out.println();
		System.out.println("Printing elements of queue:");
		while(!q.isEmpty()) {
			System.out.println(q.peek());
			q.remove();
		}

	}
}
