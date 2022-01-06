import com.example.gui_basic.BiggestNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBiggestNumber {
    BiggestNumber biggestNumber = null ;

    @BeforeEach
    public void init(){
        biggestNumber = new BiggestNumber();

    }
    @Test
    public void tesztBiggestNumber(){
        assertEquals(10, biggestNumber.biggestOfThree(5,10,3));
        assertEquals(10, biggestNumber.biggestOfThree(10,5,3));
        assertEquals(10, biggestNumber.biggestOfThree(10,3,5));
        assertEquals(10, biggestNumber.biggestOfThree(5,3,10));
        assertEquals(10, biggestNumber.biggestOfThree(3,5,10));
        assertEquals(5, biggestNumber.biggestOfThree(5,5,5 ));
        assertEquals(10, biggestNumber.biggestOfThree(10,10,10 ));
        assertEquals(3, biggestNumber.biggestOfThree(3,3,3));

        /*abc 5-10-3
        bac 10-5-3
        bca 10-3-5
        acb 5-3-10
        cab 3-5-10
        aaa 5-5-5
        bbb 10-10-10
        ccc 3-3-3
        */
    }


}
