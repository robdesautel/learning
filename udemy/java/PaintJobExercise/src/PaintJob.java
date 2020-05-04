public class PaintJob {
    public static int getBucketCount(double width,
                                       double height,
                                       double areaPerBucket,
                                       int extraBuckets){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0){
            return -1;
        }

        double areaOfWall = width * height;
        double totalPaint = areaOfWall /areaPerBucket;
        double numberOfBucketsNeededForJob = totalPaint - extraBuckets;
        return (int) Math.ceil(numberOfBucketsNeededForJob);

    }

    public static int getBucketCount(double width,
                                     double height,
                                     double areaPerBucket){

        if(width <= 0 || height <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double areaOfWall = width * height;
        double totalPaint = areaOfWall / areaPerBucket;
        return (int) Math.ceil(totalPaint);

    }

    public static int getBucketCount(double area,
                                     double areaPerBucket){

        if(area <= 0 || areaPerBucket <= 0){
            return -1;
        }

        double numberOfBuckets = area / areaPerBucket;
        return (int) Math.ceil(numberOfBuckets);

    }


}
