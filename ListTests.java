import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTests {
    @Test
    public void mergetest() {
        List<String> input1 = new ArrayList<>();
        input1.add("apple");
        input1.add("banana");
        input1.add("orange");
        
        List<String> input2 = new ArrayList<>();
        input2.add("bear");
        input2.add("cat");
        input2.add("lion");
        //input2.add("tiger");
        
        ArrayList<String> output = new ArrayList<String>(List.of("apple", "banana", "bear", "cat", "lion", "orange"));
        ArrayList<String> actual = new ArrayList<String>(ListExamples.merge(input1, input2));
        assertTrue(output.equals(actual));
    }
}
