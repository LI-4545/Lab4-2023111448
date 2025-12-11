import org.example.Solution2;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Solution2Test {

    @Test
    public void testExample1() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("bcabc");
        assertEquals("abc", result);
    }

    @Test
    public void testExample2() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("cbacdcbc");
        assertEquals("acdb", result);
    }

    @Test
    public void testAllSameLetters() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("aaaaaa");
        assertEquals("a", result);
    }

    @Test
    public void testAlreadyUnique() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("abcdef");
        assertEquals("abcdef", result);
    }

    @Test
    public void testReverseOrder() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("fedcba");
        assertEquals("fedcba", result);
    }

    @Test
    public void testSingleLetter() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("z");
        assertEquals("z", result);
    }

    @Test
    public void testEmptyString() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("");
        assertEquals("", result);
    }

    @Test
    public void testComplexCase1() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("leetcode");
        assertEquals("letcod", result);
    }

    @Test
    public void testComplexCase2() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("bcabc");
        assertEquals("abc", result);
    }

    @Test
    public void testComplexCase3() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("abacb");
        assertEquals("abc", result);
    }

    @Test
    public void testWithDuplicateAtEnd() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("abcabc");
        assertEquals("abc", result);
    }

    @Test
    public void testAllLettersSameMultiple() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("zzzzzz");
        assertEquals("z", result);
    }

    @Test
    public void testAlternatingLetters() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("abababab");
        assertEquals("ab", result);
    }

    @Test
    public void testLargeInput() {
        Solution2 solution = new Solution2();
        String input = "abcdefghijklmnopqrstuvwxyz" + "zyxwvutsrqponmlkjihgfedcba";
        String result = solution.removeDuplicateLetters(input);
        assertEquals("abcdefghijklmnopqrstuvwxyz", result);
    }

    @Test
    public void testNullInput() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters(null);
        assertEquals("", result);
    }

    @Test
    public void testCase1() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("bcabc");
        assertEquals("abc", result);
    }

    @Test
    public void testCase2() {
        Solution2 solution = new Solution2();
        String result = solution.removeDuplicateLetters("cbacdcbc");
        assertEquals("acdb", result);
    }
}