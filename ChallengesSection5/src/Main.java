import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        char letter = 'x';
//
//        switch(letter) {
//            case 'A':
//                System.out.println("Character was A");
//                break;
//            case 'B':
//                System.out.println("Character was B");
//                break;
//            case 'C':
//                System.out.println("Character was C");
//                break;
//            case 'D':
//                System.out.println("Character was D");
//                break;
//            case 'E':
//                System.out.println("Character was E");
//                break;
//            default:
//                System.out.println("Character was not A, B, C, D, or E.");
//                break;
//        }

//        DayOfTheWeekChallenge.printDayOfTheWeek(0);
//        DayOfTheWeekChallenge.printDayOfTheWeek(1);
//        DayOfTheWeekChallenge.printDayOfTheWeek(2);
//        DayOfTheWeekChallenge.printDayOfTheWeek(6);
//        DayOfTheWeekChallenge.printDayOfTheWeek(7);

//        int count = 0;
//
//        for (int i = 24; i <= 105; i++ ) {
//            if (isPrime(i)) {
//                System.out.println(i + " is a prime number");
//                count++;
//                System.out.println("Count is " + count);
//                if (count == 3) {
//                    break;
//                }
//            }
//        }

//
//        int startNumber = 4;
//        int finish = 20;
//        int count = 0;
//        int sum = 0;
//
//        while (startNumber <= finish) {
//            if (!isEvenNumber(startNumber)) {
//                startNumber++;
//                continue;
//            }
//            System.out.println("Even number is " + startNumber);
//            sum += startNumber;
//            startNumber++;
//            count++;
//            if (count==5){
//                System.out.println("Sum of " + count + " even numbers is " + sum);
//                break;
//            }
//        }

//        System.out.println(sumDigits(125));
//        System.out.println(sumDigits(1));       //should print -1
//        System.out.println(sumDigits(11));      //should print 2
//        System.out.println(sumDigits(111));     //should print 3
//        System.out.println(sumDigits(1111));    //should print 4
//        System.out.println(sumDigits(11111));   //should print 5
//        System.out.println(sumDigits(111111));  //should print 6
//        System.out.println(sumDigits(5555));    //should print 20


        //Code Exercise
        //Last Digit Checker
//        System.out.println(LastDigitChecker.hasSameLastDigit(41, 91, 34)); // should return true
//        System.out.println(LastDigitChecker.hasSameLastDigit(41, 94, 34)); // should return true
//        System.out.println(LastDigitChecker.hasSameLastDigit(44, 911, 34)); // should return true
//        System.out.println(LastDigitChecker.hasSameLastDigit(415, 91, 34)); // should return false
//        System.out.println(LastDigitChecker.hasSameLastDigit(41, 9, 34)); // should return false
//        System.out.println("\n");
//        System.out.println(LastDigitChecker.isValid(55));   // should return true
//        System.out.println(LastDigitChecker.isValid(5));   // should return false
//        System.out.println(LastDigitChecker.isValid(5500));   // should return false
//        System.out.println(LastDigitChecker.isValid(78));   // should return true

        //Code Exercise
        //Number To Words
//        System.out.println(NumberToWords.getDigitCount(0));
//        System.out.println(NumberToWords.reverse(100));
//        NumberToWords.numberToWords(0);
//
//        NumberToWords.numberToWords(1010);                                  //should print One Zero One Zero
//        System.out.println("\n");
//        NumberToWords.numberToWords(1000);                                  //should print One Zero Zero Zero


//        System.out.println(LargestPrime.getLargestPrime(21));
//        System.out.println(LargestPrime.getLargestPrime(217));
//        System.out.println(LargestPrime.getLargestPrime(0));
//        System.out.println(LargestPrime.getLargestPrime(45));
//        System.out.println(LargestPrime.getLargestPrime(-1));


//        String str = "Alexandra";
//
//        System.out.println(str.substring(0, 5));
//        System.out.println(str.charAt(4));
//        System.out.println(str.substring(0, 3));
        //System.out.println(str[4]);
        //System.out.println(str.get(4));


        //Reading User Input Challenge
/*        Scanner scanner = new Scanner(System.in);

        int sum10 = 0;
        int counter = 1;

        while (counter <= 10){
            System.out.println("Enter number #" + counter + ": ");
            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                scanner.nextLine();
                sum10 += number;
                counter++;
            } else {
                System.out.println("Invalid number.");
                scanner.next(); //handles the invalid input, else the while loop would be stuck in a infinite loop as scanner.hsaNextInt() would always equals false.
            }
        }

        scanner.close();

        System.out.println("The sum of your 10 numbers is: " + sum10);*/

        //Maximum and Minimum Challenge

        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;

        System.out.println("Enter a number: ");
        if(scanner.hasNextInt()) { //checks that the very first entry is an int
            int firstNumber = scanner.nextInt();
            scanner.nextLine();
            min = firstNumber; //sets min at the very first entry if int
            max = firstNumber; //sets max at the very first entry if int

            while (true) {
                System.out.println("Enter a number: ");
                if (scanner.hasNextInt()) {
                    int number = scanner.nextInt();
                    scanner.nextLine();
                    if (number > max) {
                        max = number;
                    }
                    if (number < min) {
                        min = number;
                    }
                } else {
                    System.out.println("Max: " + max + "\nMin: " + min);
                    break;
                }
            }
        } else {
            System.out.println("No numbers entered.");
        }

        scanner.close();

    }

    public static int sumDigits(int number) {
        int digitSum = 0;
        if (number < 10) {
            return -1;
        }
        while (number > 0) {
            digitSum += number % 10;
            number = number / 10;
        }
        return digitSum;
    }

    public static boolean isEvenNumber(int number) {
        if (number % 2 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
