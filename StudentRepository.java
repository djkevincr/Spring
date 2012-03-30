 

package studentmanagement;
 
public interface  StudentRepository {
    public void save(Student student);
    public void update(Student student);
    public Student find(int number);
}
