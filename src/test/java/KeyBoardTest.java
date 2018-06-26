import device_management.Keyboard;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class KeyBoardTest {


    Keyboard keyBoard;

    @Before
    public void setUp(){
        keyBoard = new Keyboard("Wireless", true);
    }

    @Test
    public void keyboardHasType(){
        assertEquals("Wireless", keyBoard.getType());
    }

    @Test
    public void keyboardHasNumPad(){
        assertEquals(true, keyBoard.isNumPad());
    }

    @Test
    public void keyBoardCanType(){
        assertEquals("You typed 'Hello World' into the keyboard.", keyBoard.type("Hello World"));
    }

    @Test
    public void keyboardCanSendData(){
        assertEquals("Sending Data from keyboard... .. .", keyBoard.sendData());
    }
}
