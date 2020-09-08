package Game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayArrays {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        CreateArrays myArray = new CreateArrays();
        int sX, sY;
        boolean bt, ca;
        String fr, placeHolder;
        String[] frArray;

        try {
            System.out.println("Please enter horizontal length... ");
            sX = keyboard.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Not an integer, defaulting to 1.");
            sX = 1;
            keyboard.next();
        }
        frArray = new String[sX];

        try {
            System.out.println("Please enter vertical length... ");
            sY = keyboard.nextInt();
        } catch (InputMismatchException ime) {
            System.out.println("Not an integer, defaulting to 1.");
            sY = 1;
            keyboard.next();
        }

        System.out.println("Would you like brackets on either side? ");
        keyboard.nextLine();
        placeHolder = keyboard.next();
        placeHolder = placeHolder.toLowerCase();
        if(placeHolder.equals("yes")) {
            bt = true;
        }
        else {
            bt = false;
        }

        System.out.println("Would you like commas separating the values? ");
        keyboard.nextLine();
        placeHolder = keyboard.next();
        placeHolder = placeHolder.toLowerCase();
        if(placeHolder.equals("yes")) {
            ca = true;
        }
        else {
            ca = false;
        }

        System.out.println("Would you like unique values for each column? ");
        keyboard.nextLine();
        placeHolder = keyboard.next();
        placeHolder = placeHolder.toLowerCase();
        if(placeHolder.equals("yes")) {
            for(int a = 0; a < sX; a++) {
                System.out.println("Enter a value for x value " + (a+1) + " .");
                if(a == 0)
                    keyboard.nextLine();
                frArray[a] = keyboard.nextLine();
            }

            System.out.println();

            myArray = new CreateArrays(sX,sY,bt,ca,frArray);
        }
        else {
            System.out.println("What would you like all the matrix values to be? ");
            keyboard.nextLine();
            fr = keyboard.nextLine();

            System.out.println();

            myArray = new CreateArrays(sX, sY, bt, ca, fr);
        }
        myArray.buildArray();
    }
}
