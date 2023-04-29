public class Students {
    int enrollment;
    String stdName;
    int rollNumber;
    static String uniName;
    static String semester;
    static int counter = 0;
    Students(int enrollment,String name){
        this.enrollment = enrollment;
        this.stdName = name;
        this.rollNumber = getRollNumber();
    }
    static void setUniName(String uniName){
        Students.uniName = uniName;
    }
    static void setSemester(String semester){
        Students.semester = semester;
    }
    static int getRollNumber(){
        counter++;
        return counter;
    }
    void displayStudent(){
        System.out.println("Student Roll No. is : "+this.rollNumber);
        System.out.println("Student Enrollment No. is : "+this.enrollment);
        System.out.println("Students name is : "+this.stdName);
        System.out.println("Students Semester  is : "+Students.semester);
        System.out.println("Students University Name is : "+Students.uniName);
    }
    static void printNTimes(int n,String str){
        for(int i = 0;i < n;i++){
            System.out.println(str);
        }
    }
}
