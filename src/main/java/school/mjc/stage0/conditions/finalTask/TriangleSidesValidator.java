package school.mjc.stage0.conditions.finalTask;

public class TriangleSidesValidator {
    public void validate(double firstSide, double secondSide, double thirdSide) {
        int ok = 0;
        if(thirdSide <= firstSide + secondSide){
            ok += 1;
        }
        if(secondSide <= firstSide + thirdSide){
            ok += 1;
        }
        if( firstSide <= secondSide + thirdSide){
            ok += 1;
        }
        if(ok == 3){
            System.out.println("this is a valid triangle");
        }
        else {System.out.println("it's not a triangle");}
    }
}
