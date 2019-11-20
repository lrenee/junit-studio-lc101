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
    public void onlyBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]"));
    }

    /* Test #1 */

    @Test
    public void oneSetOfBracketsWithTextReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[LaunchCode]"));
    }

    /* Test #2 */

    @Test
    public void oneSetOfEmbeddedBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("Launch[Code]"));
    }

    /* Test #3 */

    @Test
    public void oneSetOfEmptyBracketsWithTextAfterReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[]LaunchCode"));
    }

    /* Test #4 */

    @Test
    public void emptyStringReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets(""));
    }

    /* Test #5 */

    @Test
    public void multipleBracketsReturnsTrue() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertTrue(test_Class.hasBalancedBrackets("[Launch][Code]"));
    }

    /* Test #6 */

    @Test
    public void onlyOneOpeningBracketReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[LaunchCode"));
    }

    /* Test #7 */

    @Test
    public void onlyOneClosingBracketReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("LaunchCode]"));
    }

    /* Test #8 */

    @Test
    public void embeddedClosingBracketBeforeOpeningBracketReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("Launch]Code["));
    }

    /**
     * must write at least 12 tests
     */

    /* Test #9 */

    @Test
    public void closingBracketOnlyReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]"));
    }


    /* Test #10 */

    @Test
    public void openingBracketOnlyReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("["));
    }

    /* Test #11 */

    @Test
    public void closingBracketBeforeOpeningBracketReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("]["));
    }

    /* Test #12 */

    @Test
    public void doubleEmbeddedBracketsReturnsFalse() {
        BalancedBrackets test_Class = new BalancedBrackets();
        assertFalse(test_Class.hasBalancedBrackets("[[LaunchCode]]"));
    }

}
