import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SachicTest {
    Sachic s1 = new Sachic();

    @Test
    public void addTest() {

        // given
        int num1 = 40;
        int num2 = 5;

        // when
        int result = s1.add(num1, num2);
        // then
        assertEquals(45, result);
    }

    @Test
    public void subTest() {

        // given
        int num1 = 40;
        int num2 = 5;

        // when
        int result = s1.sub(num1, num2);
        // then
        assertEquals(35, result);
    }

    @Test
    public void mulTest() {

        // given
        int num1 = 40;
        int num2 = 5;

        // when
        int result = s1.mul(num1, num2);
        // then
        assertEquals(200, result);
    }

    @Test
    public void divTest() {

        // given
        int num1 = 40;
        int num2 = 5;

        // when
        int result = s1.div(num1, num2);
        // then
        assertEquals(8, result);
    }
}
