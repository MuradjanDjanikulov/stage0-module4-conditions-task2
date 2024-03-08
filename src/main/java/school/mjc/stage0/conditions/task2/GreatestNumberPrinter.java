package school.mjc.stage0.conditions.task2;

public class GreatestNumberPrinter {
    public void printGreatest(int first, int second) {
        boolean x = first>=second;
        if ( x ){
            System.out.println(first);}
        else {
            System.out.println(second);}
    }
}