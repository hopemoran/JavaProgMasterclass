public class PaintJob {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            System.out.println("Invalid input");
            return -1;
        }
        else {
            int storeBuckets = (int) Math.ceil(((width * height) / areaPerBucket) - extraBuckets);
            System.out.println(storeBuckets);
            return storeBuckets;
        }

    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {

        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            System.out.println("Invalid input");
            return -1;
        }
        else {
            int storeBuckets = (int) Math.ceil((width * height) / areaPerBucket);
            System.out.println(storeBuckets);
            return storeBuckets;
        }

    }

    public static int getBucketCount(double area, double areaPerBucket) {

        if (area <= 0 || areaPerBucket <= 0) {
            System.out.println("Invalid input");
            return -1;
        }
        else {
            int storeBuckets = (int) Math.ceil(area / areaPerBucket);
            System.out.println(storeBuckets);
            return storeBuckets;
        }

    }

}
