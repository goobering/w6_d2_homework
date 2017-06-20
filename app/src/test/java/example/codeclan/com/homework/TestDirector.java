package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/06/2017.
 */

public class TestDirector
{
    Director testDirector;

    @Before
    public void begin()
    {
        testDirector = new Director(1, "test_name_1", "123456", 100.0, "test_dept_name_1", 200.0);
    }

    @Test
    public void testRaiseSalary()
    {
        testDirector.raiseSalary(10.0);
        assertEquals(110.0, testDirector.getSalary(), 0.01);
    }

    @Test
    public void testChangeName()
    {
        testDirector.setName("changed_name");
        assertEquals("changed_name", testDirector.getName());
    }
}
