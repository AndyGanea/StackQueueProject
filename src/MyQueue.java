public class MyQueue {
    
    // Attributes
    StudentInfo front;
    public int numInQueue;

    // Constructor
    public MyQueue () {
        front = null;
        numInQueue = 0;
    }

    // Methods 
    public void enqueue(StudentInfo studentBeingAdded) {
        
        if (numInQueue == 0) { // If the queue is empty, the person lining up it automatically at the front
            front = studentBeingAdded;
            numInQueue++;
            return;
        }

        StudentInfo currentStudent = front;
        for (int i = 0; i < numInQueue; i++) { // The student being added needs to join the line-up at the back of the queue, so it cycles through every element.
            if (currentStudent.next == null) { // This if statement triggers when the for loop reaches the last student in the queue.
                currentStudent.next = studentBeingAdded;
                studentBeingAdded = currentStudent;
                numInQueue++;
                return;
            }
            else {
                currentStudent = currentStudent.next;
            }
        }
    } // END OF ENQUEUE

    public StudentInfo dequeue() {
        if (numInQueue == 0) {
            return null;
        }

        else {
            StudentInfo studentBeingRemoved = front; // The students exit the queue from the front of the list.
            front = front.next; // The new front is now the student next in line.
            numInQueue--;
            return studentBeingRemoved;
        }
    } // END OF DEQUEUE

    public void displayQueue() {
        if (numInQueue == 0) {
            System.out.println("The queue is empty.");
        }

        StudentInfo currentStudent = front;

        while (currentStudent != null) { // This crawls down the queue until it reaches the last student.
            System.out.println(currentStudent.firstName);
            System.out.println(currentStudent.studentNum);

            currentStudent = currentStudent.next;
        }
    } // END OF DISPLAYQUEUE
}
