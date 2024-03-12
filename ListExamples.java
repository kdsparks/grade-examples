import java.util.ArrayList;
import java.util.List;

interface StringChecker { boolean checkString(String s); }

class ListExamples {

	// Takes two sorted list of strings (so "a" appears before "b" and so on),
	// and return a new list that has all the strings in both list in sorted order.
	static void merge(List<String> list1, List<String> list2, List<String> mergedList) {
		mergedList.clear();
		int index1 = 0, index2 = 0;
		while(index1 < list1.size() && index2 < list2.size()) {
			if(list1.get(index1).compareTo(list2.get(index2)) < 0) {
				mergedList.add(list1.get(index1));
				index1 += 1;
			}
			else {
				mergedList.add(list2.get(index2));
				index2 += 1;
			}
		}
		while(index1 < list1.size()) {
			mergedList.add(list1.get(index1));
			index1 += 1;
		}
		while(index2 < list2.size()) {
			mergedList.add(list2.get(index2));
			index2 += 1;
		}
	}
}
