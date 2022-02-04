import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testSumArray() {
        int[] arr = {1,2,3,4,5};
        assertEquals(0, SkillDemo.sumArray(arr));
    }
}
