import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)

public class TestOneFour {
    private int[] a;
    private boolean b;
    private ArrayHelper arrayHelper;

    public TestOneFour(int[] ar, boolean bo) {
        a = ar;
        b = bo;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {new int[]{1, 1, 4, 1}, true},
                {new int[]{1, 1, 1, 1}, false},
                {new int[]{4, 4, 4, 4}, false},
                {new int[]{1, 1, 4, 2}, false}
        });
    }

    @Before
    public void init() {
        arrayHelper = new ArrayHelper();
    }

    @Test
    public void test() {
        Assert.assertEquals(b, arrayHelper.onlyOneFour(a));
    }
}
