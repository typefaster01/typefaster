package com.example.typefaster;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;
import com.example.typefaster.GamePlay;

public class Leaderboard {

    ArrayList<Long> leaderboardWaktu = new ArrayList<Long>();
    ArrayList<String> leaderboardNama = new ArrayList<String>();
    String temp1 = "";
    long temp = 0;
    int counter = 0;
        for (int i = 0; i < counter; i++) {
        for (int j = i + 1; j < counter; j++) {
            if(leaderboardWaktu.get(j) > leaderboardWaktu.get(i)){
                temp = leaderboardWaktu.get(i);
                leaderboardWaktu.set(i, leaderboardWaktu.get(j));
                leaderboardWaktu.set(j, temp);
                temp1 = leaderboardNama.get(i);
                leaderboardNama.set(i, leaderboardNama.get(j));
                leaderboardNama.set(j, temp1);
            }
        }
    }
        for (int i = 0; i <= counter - 1; i++)
    {
        if(i == 5)
            break;
        System.out.print(i + 1 + ". ");
        System.out.print(leaderboardNama.get(i) + " ");
        System.out.println(leaderboardWaktu.get(i) + " WPM");
        System.out.println("");
    }
}
