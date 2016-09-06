package HelloWorld;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {
    private final HelloWorld hw = new HelloWorld();

    @Test
    public void saySomething() {
        assertEquals("Hello God ! This is your world!",
                hw.say(""));
    }

    @Test
    public void sayMorething() {
        assertEquals("Hello LiWei ! This is your world!",
                hw.say("LiWei"));
    }
}
