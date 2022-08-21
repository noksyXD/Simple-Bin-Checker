package me.waytner.bin;

import java.util.ArrayList;
import java.util.Scanner;

public class Checker {
    private ArrayList<String> bins;
    public Checker(ArrayList<String> bins) {
        this.bins = bins;
    }

    public void startChecking() {
        while (true) {
            System.out.println("Enter your card number:");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            while (line != null) {
                for (int i = 0; i < bins.size(); i++) {
                    if (line.contains(bins.get(i).split("\\,")[0])) {
                        System.out.println("Your card have that bin: " + bins.get(i));
                        line = null;
                        break;
                    } else if (i == bins.size()-1) {
                        System.out.println("Cannot find bin in binlist.");
                        line = null;
                        break;
                    }
                }
            }

        }
    }

}
