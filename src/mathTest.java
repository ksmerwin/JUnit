
import org.junit.Test;
import static org.junit.Assert.assertEquals;;    
    
public class mathTest {


    @Test
    public void testadd() {
        
        math m = new math();
        int sum = m.add(3,3);


        int expectedSum = 6;

        assertEquals(expectedSum, sum);

    }

    @Test
    public void testAdd() {
        
        math m = new math();
        int sum = m.add(3,3);


        int expectedSum = 6;

        assertEquals(expectedSum, sum);

    }

    @Test
    public void testSubtract() {
        
        math m = new math();
        int result = m.subtract(3,3);


        int expectedResult = 0;

        assertEquals(expectedResult, result);

    }


    @Test
    public void testMultiply() {
        
        math m = new math();
        int product = m.multiply(3,3);


        int expectedProduct = 9;

        assertEquals(expectedProduct, product);

    }

    @Test
    public void testDivide() {
        
        math m = new math();
        int result = m.divide(12,3);


        int expectedResult = 4;

        assertEquals(expectedResult, result);

    }
}
    