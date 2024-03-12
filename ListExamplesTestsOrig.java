import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;
import java.util.ArrayList;


public class ListExamplesTests {
	@Test(timeout = 500)
	public void testMerge1() {
    	List<String> l1 = new ArrayList<String>(Arrays.asList("a", "b"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("g", "h"));
		assertArrayEquals(new String[]{ "a", "b", "g", "h"}, ListExamplesOrig.merge(l1, l2).toArray());
	}

	public void testMerge2() {
    	List<String> l1 = new ArrayList<String>(Arrays.asList("x", "y"));
		List<String> l2 = new ArrayList<String>(Arrays.asList("a", "b"));
		assertArrayEquals(new String[]{ "a", "b", "x", "y"}, ListExamplesOrig.merge(l1, l2).toArray());
	}
}
