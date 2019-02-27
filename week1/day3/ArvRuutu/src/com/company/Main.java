package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner reader = new Scanner(System.in);

        System.out.print("Sisesta number: ");
        double number = Double.parseDouble(reader.nextLine());

        Arv num = new Arv();

        double tulemus = num.tostaArvRuutu(number);

        System.out.println(tulemus);



    }
}
