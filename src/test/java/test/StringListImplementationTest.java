package test;

import org.junit.Assert;
import org.junit.Test;
import ru.pro.sky.exception.NullItemException;
import ru.pro.sky.exception.SizeLimitListException;
import ru.pro.sky.service.impl.StringListImpl;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static test.Constants.STRINGS;


public class StringListImplementationTest {
    private final StringListImpl stringList = new StringListImpl();


    @Test
    public void add_CorrectParams_returnsAndAdds() {

        String testString = "text";

        String actualResult = stringList.add(testString);

        Assert.assertEquals(testString, actualResult);
    }

    @Test
    public void add_NullParameter_ThrowsNullItemException() {

        String testString = null;

        assertThrows(NullItemException.class, () -> stringList.add(testString));
    }

    @Test
    public void add_ArrayFull_ThrowsSizeListException() {

        String filler = "filler";
        for (int i = 0; i < 10; i++) {
            stringList.add(filler);
        }
        String testString = "text";
        assertThrows(SizeLimitListException.class, () -> stringList.add(testString));
    }

    @Test
    public void add_CorrectParams_AddAndReturn() {

        String testString = "text";

        String actualResult = stringList.add(testString);

        Assert.assertEquals(testString, actualResult);
    }

    @Test
    public void add_CorrectParams_AddAndReturn_ByIndex() {

        STRINGS[0] = "test";

        stringList.add(0, "test");

        assertArrayEquals(STRINGS, stringList.getStorage());
    }
}


