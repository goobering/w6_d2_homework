package example.codeclan.com.homework;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 20/06/2017.
 */

public class TestEngineer
{
    Engineer testEngineer;

    @Before
    public void begin()
    {
        testEngineer = new Engineer(1, "test_name_1", "123456", 100.0);
    }

    @Test
    public void testRaiseSalary()
    {
        testEngineer.raiseSalary(10.0);
        assertEquals(110.0, testEngineer.getSalary(), 0.01);
    }

    @Test
    public void testChangeName()
    {
        testEngineer.setName("changed_name");
        assertEquals("changed_name", testEngineer.getName());
    }
}
