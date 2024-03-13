import static org.junit.Assert.*;
import org.junit.*;


public class TestGrades {
	@Test(timeout = 500)
	public void testCalculateGradeA() {
		Grade[] scores = {new Grade(100, 50), new Grade(90, 30), new Grade(85, 20)};
		String theGrade = Grades.findGrade(scores);
		assertEquals("A", theGrade);
	}

	@Test(timeout = 500)
	public void testCalculateGradeC() {
		Grade[] scores = {new Grade(100, 5), new Grade(0, 30), new Grade(100, 70)};
		String theGrade = Grades.findGrade(scores);
		assertEquals("C", theGrade);
	}
}
