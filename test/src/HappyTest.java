import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HappyTest {

    @Test
    public void testConstrutorComParametros () {
        org.junit.Assert.assertEquals(
            "testando para ver se esta legal",
            5, 5);
    }
}
