import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.AssertJUnit.assertFalse;

public class CalculatorTest {

    public static final int FIRST_NUMBER= 2;
    public static final int SECOND_NUMBER= 3;


   Calculator calculator= new Calculator();

    private int correctExceptedResult = 5;
    private int incorrectExceptedResult = 6;




    @Test
    public void testCase1(){
        int actualResult = calculator.add(FIRST_NUMBER, SECOND_NUMBER);
        Assert.assertEquals(correctExceptedResult,actualResult);

    }

    @Test
    public void testCase2() {
        int actualResult = calculator.add(FIRST_NUMBER, SECOND_NUMBER);
        assertTrue(correctExceptedResult == actualResult);
    }

    @Test
    public void testCase3() {
        int actualResult = calculator.add(FIRST_NUMBER, SECOND_NUMBER);
        assertFalse(incorrectExceptedResult == actualResult);
    }



}
