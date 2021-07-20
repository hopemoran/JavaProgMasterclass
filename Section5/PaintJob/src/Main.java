public class Main {

    public static void main(String[] args) {

        //first getBucketCount() tests
        PaintJob.getBucketCount(-3.4, 2.1, 1.5, 2);
        PaintJob.getBucketCount(3.4, 2.1, 1.5, 2);
        PaintJob.getBucketCount(2.75, 3.25, 2.5, 1);

        //second getBucketCount() tests
        PaintJob.getBucketCount(-3.4, 2.1, 1.5);
        PaintJob.getBucketCount(3.4, 2.1, 1.5);
        PaintJob.getBucketCount(7.25, 4.3, 2.35);

        //third getBucketCount() tests
        PaintJob.getBucketCount(3.4, 1.5);
        PaintJob.getBucketCount(6.26, 2.2);
        PaintJob.getBucketCount(3.26, 0.75);
    }

}
