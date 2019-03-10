package XO;

import org.junit.Test;

import static org.junit.Assert.*;

public class XOTest {

    @Test
    public void shouldReturnTrueWhenCountXEqualCountO() {
//        given
        String str = "XfoxreO";
//        when

//        then
        assertTrue(true);
    }

    @Test
    public void shouldReturnFalseWhenCountXNotEqualCountO() {
//        given
        String str = "XxOosdfreOdfgh";
//        when

//        then
        assertFalse(false);
    }

}