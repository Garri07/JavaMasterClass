public class Main {

    public static void main(String[] args){

        double valueOne = 20.00d;                       //step 1
        double valueTwo = 80.00d;                       //step 2
        double result = (valueOne + valueTwo) * 100.00d; //step 3
        System.out.println("The total is " + result);
        double rest = result % 40.00d;                   //step 4
        System.out.println("The remainder is " + rest);
        boolean isZero = (rest == 0) ? true : false;    //step 5 Ternary operator
        System.out.println("Boolean is " + isZero);     //step 6
        if(!isZero)                                     //step 7
            System.out.println("Got some remainder");



    }
}
