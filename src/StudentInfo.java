public class StudentInfo {
    
    // Attributes
    public int studentNum;
    public String firstName;
    public String lastName;
    public double height;
    public double weight;
    public StudentInfo next;

    // Constructor Declaration of Class
    public StudentInfo () {
        studentNum = 917387;
        firstName = "Andy";
        lastName = "Ganea";
        height = 165;
        weight = 51;
    }
    public StudentInfo(int studentNum, String firstName, String lastName, double height, double weight) {
        this.studentNum = studentNum;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
        this.weight = weight;
        next = null; // Don't point to another student
    }


}
