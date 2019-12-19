import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ivan Kyser Ibieta Osila on 07/12/2019
 */
public class TuitionFeeTest {

    TuitionFee tuitionFee = new TuitionFee();
    int expected, result, tuition, misc, units;


    @Test
    public void computeTuitionFee() {
        units = 22;
        tuition = 1500;
        expected = 33000;
        result = TuitionFee.computeTuitionFee(units, tuition);
        assertEquals(expected, result);
    }

    @Test
    public void getMiscellaneousFee() {
        misc = 15500;
        result = TuitionFee.getMiscellaneousFee(misc);
    }

    @Test
    public void computationTuitionFee() {
        tuition = 33000;
        misc = 15500;
        expected = 48500;
        result = TuitionFee.computationTuitionFee(tuition, misc);
        assertEquals(expected, result);
    }
}