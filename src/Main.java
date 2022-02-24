
public class Main {

	public static void main(String[] args) {

		MyStack theS = new MyStack();
		MyQueue theQ = new MyQueue();
		
		
		StudentInfo someStudent;
		StudentInfo peekedStudent;
		StudentInfo removedStudent;
		
		
// STACK
		System.out.println("\n\nTESTING THE STACK STUFF");
		

		System.out.println("\nAbout to display the stack (top to bottom)!");
		theS.displayStack();
				
				
		someStudent = new StudentInfo(111111, "Daffy", "Duck");
		theS.push(someStudent);
		theS.displayStack();
		
		
		peekedStudent = theS.peek();
		if (peekedStudent == null) {
			System.out.println("\npeeked item is null");
		}
		else {
			System.out.println("\npeeked item is " + peekedStudent.firstName);
		}
		
		System.out.println("\nAbout to display the Stack!");
		theS.displayStack();
		
		
		
// QUEUE
		System.out.println("\n\nTESTING THE QUEUE STUFF");
		
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		
		someStudent = new StudentInfo(111111, "Daffy", "Duck");
		theQ.enqueue(someStudent);
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		
		// dequeue
		removedStudent = theQ.dequeue();
		if (removedStudent == null) {
			System.out.println("\ndequeued item is null");
		}
		else {
			System.out.println("\ndequeued item is " + removedStudent.firstName);
		}
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		


	}  // end main

}
