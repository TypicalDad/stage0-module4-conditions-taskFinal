package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (dividend == 0 || divider == 0){
            System.out.println("division by zero");
        }
        else {
        int result  = dividend / divider;
        int checkOut = result * divider;
        if(checkOut == dividend){
            System.out.println("can be divided completely");
        }
        else if(checkOut != dividend){
            System.out.println("cannot be divided completely");
        }}}
    }
}
