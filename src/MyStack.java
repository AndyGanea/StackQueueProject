public class MyStack {
    
    // Attributes
    public int numInStack;
    public StudentInfo top;

    // Constructor 
    public MyStack() {
        numInStack = 0;
        top = null;
    }

    // Methods

    public void push(StudentInfo newTopStudent) {
        if (numInStack == 0) {
            top = newTopStudent;
            top.next = null;
            numInStack++;
            return;
        }  
        
        StudentInfo oldTopStudent;
        oldTopStudent = top; // The current student at the top is the old student, which we are now adding a new student on top of.
        top = newTopStudent; // Our new top is the student that we passed in.
        top.next = oldTopStudent; // Our new top has to point to the element directly below it in the stack.
        numInStack++;
        return;
    } // END OF PUSH

    public void displayStack() {
        
        if (numInStack == 0) { // This if statement is is the user tries to display an empty list.
            System.out.println("The stack is currently empty!");
            return;
        }

        StudentInfo currentStudent;
        currentStudent = top; // To display the stack, we have to crawl down it from top the bottom, as specified.
        while (currentStudent != null) { // If currentStudent is null, we have reached the end of the stack.
            System.out.println(currentStudent.firstName);
            System.out.println(currentStudent.studentNum);
            currentStudent = currentStudent.next;
        }
    } // END OF DISPLAYSTACK

    public StudentInfo pop() {
        
        if (numInStack == 0) {
            return null;
        }

        StudentInfo removedTopStudent = top;

        if (numInStack == 1) {
            removedTopStudent.next = top;
            top.next = null; // Since the list becomes empty if you remove the only item from it, top.next reverts to null.
            removedTopStudent.next = removedTopStudent; // If the next value of a student points into itself, it removes itself from the list.
            numInStack--;
            return removedTopStudent.next;
        }

        StudentInfo previousTopStudent;
        previousTopStudent = top.next;
        removedTopStudent.next = top; // These lines make sure that the second item from the top becomes the new top of the popped list.
        top.next = null;
        top = previousTopStudent; // This line also makes sure that the new top points to the correct stack again.
        numInStack--;
        return removedTopStudent;
    } // END OF POP

    public StudentInfo peek() {
        
        if (numInStack == 0) {
            return null;
        }

        return top; // Peek simply returns the top of the list, so only one line is actually needed.
    } // END OF PEAK
}
