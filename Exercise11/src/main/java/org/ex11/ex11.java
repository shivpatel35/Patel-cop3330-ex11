package org.ex11;

import java.text.DecimalFormat;
import java.util.Scanner;

//round up fraction of cent

public class ex11 {
    public static void main(String[] args) {

        Scanner euro_amt = new Scanner(System.in);
        Scanner ex_rate = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("###.##");

        System.out.print("How many euros are you exchanging? ");
        int euros = euro_amt.nextInt();
        System.out.print("What is the exchange rate? ");
        double exchange = ex_rate.nextDouble();

        double amt_in_dollars = exchange * euros;

        System.out.print(+ euros + " euros at an exchange rate of " + exchange + " is " + df.format(amt_in_dollars) + " U.S. dollars.");


    }
}
