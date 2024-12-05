package main;

import automato.AutomatoPilha;

public class Main {
    public static void main(String[] args) {

        AutomatoPilha ap = new AutomatoPilha();
        System.out.println(ap.pertenceLinguagem("0011"));
        System.out.println(ap.pertenceLinguagem("0000011111"));
        System.out.println(ap.pertenceLinguagem("0011"));
        System.out.println(ap.pertenceLinguagem(" "));

    }
}