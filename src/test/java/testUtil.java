import com.example.gui_basic.util;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testUtil{
    util util = null;

    @Before
    public void init(){
        util=new util();
    }

    @Test
    public void testuresEdatum(){
        assertEquals(true, util.Ketto_tizennyolcE(5));
        assertEquals(false, util.Ketto_tizennyolcE(2));
        assertEquals(true, util.Ketto_tizennyolcE(18));
        assertEquals(false, util.Ketto_tizennyolcE(19));
        assertEquals(false, util.Ketto_tizennyolcE(1));
        assertEquals(false, util.Ketto_tizennyolcE(-1));
        assertEquals(false, util.Ketto_tizennyolcE(2));


    }


}
