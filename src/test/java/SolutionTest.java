import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class SolutionTest {
    @Test
    public void test2(){
        List<Integer> heights = new ArrayList<>(List.of(6,5,3,9,2,7));
        long expected = 22;
        long actual = new Solution().maximumSumOfHeights(heights);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test3(){
        List<Integer> heights = new ArrayList<>(List.of(3,2,5,5,2,3));
        long expected = 18;
        long actual = new Solution().maximumSumOfHeights(heights);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void test5(){
        List<Integer> heights = new ArrayList<>(List.of(1,12,19));
        long expected = 32;
        long actual = new Solution().maximumSumOfHeights(heights);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test8(){
        List<Integer> heights = new ArrayList<>(List.of(2,4,1,3,5));
        long expected = 11;
        long actual = new Solution().maximumSumOfHeights(heights);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test9(){
        List<Integer> heights = new ArrayList<>(List.of(1,5,2,5,6,4,6,3,4,5));
        long expected = 33;
        long actual = new Solution().maximumSumOfHeights(heights);

        Assert.assertEquals(expected, actual);
    }
}
