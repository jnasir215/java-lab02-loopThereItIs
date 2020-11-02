package com.returnready.loopthereitis;

public class TriangleUtilities {

    public static String getTriangle(int numberOfRows) {
        int noRows = numberOfRows;
        String triangle = "";

        for(int row = 1; row < noRows; row++)
        {
            for (int j = 0; j < row; j++)
                triangle = triangle + "*";
            triangle = triangle + "\n";
        }
        return triangle;
    }

    public static String getRow(int numberOfStars) {
        int width = numberOfStars;
        String rowOutput = "";

        for(int i = 0; i < width; i++)
            rowOutput = rowOutput + "*";
        return rowOutput;
    }

    public static String getSmallTriangle() {
        int noRows = 5;
        String smallTri = "";

        for(int row = 1; row < noRows; row++)
        {
            for (int j = 0; j < row; j++)
                smallTri = smallTri + "*";
            smallTri = smallTri + "\n";
        }
        return smallTri;
    }

    public static String getLargeTriangle() {
        int noRows = 10;
        String largeTri = "";

        for(int row = 1; row < noRows; row++)
        {
            for (int j = 0; j < row; j++)
                largeTri = largeTri + "*";
            largeTri = largeTri + "\n";
        }
        return largeTri;
    }
}
