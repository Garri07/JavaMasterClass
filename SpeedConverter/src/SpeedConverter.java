public class SpeedConverter {

    public static long toMilesPerHour(double kilometersPerHour) {
        if (kilometersPerHour >= 0) {
            return Math.round(kilometersPerHour / 1.609d);
        }
        return -1;
    }

    public static void printConversion(double kilometerPerHour) {
        if (kilometerPerHour < 0) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometerPerHour + " km/h = " + toMilesPerHour(kilometerPerHour) + " mi/h");
        }
    }
}
