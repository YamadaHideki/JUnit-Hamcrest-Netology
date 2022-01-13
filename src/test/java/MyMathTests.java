import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.hamcrest.Matchers.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.*;


public class MyMathTests {
    MyMath sut;

    @BeforeEach
    public void init() {
        sut = new MyMath();
    }

    @Test
    public void testObjNotSame() {
        assertNotSame(new MyMath(), sut);
    }

    @Test
    public void testSumOfCubes() {
        int a = 3, b = 5, expected = 152;

        double result = sut.SumOfCubes(a, b);

        assertEquals(expected, result);
    }

    @Test
    public void testIsEven() {
        int a = 63;

        assertFalse(sut.IsEven(a));
    }

    @ParameterizedTest
    @MethodSource("source")
    public void testMultiplication(double a, double b, double expected) {
        assertThat(sut.Multiplication(a, b), equalTo(expected));
    }

    private static Stream<Arguments> source() {
        return Stream.of(Arguments.of(5, 5, 25.0), Arguments.of(3, 7, 21.0));
    }

    @Test
    public void testLastResultType() {
        assertThat(sut.getLastResult(), instanceOf(Double.TYPE));
    }

    @Test
    public void testSutNotNullValue() {
        assertThat(sut, notNullValue());
    }

}
