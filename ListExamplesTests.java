import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.util.ArrayList;


public class ListExamplesTests {
	@Test(timeout = 500)
	public void testMerge1() {
    		List<String> l1 = new ArrayList<String>(Arrays.asList("x", "y"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("a", "b"));
		List<String> mergedList = new ArrayList<String>();
		assertArrayEquals(new String[]{ "a", "b", "x", "y"}, ListExamples.merge(l1, l2, mergedList).toArray());
	}

	public void testMerge2() {
    		List<String> l1 = new ArrayList<String>(Arrays.asList("x", "y"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("a", "b"));
		List<String> l3 = new ArrayList<String>(Arrays.asList("c", "d", "e"));
		List<String> mergedList = new ArrayList<String>();
		assertArrayEquals(new String[]{ "a", "b", "x", "y"}, ListExamples.merge(l1, l2, mergedList).toArray());
		assertArrayEquals(new String[]{ "a", "b", "c", "d", "e"}, ListExamples.merge(l2, l3, mergedList).toArray());
	}
}
