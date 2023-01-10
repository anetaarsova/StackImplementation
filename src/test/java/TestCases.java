import org.example.FixedStack;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.ExpectedException;
@DisplayName("A stack")
public class TestCases {
    private FixedStack<Integer> instance = new FixedStack<>(100);

    @BeforeClass
    public static void setUpClass() {}

    @AfterClass
    public static void tearDownClass() {}

    @Rule
    public ExpectedException exception = ExpectedException.none();

    /**
     * Test of isEmpty method of class Stack.
     */
    @Test
    @DisplayName("is empty")
    public void testIsEmptyTrue()
    {
        assertTrue( instance.isEmpty() );
    }

    /**
     * Test of isEmpty method of class Stack.
     */
    @Test
    @DisplayName("is empty false test")
    public void testIsEmptyFalse()
    {
        instance.push( 1 );
        assertFalse( instance.isEmpty() );
    }

    /**
     * Test of pop method, of class Stack.
     */
    @Test
    public void testPop()
    {
        System.out.println("pop");
        instance.push( 1 );
        assertEquals( new Integer( 1 ), instance.pop() );
    }

    /**
     * Test of remove method of class Stack.
     */
    @Test
    public void testPopException()
    {
        System.out.println("pop");
        exception.expect( IndexOutOfBoundsException.class );
        Integer peek = instance.pop();
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush()
    {
        System.out.println("push");
        instance.push( -17 );
        assertEquals( instance.peek(), new Integer( -17 ) );
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek()
    {
        System.out.println("peek");
        instance.push( 1 );
        assertEquals( new Integer( 1 ), instance.peek() );
    }
}
