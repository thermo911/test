import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class TestAfterFour {
    private int[] a;
    private int[] b;
    private ArrayHelper arrayHelper;

    public TestAfterFour(int[] a, int[] b) {
        this.a = a;
        this.b = b;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1, 1, 4, 1}, new int[]{1}},
                {new int[]{1, 4, 2, 1}, new int[]{2, 1}}
        });
    }

    @Before
    public void init() {
        arrayHelper = new ArrayHelper();
    }

    @Test
    public void test1() {
        Assert.assertArrayEquals(b, arrayHelper.getAfterFour(a));
    }

    @Test (expected = RuntimeException.class)
    public void test2() {
        arrayHelper.getAfterFour(new int[]{1, 2, 3});
    }

}
