import static org.junit.Assert.*;
import org.junit.*;


public class TestGrades {
	@Test(timeout = 500)
	public void testCalculateGradeA() {
		Grade[] scores = {new Grade(100, 50), new Grade(90, 30), new Grade(85, 20)};
		String theGrade = Grades.findGrade(scores);
		assertEquals(theGrade, "A");
	}

	@Test(timeout = 500)
	public void testCalculateGradeC() {
		Grade[] scores = {new Grade(100, 5), new Grade(90, 30), new Grade(80, 65)};
		String theGrade = Grades.findGrade(scores);
		assertEquals(theGrade, "C");
	}
}
