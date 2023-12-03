package CodinGame.TheDescent;
import java.util.*;
import java.io.*;
import java.math.*;

/**
 * The while loop represents the game.
 * Each iteration represents a turn of the game
 * where you are given inputs (the heights of the mountains)
 * and where you have to print an output (the index of the mountain to fire on)
 * The inputs you are given are automatically updated according to your last actions.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        while (true) {
            int[] ints = new int[8];
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();
                ints[i] += mountainH;
            }
            int h = 0;
            int index = 0;
            for (int i = 0; i < ints.length; i++) {
                if (ints[i] > h) {
                    h = ints[i];
                    index = i;
                }
            }
            System.out.println(index);
        }
    }
}
