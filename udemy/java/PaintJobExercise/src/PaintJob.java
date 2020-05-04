public class PaintJob {
    public static int getBucketCount(double width,
                                       double height,
                                       double areaPerBucket,
                                       int extraBuckets){

        if(width < 1 || height < 1 || areaPerBucket < 1 || extraBuckets < 0){
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

        if(width < 1 || height < 1 || areaPerBucket < 1){
            return -1;
        }

        double areaOfWall = width * height;
        double totalPaint = areaOfWall / areaPerBucket;
        return (int) Math.ceil(totalPaint);

    }

}
