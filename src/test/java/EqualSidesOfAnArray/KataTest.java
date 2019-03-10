package EqualSidesOfAnArray;

import org.junit.Test;

import static org.junit.Assert.*;

public class KataTest {

    @Test
    public void shouldReturn3() {
        assertEquals(3,Kata.findEvenIndex(new int[] {1,2,3,4,3,2,1}));
    }

    @Test
    public void shouldReturn1() {
        assertEquals(1,Kata.findEvenIndex(new int[] {1,100,50,-51,1,1}));
    }

    @Test
    public void shouldReturnMinus1() {
        assertEquals(-1,Kata.findEvenIndex(new int[] {1,2,3,4,5,6}));
    }

}