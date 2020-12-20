package task;

import org.junit.*;
import org.junit.Assert;

public class ServiceTest {
    @Test
    public void testAdd001() throws Exception {
        final int add = new Service().add(0, 0);
        Assert.assertEquals(add, 0);
    }
    @Test
    public void testAdd002() throws Exception {
        final int add = new Service().add(3, 0);
        Assert.assertEquals(add, 3);
    }
}
