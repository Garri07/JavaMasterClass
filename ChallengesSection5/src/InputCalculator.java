import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int count = 1;

        while(true){
            //System.out.println("Enter a number: ");
            boolean isInt = scanner.hasNextInt();

            if (isInt){
                int number = scanner.nextInt();
                sum += number;
                avg = Math.round((double)sum/ (double)count);
                count++;
            }else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}