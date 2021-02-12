package io.learning.old;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ChineseCopy  {

    public void play(String player1, String player2) {
        System.out.println("WINNER IS " + (Math.random() < 0.5 ? player1 : player2));
    }


}
