package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SubTest extends BaseTest{
    @Test(dataProvider = "subDp", groups = "sub")
    public void oneValueMinusAnother(long a, long b, long expected) {
        long result = calculator.sub(a, b);
        assertEquals(result, expected, "Invalid result of operation");
    }
    @DataProvider(name = "subDp")
    public Object[][] valuesForSub() {
        return new Object[][]{
                {20, 15, 5},
                {9, 6, 3},
                {1, -10, 11},
                {0, 0, 0}
        };
    }
}
