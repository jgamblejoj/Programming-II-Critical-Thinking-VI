import java.util.Comparator;
import java.util.ArrayList;

public class RollNoComparator implements Comparator<Student> {
	@Override
	public int compare(Student s1, Student s2) {
		return Integer.compare(s1.getRollNo(), s2.getRollNo());
	}
	// Selection Sort method using comparator
	public void selectionSort(ArrayList<Student> studentArray, Comparator<Student> comparator) {
        // Outer loop
		for (int i = 0; i < studentArray.size() - 1; i++) {
			// Assume the first item is the current minimum
            int minIndex = i;
            // inner loop
            for (int j = i + 1; j < studentArray.size(); j++) {
                if (comparator.compare(studentArray.get(j), studentArray.get(minIndex)) < 0) {
                    minIndex = j;
                }
            }
            // Swap the current item with the minimum item, if they are different
            if (minIndex != i) {
                Student temp = studentArray.get(i);
                studentArray.set(i, studentArray.get(minIndex));
                studentArray.set(minIndex, temp);
            }
        }
		// Print the sorted Student objects based on their toStrings
        for (int i = 0; i < studentArray.size(); i++) {
        	System.out.print(studentArray.get(i));
        }
    }
}

