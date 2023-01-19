package com.LineComparision;

public class TwoLineComparison {
    public static void main(String[] args) {

        System.out.println("Hey welcome in line comparison");
        int x1 = 5;
        int x2 = 8;
        int y1 = 4;
        int y2 = 8;
        int x12 = 4;
        int y12 = 3;
        int x22 = 5;
        int y22 = 6;
        // formula for calculating length of line
        float len1 = (float) Math.sqrt((x1 - x2) * (x1 - x2) + (y2 - y1) * (y2 - y1));
        float len2 = (float) Math.sqrt((x12 - x22) * (x12 - x22) + (y22 - y12) * (y22 - y12));
        System.out.println(len1);
        System.out.println(len2);
        //check the length of equal or not
        if (len1 == len2) {
            System.out.println("Both lines are Equal");
        }
        //comparison between lines

        else if (len1 > len2) {
            System.out.println("Line 1 is Greater than Line 2:" + len1);
        } else if (len1 < len2) {
            System.out.println("Line 1 is less than Line 1:" + len1);
        } else {


        }
    }
}