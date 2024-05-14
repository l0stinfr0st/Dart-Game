package Project;

import java.util.Scanner;

public class dartGameProject {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("DART GAME!");
        System.out.print("Enter the number of darts to be thrown: ");
        int darts = input.nextInt();

        int count = 1;
        int countA = 0;
        int countB = 0;
        int countC = 0;
        int countD = 0;
        int countE = 0;
        int countF = 0;
        int countG = 0;
        int countU = 0;

        while (count <= darts) {

            double x = (int) ((Math.random() * 102) - 51);
            double y = (int) ((Math.random() * 102) - 51);
            x /= 10;
            y /= 10;

            if (x > 0 && y > 0) {
                if (x + y < 5) {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: A");
                    countA++;
                    count++;
                    continue;
                } else if (x + y > 5) {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: B");
                    countB++;
                    count++;
                    continue;
                } else {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: Undecided");
                    countU++;
                    count++;
                    continue;
                }
            }

            if (x < 0 && y > 0) {
                if ((Math.sqrt((Math.pow(x + 3, 2) + Math.pow(y - 3, 2)))) < 1) {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: C");
                    countC++;
                    count++;
                    continue;
                } else if ((Math.sqrt((Math.pow(x + 3, 2) + Math.pow(y - 3, 2)))) > 1) {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: G");
                    countG++;
                    count++;
                    continue;
                } else {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: Undecided");
                    countU++;
                    count++;
                    continue;

                }
            }

            if (x < 0 && y < 0) {
                if (x < y) {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: D");
                    countD++;
                    count++;
                    continue;
                } else if (x > y) {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: E");
                    countE++;
                    count++;
                    continue;
                } else {
                    System.out.println("Dart " + count + ":");
                    System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                    System.out.println("Region: Undecided");
                    countU++;
                    count++;
                    continue;
                }

            }

            if (x > 0.0 && y < 0.0) { //4th Quadrant (F)
                System.out.println("Dart " + count + ":");
                System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                System.out.println("Region: F");
                countF++;
                count++;
                continue;
            }
            if (x == 0 || y == 0) {
                System.out.println("Dart " + count + ":");
                System.out.println("Coordinates: " + "(" + x + "," + y + ")");
                System.out.println("Region: Undecided");
                countU++;
                count++;
            }
        }
        System.out.println("----------------------------------------");
        System.out.println("Region Statistics:");
        System.out.println("A: " + countA + " darts (" + ((countA * 100.0) / darts) + "%)");
        System.out.println("B: " + countB + " darts (" + ((countB * 100.0) / darts) + "%)");
        System.out.println("C: " + countC + "  darts (" + ((countC * 100.0) / darts) + "%)");
        System.out.println("D: " + countD + " darts (" + ((countD * 100.0) / darts) + "%)");
        System.out.println("E: " + countE + " darts (" + ((countE * 100.0) / darts) + "%)");
        System.out.println("F: " + countF + " darts (" + ((countF * 100.0) / darts) + "%)");
        System.out.println("G: " + countG + " darts (" + ((countG * 100.0) / darts) + "%)");
        System.out.println("Undecided: " + countU + " darts (" + ((countU * 100.0) / darts) + "%)");
        System.out.println("----------------------------------------");
    }
}
