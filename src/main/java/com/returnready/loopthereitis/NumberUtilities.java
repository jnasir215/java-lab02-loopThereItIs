package com.returnready.loopthereitis;


public class NumberUtilities {
    public static String getEvenNumbers(int start, int stop) {
        String output = "";
        int beg;
        int end = stop;

        for(beg = start; beg < end; beg = beg+2) {
            output = output + beg;
        }
        return output;
    }


    public static String getOddNumbers(int start, int stop) {
        String output = "";
        int beg = start;
        int end = stop;

        for(beg = beg+1; beg < end; beg = beg+2) {
            output = output + beg;
        }
        return output;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        int end = stop;
        int incr = step;
        String result = "";

        for(int beg = start; beg < end; beg += incr)
            result = result + (beg*beg);

        return result;
    }

    public static String getRange(int stop) {
        String output = "";
        int counter;
        int end = stop;

        for(counter = 0; counter < end; counter++) {
            output = output + counter;
        }
        return output;
    }

    public static String getRange(int start, int stop) {
        String output = "";
        int beg;
        int end = stop;

        for(beg = start; beg < end; beg++) {
            output = output + beg;
        }
        return output;
    }


    public static String getRange(int start, int stop, int step) {
        String output = "";
        int beg;
        int end = stop;
        int incr = step;

        for(beg = start; beg < end; beg = beg + incr) {
            output = output + beg;
        }
        return output;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        int end = stop;
        int incr = step;
        int square = exponent;
        int convDouble;
        String result = "";

        for (int beg = start; beg < end; beg += incr)
            result = result + (int)Math.pow(beg,square);

        return result;
    }
}