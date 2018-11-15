package prueba;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProgramTest {

    @Test
    public void sumar5y7Test(){
        final int expected=14;
        final int actual=new Program().suma(7,7);
        assertEquals(actual,expected);
    }

    @Test
    public void sumar5y8Test(){
        final int expected=13;
        final int actual=new Program().suma(5,8);
        assertEquals(actual,expected);
    }
}
