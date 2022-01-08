import com.example.gui_basic.util;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testUtil{
    util util = null;

    @BeforeEach
    public void init(){
        util=new util();
    }

    @Test
    public void testuresEdatum(){
        assertEquals(true, util.Ketto_tizennyolcE(5));
        assertEquals(true, util.Ketto_tizennyolcE(18));

        assertEquals(false, util.Ketto_tizennyolcE(2));
        assertEquals(false, util.Ketto_tizennyolcE(19));
        assertEquals(false, util.Ketto_tizennyolcE(1));
        assertEquals(false, util.Ketto_tizennyolcE(-1));
        assertEquals(false, util.Ketto_tizennyolcE(2));

    }
    @Test
    public void tesztKeteves(){
        assertEquals(true, util.keteves(0));
        assertEquals(true, util.keteves(2));

        assertEquals(false, util.keteves(3));
        //assertEquals(false, util.keteves(-1));
    }
    @Test
    public void tesztKedvezmenyesArSzamolo(){
        // 2 év alatti gyerekek ingyen utaznak
        assertEquals("0", util.kedvezmenyesArSzamolo("1000",100));
        //2-18 év közötti utasok 40% kedvezményt kapnak minden úticélra
        assertEquals("600", util.kedvezmenyesArSzamolo("1000",40));
       // Utasok, akik legalább 6 napot maradnak a célországban, újabb 10% kedvezményt kapnak
        assertEquals("900", util.kedvezmenyesArSzamolo("1000",10));
        assertEquals("500", util.kedvezmenyesArSzamolo("1000",50));
        //Amerikába, de nem az USA-ba utazó vendégek 25% kedvezményt kapnak ha nem hétfőn vagy pénteken utaznak
        assertEquals("750", util.kedvezmenyesArSzamolo("1000",25));
        //18 évesnél idősebb USA-ba utazó vendégek 20% kedvezményt kapnak, ha nem hétfőn vagy pénteken utaznak (indulási idő).
        assertEquals("800", util.kedvezmenyesArSzamolo("1000",20));


    }
    @Test
    public void tesztUresEdatum(){
       assertEquals(false, util.uresEdatum(null));
    }
}
