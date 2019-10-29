import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TrigFunctionTest {

    @Test
    public void initial() {
        Assert.assertEquals("Hello world!", TrigFunction.initial());
    }

    @Test
    public void sinSuccessTest() {
        Assert.assertEquals(0.0, TrigFunction.sin(0.0), 0.0000000000001);
        Assert.assertEquals(1.0, TrigFunction.sin(Math.PI / 2), 0.00000000000001);
        Assert.assertEquals(0.0, TrigFunction.sin(Math.PI), 0.00000000000001);
        Assert.assertEquals(-1.0, TrigFunction.sin((3 * Math.PI) / 2), 0.00000000000001);
    }

    @Test
    public void cosSuccessTest() {
        Assert.assertEquals(1.0, TrigFunction.cos(0.0), 0.00000000000001);
        Assert.assertEquals(0.0, TrigFunction.cos(Math.PI / 2), 0.00000000000001);
        Assert.assertEquals(-1.0, TrigFunction.cos(Math.PI), 0.00000000000001);
        Assert.assertEquals(0.0, TrigFunction.cos((3 * Math.PI) / 2), 0.00000000000001);
        Assert.assertEquals(-0.95241298041, TrigFunction.cos(60), 0.00000000001);
    }
}