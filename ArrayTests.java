import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
  }

  
  @Test
  public void reverseinplacetest() {
    int[] input1 = {32, 45, 03, 21, 33};
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[] {33, 21, 03, 45, 32}, input1);
  }

  @Test
  public void reversedtest() {
    int[] input1 = {23, 34, 45, 56};
    assertArrayEquals(new int[] {56, 45, 34, 23}, ArrayExamples.reversed(input1));
  }

  @Test
  public void averageWithoutLowestTest() {
    double[] input1 = null;
    double[] input2 = {23, 43.5, 56, 2, 45, 33};
    double[] input3 = {32.3, 44.3, 222.1, 3};
    double[] input4 = {1, 1, 3, 45.9, 32};
    assertEquals(40.1, ArrayExamples.averageWithoutLowest(input2), 0.1);
    assertEquals(99.5, ArrayExamples.averageWithoutLowest(input3), 0.1);
    //assertEquals(0.0, ArrayExamples.averageWithoutLowest(input1), 0);
    assertEquals(26.9, ArrayExamples.averageWithoutLowest(input4), 0.1);
  }
}
