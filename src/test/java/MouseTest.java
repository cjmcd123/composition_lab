import device_management.Mouse;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MouseTest {

    Mouse mouse;

    @Before
    public void setUp(){
        mouse = new Mouse("Wireless", 3);
    }

    @Test
    public void mouseHasType(){
        assertEquals("Wireless", mouse.getType());
    }

    @Test
    public void mouseHasButtons(){
        assertEquals(3, mouse.getButtons());
    }

    @Test
    public void mouseCanMove(){
        assertEquals("The Mouse is moved: right", mouse.move("right"));
    }

    @Test
    public void mouseCanClick(){
        assertEquals("The Mouse clicked the button", mouse.click());
    }

    @Test
    public void mouseCanSendData(){
        assertEquals("The Mouse did something.", mouse.sentData());
    }
}
