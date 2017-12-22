package testNG;
import com.epam.tat.module4.Calculator;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    protected Calculator calculator;

    @BeforeClass
    public void setUP() {
        System.out.println("BeforeClass setting up");

        calculator = new Calculator();

    }

    @AfterClass
    public void ac() {
        System.out.println("After Class");
    }
}
