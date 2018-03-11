package koche.se2einzelprojekt;

import org.junit.Test;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Test
    public void isPalindromTest(){
        assertEquals(true, MainActivity.isPladindrom("aabccbaa"));
    }

    @Test
    public void noPalindromTest(){
        assertEquals(false, MainActivity.isPladindrom("abvcehtaafd"));
    }

    @Test
    public void emptyPalindromTest(){
        assertEquals(true, MainActivity.isPladindrom(""));
    }


}
