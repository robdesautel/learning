public class PaintJob {
    public static int getBucketCount(double width,
                                       double height,
                                       double areaPerBucket,
                                       int extraBuckets){

        if(width < 1 || height < 1 || areaPerBucket < 1 || extraBuckets < 0){
            return -1;
        }

        float areaOfWall = (float) width * (float) height;
        float totalPaint = areaOfWall /(float)  areaPerBucket;
        float numberOfBucketsNeededForJob = totalPaint - extraBuckets;
        return Math.round(numberOfBucketsNeededForJob);

    }
}
