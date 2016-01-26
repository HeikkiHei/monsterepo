package monster.userInterface;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class NonGraphicInterfaceTest {

    public NonGraphicInterfaceTest() {
    }
    
    NonGraphicInterface testi;
    
    @Before
    public void setUp() {
        testi = new NonGraphicInterface();
    }

    @Test
    public void runWorksTest() {
        testi.run();
    }

}
