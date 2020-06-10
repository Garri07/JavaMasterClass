public class DiagonalStar {
    public static void printSquareStar(int number) {

        String stars = "";

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {

            for (int row = 1; row <= number; row++) {
                stars = stars + "\n";
                for (int column = 1; column <= number; column++) {
                    if (row == 1 || row == number || column == 1 || column == number
                            || row == column || column == number - row + 1) {
                        stars = stars + "*";
                    } else {
                        stars = stars + " ";
                    }
                }
            }
            System.out.println(stars);
        }
    }
}

