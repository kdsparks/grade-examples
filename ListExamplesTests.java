import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.util.ArrayList;


public class ListExamplesTests {
	@Test(timeout = 500)
	public void testMerge() {
    		List<String> l1 = new ArrayList<String>(Arrays.asList("x", "y"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("a", "b"));
		List<String> l3 = new ArrayList<String>(Arrays.asList("c", "d", "e"));
		List<String> mergedList = new ArrayList<String>();
		ListExamples.merge(l1, l2, mergedList);
		assertArrayEquals(new String[]{ "a", "b", "x", "y"}, mergedList.toArray());
		ListExamples.merge(l2, l3, mergedList);
		assertArrayEquals(new String[]{ "a", "b", "c", "d", "e"}, mergedList.toArray());
	}
}
