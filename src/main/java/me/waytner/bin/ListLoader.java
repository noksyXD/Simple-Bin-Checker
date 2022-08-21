package me.waytner.bin;

import me.waytner.bin.utils.BinList;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class ListLoader {
    public ArrayList<String> bins;
    public void loadList() {
        BinList binList = new BinList();
        if (binList.binListIsExists()) {
            bins = binList.getBinList();
        }
        else {
            try {
                System.out.println("Can't find binlist.txt in " + new File(".").getCanonicalPath());
                System.exit(0);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Bin list read successfully.");
        System.out.println("Total Lines: " + bins.size());
    }

}
