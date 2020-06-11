public class MethodOverloadingChallenge {

    public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
        if (feet >= 0 && (inches >= 0 && inches <= 12)) {
            double cm =  (feet * 12) * 2.54d;                    // 1 foot is 12 inches
            cm += inches * 2.54d;                                  // 1 inch is 2.54 cm
            return cm;
        } else {
            return -1;
        }
    }

    public static double calcFeetAndInchesToCentimeters (double inches) {
        if (inches >= 0) {
            double feet = (int) inches / 12;
            double remainingInches = inches % 12;
            return calcFeetAndInchesToCentimeters(feet, remainingInches);
        } else {
            return -1;
        }
    }
}
