 
package studentmanagement;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
 
public class SimpleStudentRepository implements StudentRepository{

    private Map<Integer,Student> students;

    public SimpleStudentRepository() {
        students = new LinkedHashMap<Integer, Student>();
    }



    public void save(Student student) {
        students.put(student.getNumber(), student);
    }

    

    public void update(Student student) {
        students.remove(student.getNumber());
         students.put(student.getNumber(), student);
    }

    public Student find(int number) {
        Student student = students.get(number);
        return student;
    }

    public Map<Integer, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<Integer, Student> students) {
        this.students = students;
    }

    
  

}
