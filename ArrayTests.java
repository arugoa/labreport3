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
  public void 
}
