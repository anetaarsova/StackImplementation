import org.example.FixedStack;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.AfterClass;
import org.junit.BeforeClass;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.rules.ExpectedException;

import java.util.Optional;

@DisplayName("A stack")
public class TestCases {

//    @BeforeAll
//    static void setup() {
//        log.info("@BeforeAll - executes once before all test methods in this class");
//    }
//
//    @BeforeEach
//    void init() {
//        log.info("@BeforeEach - executes before each test method in this class");
//    }
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
     * Test of remove method of class Stack.
     */
    @Test
    public void testPopException()
    {
        System.out.println("pop");
        instance.push( -17 );
        exception.expect( IndexOutOfBoundsException.class );
        Integer peek = (Integer) instance.pop();
    }

    /**
     * Test of push method, of class Stack.
     */
    @Test
    public void testPush()
    {
        System.out.println("push");
        instance.push( -17 );
        assertEquals(instance.push(-20),instance.peek());
    }

    /**
     * Test of peek method, of class Stack.
     */
    @Test
    public void testPeek()
    {
        System.out.println("peek");
        instance.push( 1 );
        assertEquals( instance.push(1), instance.peek());
    }
}
