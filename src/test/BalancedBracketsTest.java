package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void openAndClosedBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void stringInsideBracketsReturnTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[hello]"));
    }
    @Test
    public void nestedBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[[]]"));
    }

    @Test
    public void onlyOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void testBracketsInsideOutFramingWordReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Oh ]hello[ there"));
    }
    @Test
    public void bracketInWrongOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void twoStatements() {
        String hello = "[hello]";
        String world = "Wo][rld";

        assertEquals(!BalancedBrackets.hasBalancedBrackets(hello), BalancedBrackets.hasBalancedBrackets(world));
    }

    @Test
    public void onlySingleBracketsInterlaced() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    @Test
    public void onlySingleBracketsBeforeOtherChars() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]Hello"));
    }

    @Test
    public void twoSetsOfBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode[]"));
    }

    @Test
    public void leftBraceOnlyReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void stringWithNoBraces() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }
}
