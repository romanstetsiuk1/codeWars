package TakeATenMinuteWalk;

import org.junit.Test;

import static org.junit.Assert.*;

public class TakeATenMinuteWalkTest {
    @Test
    public void Test() {
        assertEquals("Should return true", true,
                TakeATenMinuteWalk.isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
        assertEquals("Should return false", false,
                TakeATenMinuteWalk.isValid(new char[]{'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e', 'w', 'e'}));
        assertEquals("Should return false", false,
                TakeATenMinuteWalk.isValid(new char[]{'w'}));
        assertEquals("Should return false", false,
                TakeATenMinuteWalk.isValid(new char[]{'n', 'n', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
    }

}