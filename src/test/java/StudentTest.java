import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class StudentTest {
    @Test
    public void studentClassHasConstructor(){
        Student jon = new Student(1l,"jon");
        Student nick = new Student(2l,"nick");
        assertNotNull(jon);
        assertNotNull(nick);

}
 @Test
public void testStudentFields(){
     Student jon = new Student(1l,"jon");
     assertSame(1L,jon.getId());
     assertSame("jon",jon.getName());
     assertSame(0,jon.getGrades().size());
 }
    @Test
    public void testAddGrade(){
        Student jon = new Student(1l,"jon");
        jon.addGrade(75);
        assertSame(75,jon.getGrades().get(0));
    }




 @Test
 public void testAverage(){
     Student jon = new Student(1l,"jon");
     jon.addGrade(100);
     jon.addGrade(80);
     assertEquals(90,jon.getGradeAverage(),0);


 }


}
