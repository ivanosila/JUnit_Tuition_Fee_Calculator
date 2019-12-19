/**
 * Created by Ivan Kyser Ibieta Osila on 07/12/2019
 */
public class TuitionFee {

    public static int computeTuitionFee(int units, int fee){
        int result = units * fee;
        System.out.println("Tuition: " + result);
        return result;
    }
    public static int getMiscellaneousFee(int misc){
        int  miscellaneous = misc;
        System.out.println("Miscellaneous: " + miscellaneous);
        return miscellaneous;
    }
    public static int computationTuitionFee(int tuition, int misc){
        int finalfee = tuition + misc;
        System.out.println("Final Computation: " + finalfee);
        return finalfee;
    }

}
