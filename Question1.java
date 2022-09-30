import java.util.ArrayList;
import java.util.Collections;

public class Question1 {
	public static ArrayList<Integer> sqsorted(ArrayList<Integer> arr) {
		// Write your code here.
        ArrayList<Integer> newArr = new ArrayList<>();
        for(int i : arr){
            newArr.add(i*i);
        }
        Collections.sort(newArr);
        return newArr;
	}
}