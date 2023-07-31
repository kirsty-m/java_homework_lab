import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before(){
        printer = new Printer(100, 2, 10);
        }


    @Test
    public void printJob(){
        assertEquals(true, printer.print());
    }

}
