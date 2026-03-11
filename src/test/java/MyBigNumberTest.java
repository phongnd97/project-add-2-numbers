import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBigNumberTest {

    @Test
    public void testSum1() {
        MyBigNumber bigNumber = new MyBigNumber();
        assertEquals("2131", bigNumber.sum("1234", "897"));
    }

    @Test
    public void testSum2() {
        MyBigNumber bigNumber = new MyBigNumber();
        assertEquals("1000", bigNumber.sum("999", "1"));
    }

    @Test
    public void testSum3() {
        MyBigNumber bigNumber = new MyBigNumber();
        assertEquals("579", bigNumber.sum("123", "456"));
    }

}
