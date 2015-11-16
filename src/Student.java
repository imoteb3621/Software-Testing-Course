/**
 * @author taner on 2015-11-16.
 */
public class Student {
    public String university;
    public String studentName;
    public int age;
    public int studentId;
    public int penalty;


    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getPenalty() {
        return penalty;
    }

    public void setPenalty(int penalty) {
        this.penalty = penalty;
    }

    public boolean hasNoPenalty(){
        if(this.penalty>=3){
            return false;
        }else {
            return true;
        }
    }
    public boolean isMember(){
        if(this.university=="Linneaeus University"){
            return true;
        }else{
            return false;
        }
    }
}
