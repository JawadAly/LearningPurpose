public class Student {
    protected int studentId;
    protected String studentName;
    protected static String universityName = "Bahria University";
    public Student(){
        this.studentId = 0;
        this.studentName = "Nill";
    }
    public Student(int stdId,String stdName){
        this.studentId = stdId;
        this.studentName = stdName;
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    public static String getUniversityName() {
        return universityName;
    }

    public static void setUniversityName(String universityName) {
        Student.universityName = universityName;
    }



}
