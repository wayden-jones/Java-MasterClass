package com.company;

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(4.14, 2));


    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        if ( width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0)
            return -1;
        double totalArea = width * height;
        System.out.println(totalArea);
        double coveredArea = extraBuckets * areaPerBucket;
        System.out.println(coveredArea);
        double remainingArea = totalArea - coveredArea;
        System.out.println(remainingArea);
        return (int)Math.ceil(remainingArea/areaPerBucket);
    }
    public static int getBucketCount(double width, double height, double areaPerBucket){
        if ( width <= 0 || height <= 0 || areaPerBucket <= 0)
            return -1;
        double totalArea = width * height;
        System.out.println(totalArea);
        return (int)Math.ceil(totalArea/areaPerBucket);
    }
    public static int getBucketCount(double area, double areaPerBucket){
        if (area <= 0 || areaPerBucket <= 0)
            return -1;
        System.out.println(area);
        return (int)Math.ceil(area/areaPerBucket);
    }

}
