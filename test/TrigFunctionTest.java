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
        Assert.assertEquals(0.0, java.util.Optional.of(TrigFunction.sin(0)));
        Assert.assertEquals(1.0, java.util.Optional.of(TrigFunction.sin(Math.PI / 2)));
        Assert.assertEquals(0.0, java.util.Optional.of(TrigFunction.sin(Math.PI)));
        Assert.assertEquals(-1.0, java.util.Optional.of(TrigFunction.sin((3 * Math.PI) / 2)));
    }

    @Test
    public void cosSuccessTest() {
        Assert.assertEquals(1.0, java.util.Optional.of(TrigFunction.cos(0)));
        Assert.assertEquals(0.0, java.util.Optional.of(TrigFunction.cos(Math.PI / 2)));
        Assert.assertEquals(-1.0, java.util.Optional.of(TrigFunction.cos(Math.PI)));
        Assert.assertEquals(0.0, java.util.Optional.of(TrigFunction.cos((3 * Math.PI) / 2)));
    }
}