import static org.junit.Assert.assertEquals;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void testMean() {
        double[] numbers = {1, 2, 3, 4, 5, 6};
        double mean = SkillDemo.mean(numbers);
        assertEquals(4.0, mean, 0);
    }
}
