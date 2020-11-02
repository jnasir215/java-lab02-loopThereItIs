package com.returnready.loopthereitis;

public class TableUtilities {
    public static String getSmallMultiplicationTable() {
        String output = "";
        int rowSize = 5;
        int colSize = 5;

        for(int column = 1; column <= colSize; column++) {
            int result;

            for(int row = 1; row <= rowSize; row++) {
                result = row * column;
                output += " ";
                if (result < 10)
                    output += " ";
                output = output + result + " |";
            }
            output += "\n";
        }
        //System.out.println("%s", output);
        return output;
    }

    public static String getLargeMultiplicationTable() {
        String output = "";
        int rowSize = 10;
        int colSize = 10;

        for(int column = 1; column <= colSize; column++) {
            int result;

            for(int row = 1; row <= rowSize; row++) {
                result = row * column;
                if (result < 10)
                    output += "  ";
                if ((result >= 10) && (result < 100))
                    output += " ";
                if (result == 100)
                    output += "";
                output = output + result + " |";
            }
            output += "\n";
        }
        //System.out.println("%s", output);
        return output;
    }

    public static String getMultiplicationTable(int tableSize) {
        String output = "";
        int rowSize = 20;
        int colSize = 20;

        for(int column = 1; column <= colSize; column++) {
            int result;

            for(int row = 1; row <= rowSize; row++) {
                result = row * column;
                if (result < 10)
                    output += "  ";
                if ((result >= 10) && (result < 100))
                    output += " ";
                if (result >= 100)
                    output += "";
                output = output + result + " |";
            }
            output += "\n";
        }
        //System.out.println("%s", output);
        return output;
    }
}
