import junitBasics.Maths;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathsTest {
    Maths object;
    @BeforeEach
    void setUp() {
        object = new Maths();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void add() {
        Assertions.assertEquals(10,object.add(4,6));
    }

    @Test
    void sub() {
        Assertions.assertEquals(6,object.sub(10,4));
    }
}