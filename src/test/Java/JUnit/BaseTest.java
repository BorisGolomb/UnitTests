package JUnit;

import com.epam.tat.module4.Calculator;
import org.junit.Before;

public class BaseTest {
    protected Calculator calculator;

    @Before
    public void setUP() {
        calculator = new Calculator();
    }
}
