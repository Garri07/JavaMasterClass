public class PaintJob {
    public static int getBucketCount (double width, double height, double areaPerBucket, int extraBucket){
        double numberOfBuckets = 0;
        double area = width * height;

        if (width <= 0|| height <= 0|| areaPerBucket <= 0 || extraBucket < 0){
            return -1;
        } else if (extraBucket == 0) {
            numberOfBuckets = Math.ceil(area / areaPerBucket);
        }else if (extraBucket >= 1){
            double existingAreaFromExtraBuckets = areaPerBucket * extraBucket;
            double remainingArea = area - existingAreaFromExtraBuckets;
            numberOfBuckets = Math.ceil(remainingArea / areaPerBucket);
        }
        return (int) numberOfBuckets;
    }


    public static int getBucketCount(double width, double height, double areaPerBucket){
        return getBucketCount(width, height, areaPerBucket, 0);
    }

    public static int getBucketCount (double wallArea, double areaPerBucket){

        return getBucketCount(wallArea, 1, areaPerBucket, 0);
    }
}