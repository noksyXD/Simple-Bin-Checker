package me.waytner.bin;

public class Main {

    public static void main(String[] args) {
        ListLoader listLoader = new ListLoader();
        listLoader.loadList();
        Checker checker = new Checker(listLoader.bins);
        checker.startChecking();
    }

}
