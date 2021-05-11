package com.ss.mar.jb;

public class StarDisplay {
    /*
     * Displays 3 different star formats
     */
    public static void main(String[] args) {
        System.out.println("1)");
        printStars(0,1);
        System.out.println("2)");
        printInverse(0,1);
        System.out.println("3)");
        printPyramid();
        System.out.println("4)");
        printPyramidInverted();
    }

    public static void printStars(int rowCount,int starAmount) {
    /*
    Displays a section of stars
    args: rowCount(int) starAmount(int)
     */
        while (rowCount < 4) {
            for (int star = 1 ; star <= starAmount; star++){
                System.out.print("*");
            }
            System.out.println("");
            starAmount++;
            rowCount++;

        }
        System.out.println(".........");
    }

    public static void printInverse(int rowCount,int starAmount) {
    /*
    Displays a section of stars Inverted
    args: rowCount(int) starAmount(int)
     */

        System.out.println(".........");

        while (rowCount < 4) {
            for (int star = 4 ; star >= starAmount; star--){
                System.out.print("*");
            }
            System.out.println("");
            starAmount++;
            rowCount++;

        }
    }

    public static void printPyramid(){
        /*
        Prints a Pyramid of stars
         */
        int rowCount = 0;
        int starAmount = 1;
        int spaces = 5;

        while (rowCount < 4)
        {
            for (int space = 1 ; space <= spaces ; space++){
                System.out.print(" ");

            }
            for (int star = 1 ; star <=starAmount; star ++){
                System.out.print("*");
            }
            System.out.println("");
            rowCount++;
            starAmount = starAmount + 2;
            spaces--;
        }
        System.out.println(" ..........");

    }
    public static void printPyramidInverted(){
        /*
        Prints an inverted pyramid of stars
         */
        int rowCount = 0;
        int starAmount = 1;
        int spaces = 2;

        System.out.println("  ..........");
        while (rowCount < 4)
        {
            for (int space = 5 ; space >= spaces ; space--){
                System.out.print(" ");

            }
            for (int star = 7 ; star >=starAmount; star--){
                System.out.print("*");
            }
            System.out.println("");
            rowCount++;
            starAmount = starAmount +2;
            spaces--;
        }


    }
}
