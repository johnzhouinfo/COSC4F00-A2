import Assign_2.InvalidInputException;
import Assign_2.TrigFunction;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author Lingjue Zhou
 * @Date 2019/10/29
 */
public class TrigFunctionTest {
    /**
     * This is a test class for testing TrigFunction functionality
     */
    private final double DIFF = 0.00000000001; //test for accuracy (11 decimal points)

    @Test
    public void sinSuccessTest() {
        Assert.assertEquals(0.0, TrigFunction.sin(0.0), DIFF);
        Assert.assertEquals(0.0, TrigFunction.sin(Math.PI), DIFF);
        Assert.assertEquals(0.0, TrigFunction.sin(2 * Math.PI), DIFF);
        Assert.assertEquals(1.0, TrigFunction.sin(Math.PI / 2), DIFF);
        Assert.assertEquals(1.0, TrigFunction.sin(5 * Math.PI / 2), DIFF);
        Assert.assertEquals(-1.0, TrigFunction.sin((3 * Math.PI) / 2), DIFF);
        Assert.assertEquals(-1.0, TrigFunction.sin((7 * Math.PI) / 2), DIFF);
        Assert.assertEquals(Math.sqrt(2) / 2, TrigFunction.sin(Math.PI / 4), DIFF);
        Assert.assertEquals(Math.sqrt(3) / 2, TrigFunction.sin(Math.PI / 3), DIFF);
    }

    @Test
    public void cosSuccessTest() {
        Assert.assertEquals(1.0, TrigFunction.cos(0.0), DIFF);
        Assert.assertEquals(1.0, TrigFunction.cos(4 * Math.PI / 2), DIFF);
        Assert.assertEquals(0.0, TrigFunction.cos(Math.PI / 2), DIFF);
        Assert.assertEquals(0.0, TrigFunction.cos((3 * Math.PI) / 2), DIFF);
        Assert.assertEquals(-1.0, TrigFunction.cos(Math.PI), DIFF);
        Assert.assertEquals(-1.0, TrigFunction.cos(3 * Math.PI), DIFF);
        Assert.assertEquals(Math.sqrt(3) / 2, TrigFunction.cos(Math.PI / 6), DIFF);
        Assert.assertEquals(Math.sqrt(2) / 2, TrigFunction.cos(Math.PI / 4), DIFF);
        Assert.assertEquals(-0.95241298041, TrigFunction.cos(60), DIFF);
    }

    @Test
    public void tanSuccessTest() {
        Assert.assertEquals(0.0, TrigFunction.tan(0.0), DIFF);
        Assert.assertEquals(0.0, TrigFunction.tan(3 * Math.PI), DIFF);
        Assert.assertEquals(1.0, TrigFunction.tan(Math.PI / 4), DIFF);
        Assert.assertEquals(1.0, TrigFunction.tan(5 * Math.PI / 4), DIFF);
        Assert.assertEquals(Math.sqrt(3), TrigFunction.tan(Math.PI / 3), DIFF);
        Assert.assertEquals(Math.sqrt(3), TrigFunction.tan(4 * Math.PI / 3), DIFF);
        Assert.assertEquals(Math.sqrt(3) / 3, TrigFunction.tan(Math.PI / 6), DIFF);
        Assert.assertEquals(-Math.sqrt(3), TrigFunction.tan((2 * Math.PI) / 3), DIFF);
    }

