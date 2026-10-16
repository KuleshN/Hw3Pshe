public class University {
    static String universityName = "MGU";
    final int studentID;
    String studentName;

    University(int studentID, String studentName){
        this.studentID=studentID;
        this.studentName=studentName;
    }
    static void changeUniversityName(String newName){
        universityName=newName;
    }
    public String getStudentName(){
        return studentName;
    }
    public void printStudentInfo(){
        System.out.println(getStudentName() +" "+ studentID +" "+universityName);
    }
}
