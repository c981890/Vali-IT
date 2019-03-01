package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Hello, World!");

        if ((false && true) || true) {
            System.out.println("Tõene");
        } else {
            System.out.println("Väär");
        }

        Reede.koju();

        Pyhapaev paev = new Pyhapaev();
        paev.maga();


    }
}
