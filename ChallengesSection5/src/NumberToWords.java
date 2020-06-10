public class NumberToWords {

    public static void numberToWords(int number) {
        if (number < 0) {
            System.out.println("Invalid Value");
        }

        int countNumber = getDigitCount(number);
        int countReverse = getDigitCount(reverse(number));
        number = reverse(number);

        if (number==0){
            System.out.println("Zero");
        }

        while (number > 0) {
            switch (number % 10) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            number /= 10;
        }

        if (countNumber != countReverse) {
            for (int i = 1; i <= (countNumber - countReverse); i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse(int number) {
        //123 -> 321
        int reversed = 0;
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        return reversed;
    }

    public static int getDigitCount(int number) {
        int count = 0;

        if (number < 0) {
            return -1;
        }

        if (number == 0) {
            count++;
        }

        while (number > 0) {
            count++;
            number = number / 10;
        }

        return count;
    }


}
