import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
//import java.util.ArrayList;


public class TestGrades {
	@Test(timeout = 500)
	public void testCalculateGrade() {
		Grade[] scores = {new Grade(100, 50), new Grade(90, 30), new Grade(85, 20)};
		String theGrade = Grades.findGrade(scores);
		assertEquals(theGrade, "A");
	}
}
