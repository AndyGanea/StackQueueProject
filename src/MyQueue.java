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
        for (int i = 0; i < numInQueue; i++) {
            if (currentStudent.next == null) 
        }
    }
}
