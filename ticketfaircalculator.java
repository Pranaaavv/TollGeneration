package packA;

public interface ticketfaircalculator {
    public static double calculate(int KMS, String type){
        double fare;
        if(type=="Inter")
        {

            fare=KMS*12.50;
        }
        else{
            fare=KMS*10.50;
        }
        return fare;

    }
}
