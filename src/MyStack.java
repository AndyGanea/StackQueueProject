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
        StudentInfo oldTopStudent;
        oldTopStudent = top; // The current student at the top is the old student, which we are now adding a new student on top of.
        top = newTopStudent; // Our new top is the student that we passed in.
        top.next = oldTopStudent; // Our new top has to point to the element directly below it in the stack.
        numInStack++;
    } // END OF PUSH

    public void displayStack() {
        
        if (numInStack == 0) { // This if statement is is the user tries to display an empty list.
            System.out.println("The stack is currently empty!");
        }

        StudentInfo currentStudent;
        currentStudent = top;
        while (currentStudent != null) {
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
            top.next = null;
            removedTopStudent.next = removedTopStudent;
            numInStack--;
            return removedTopStudent.next;
        }

        StudentInfo previousTopStudent;
        previousTopStudent = top.next;
        removedTopStudent.next = top;
        top.next = null;
        top = previousTopStudent;
        numInStack--;
        return removedTopStudent;
    }

    public StudentInfo peek() {
        
        if (numInStack == 0) {
            return null;
        }

        return top;
    }
}
