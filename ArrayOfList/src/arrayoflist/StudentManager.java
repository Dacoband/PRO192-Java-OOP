
package arrayoflist;


public class StudentManager {
    //Khai báo mảng chứa danh sách sinh viên 
    Student studentList[] = new Student[50];
    //Số sinh viên đã lưu trữ
    int numOfStudent = 0 ;
    //phương thức lấy sinh viên theo index
    public Student getStudentByIndex(int index){
        return studentList[index];
    }
    //thêm sinh viên mới
    public int addStudent(Student newStudent){
        if (numOfStudent < studentList.length) {
            studentList[numOfStudent++] = newStudent;
            return 1;
        }
        else{
            return 0;
        }
    } // end addStudent


public void printStudentList(){
    System.out.println("Student List: ");
        for(int i = 0; i< numOfStudent;i++){
        System.out.println(studentList[i].toString());
    } 
}

// Tìm sinh viên theo ID
public int findStudent(String ID){
    int result = 0;
    for(int i = 0; i < numOfStudent; i++){
        System.out.println(studentList[i].getmID() == ID);
    } return result;
}//end findStudent
public void updateStudent(Student newstudent) {
        
    }//end updateStudent
}
