 

package studentmanagement;
import java.util.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
public class Main {

    
    public static void main(String[] args) {
       ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring-context.xml");
        context.start();
        SimpleStudentRepository sip = (SimpleStudentRepository)context.getBean("stdRep");
        
        
        Set set = sip.getStudents().entrySet();

                Iterator i = set.iterator();

                 while(i.hasNext()) {
                 Map.Entry me = (Map.Entry)i.next();
                 System.out.println(((Student)me.getValue()).getFirstName());
                 System.out.println(((Student)me.getValue()).getNumber());
                             
            }
        
        
        
        
        context.stop();
    }

}
