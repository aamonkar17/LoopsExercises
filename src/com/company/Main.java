//Ankit Amonkar
package com.company;

public class Main {

    public static void main(String[] args) {
        int a = addOdds(5);
        System.out.println(a);
        int b = addOdds(6);
        System.out.println(b);
        int c = addOdds(15);
        System.out.println(c);
        int d = howManyYears(111.2, 120);
        System.out.println(d);
        int e = howManyYears(111.2, 150);
        System.out.println(e);
        int f = sumDigits(17);
        System.out.println(f);
        int g = sumDigits(173);
        System.out.println(g);
        int h = sumDigits(1739);
        System.out.println(h);
        sillyNumbers();
        sillyNumbers2();
        dollarsAndStars();
    }

    public static int addOdds(int n) {
        int total = 0;
        for (int i = 1; i <= n; i = i + 2) {
            total = total + i;
        }
        return total;
    }
    public static int howManyYears(double startpop, double endpop){
        int t=0;
        while(startpop < endpop){
            startpop = startpop*1.0113;
            t++;
        }
        return t;
    }
    public static int sumDigits(int sum) {
        int total = 0;
        while (sum > 0)
        {
            total += sum % 10;
            sum /= 10;
        }
        return total;
    }
    public static void sillyNumbers(){
            for(int i=0; i < 3; i++) {
                for (int k = 0; k < 10; k++) {
                    for(int j=0; j<3; j++)
                    System.out.print(k);
                }
                System.out.println();
            }
    }
    public static void sillyNumbers2(){
        for(int i=0; i<4; i++){
            for (int k = 9; k >= 0; k--) {
                for(int j=0; j<k; j++)
                    System.out.print(k);
            }
            System.out.println();
        }
        }
    public static void dollarsAndStars(){
        for(int i=0; i<7; i++){
            for(int k=0; k<i; k++){
                System.out.print("**");
            }
            for(int j=7; j>i; j--){
                System.out.print("$");
            }
            for(int k=7; k>i; k--){
                System.out.print("**");
            }
            for(int j=7; j>i; j--){
                System.out.print("$");
            }
            for(int k=0; k<i; k++){
                System.out.print("**");
            }
            System.out.println();

        }
    }
}

/*Results:
        addOdds:
        9
        9
        64

        howManyYears:
        7
        27

        sumDigits:
        8
        11
        20

        sillyNumbers;
        000111222333444555666777888999
        000111222333444555666777888999
        000111222333444555666777888999

        sillyNumbers2;
        999999999888888887777777666666555554444333221
        999999999888888887777777666666555554444333221
        999999999888888887777777666666555554444333221
        999999999888888887777777666666555554444333221

        dollarsAndStars:
        $$$$$$$**************$$$$$$$
        **$$$$$$************$$$$$$**
        ****$$$$$**********$$$$$****
        ******$$$$********$$$$******
        ********$$$******$$$********
        **********$$****$$**********
        ************$**$************

*/