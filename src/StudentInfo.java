public class StudentInfo {
    
    // Attributes
    public int studentNum;
    public String firstName;
    public String lastName;
    public StudentInfo next;

    // Constructor Declaration of Class
    public StudentInfo () {
        studentNum = 917387;
        firstName = "Andy";
        lastName = "Ganea";
    }
    public StudentInfo(int studentNum, String firstName, String lastName) {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.lastName = lastName;
        next = null; // Don't point to another student
    }


}
