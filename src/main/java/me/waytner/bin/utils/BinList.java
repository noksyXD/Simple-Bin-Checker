package me.waytner.bin.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class BinList {
    public boolean binListIsExists() {
        return new File("binlist.txt").exists();
    }

    public ArrayList<String> getBinList() {
        ArrayList<String> bins = new ArrayList<>();

        try {
            FileInputStream fis = new FileInputStream("binlist.txt");
            Scanner sc = new Scanner(fis);
            while (sc.hasNextLine())
                bins.add(sc.nextLine());
            return bins;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

}
