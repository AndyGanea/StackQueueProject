
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

		someStudent = new StudentInfo(222222, "Elmer", "Fudd");
		theS.push(someStudent);
		theS.displayStack();

		someStudent = new StudentInfo(333333, "Foghorn", "Leghorn");
		theS.push(someStudent);
		theS.displayStack();

		theS.pop();
		theS.displayStack();
		theS.pop();
		theS.displayStack();
		theS.pop();
		theS.displayStack();

		someStudent = new StudentInfo(444444, "Jeffrey-Kai", "Li");
		theS.push(someStudent);
		theS.displayStack();

		someStudent = new StudentInfo(555555, "Abhinav", "Bala");
		theS.push(someStudent);
		theS.displayStack();
		
		
		
// QUEUE
		System.out.println("\n\nTESTING THE QUEUE STUFF");
		
		
		System.out.println("\nAbout to display the queue (front to rear)!");
		theQ.displayQueue();
		
		
		someStudent = new StudentInfo(111111, "Daffy", "Duck");
		theQ.enqueue(someStudent);

		someStudent = new StudentInfo(222222, "Elmer", "Fudd");
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

		removedStudent = theQ.dequeue();
		theQ.displayQueue();
		
		


	}  // end main

}
