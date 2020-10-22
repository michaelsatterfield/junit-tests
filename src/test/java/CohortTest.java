import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CohortTest {
    Cohort apex;
    Cohort emptyCohort;

    @Before
    public void initial(){



        emptyCohort = new Cohort();
        apex = new Cohort();



        Student maria = new Student(1,"Maria Weebly");
        Student gene = new Student(2,"Gene Hackman");
        apex.addStudent(maria);
        apex.addStudent(gene);

        gene.addGrade(80);
        gene.addGrade(100);

    }


    @Test
    public void canAddStudent(){
        apex.addStudent(new Student(2,"joe"));
        System.out.println(apex.getStudents().get(0).getName());
        assertEquals("joe",apex.getStudents().get(0).getName());
    }
    @Test
    public void testCanGetCurrentList(){
        assertEquals(0,emptyCohort.getStudents().size());
        assertEquals(2,apex.getStudents().size());

        assertEquals(1,apex.getStudents().get(0).getId());
        assertEquals(2,apex.getStudents().get(1).getId());
    }
    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(Double.NaN, emptyCohort.getCohortAverage(), 0);
        assertEquals(90.0, apex.getCohortAverage(), 0);
//        assertEquals(95.0, cohortWithMany.getCohortAverage(), 0);
    }




}