    @Test
    public void tanInvalidTest() {
        try {
            TrigFunction.tan(Math.PI / 2);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + Math.PI / 2 + ")", e.getMessage());
        }
        try {
            TrigFunction.tan((3 * Math.PI) / 2);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + 3 * Math.PI / 2 + ")", e.getMessage());
        }
        try {
            TrigFunction.tan(7 * Math.PI / 2);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + 7 * Math.PI / 2 + ")", e.getMessage());
        }
        try {
            TrigFunction.tan(9 * Math.PI / 2);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + 9 * Math.PI / 2 + ")", e.getMessage());
        }
    }

    @Test
    public void secSuccessTest() {
        Assert.assertEquals(1.0, TrigFunction.sec(0), DIFF);
        Assert.assertEquals(1.0, TrigFunction.sec(2 * Math.PI), DIFF);
        Assert.assertEquals(Math.sqrt(2), TrigFunction.sec(Math.PI / 4), DIFF);
        Assert.assertEquals(Math.sqrt(2), TrigFunction.sec(7 * Math.PI / 4), DIFF);
        Assert.assertEquals(2.0, TrigFunction.sec(Math.PI / 3), DIFF);
        Assert.assertEquals(-2.0, TrigFunction.sec(2 * Math.PI / 3), DIFF);
        Assert.assertEquals(2 * Math.sqrt(3) / 3, TrigFunction.sec(Math.PI / 6), DIFF);
    }

    @Test
    public void secInvalidTest() {
        try {
            TrigFunction.sec(Math.PI / 2);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + Math.PI / 2 + ")", e.getMessage());
        }
        try {
            TrigFunction.sec(3 * Math.PI / 2);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + 3 * Math.PI / 2 + ")", e.getMessage());
        }
        try {
            TrigFunction.sec(7 * Math.PI / 2);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + 7 * Math.PI / 2 + ")", e.getMessage());
        }
    }

    @Test
    public void cotSuccessTest() {
        Assert.assertEquals(1.0, TrigFunction.cot(Math.PI / 4), DIFF);
        Assert.assertEquals(1.0, TrigFunction.cot(5 * Math.PI / 4), DIFF);
        Assert.assertEquals(Math.sqrt(3), TrigFunction.cot(Math.PI / 6), DIFF);
        Assert.assertEquals(Math.sqrt(3) / 3, TrigFunction.cot(Math.PI / 3), DIFF);
        Assert.assertEquals(Math.sqrt(3) + 2, TrigFunction.cot(Math.PI / 12), DIFF);
        Assert.assertEquals(Math.sqrt(2) - 1, TrigFunction.cot(3 * Math.PI / 8), DIFF);
    }

    @Test
    public void cotInvalidTest() {
        try {
            TrigFunction.cot(0);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = 0.0)", e.getMessage());
        }
        try {
            TrigFunction.cot(Math.PI);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + Math.PI + ")", e.getMessage());
        }
        try {
            TrigFunction.cot(2 * Math.PI);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + 2 * Math.PI + ")", e.getMessage());
        }
    }

    @Test
    public void cscSuccessTest() {
        Assert.assertEquals(1.0, TrigFunction.csc(Math.PI / 2), DIFF);
        Assert.assertEquals(1.0, TrigFunction.csc(5 * Math.PI / 2), DIFF);
        Assert.assertEquals(-1.0, TrigFunction.csc(3 * Math.PI / 2), DIFF);
        Assert.assertEquals(2.0, TrigFunction.csc(Math.PI / 3), DIFF);
        Assert.assertEquals(2.0, TrigFunction.csc(5 * Math.PI / 3), DIFF);
        Assert.assertEquals(Math.sqrt(2), TrigFunction.csc(Math.PI / 4), DIFF);
        Assert.assertEquals(2 * Math.sqrt(3) / 3, TrigFunction.csc(Math.PI / 3), DIFF);
    }

    @Test
    public void cscInvalidTest() {
        try {
            TrigFunction.csc(0);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = 0)", e.getMessage());
        }
        try {
            TrigFunction.csc(Math.PI);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + 2 * Math.PI + ")", e.getMessage());
        }
        try {
            TrigFunction.csc(2 * Math.PI);
            Assert.fail("Expected an InvalidInputException to be thrown");
        } catch (InvalidInputException e) {
            Assert.assertEquals("Invalid number inputted (value = " + 2 * Math.PI + ")", e.getMessage());
        }
    }
}