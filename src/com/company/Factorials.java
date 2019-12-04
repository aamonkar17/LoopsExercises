package com.company;

public class Factorials {

    public static void main(String[] args){
        long a;
        for (int i = 1; i <= 20; i++) {
            a = calcFactorial(i);
            System.out.println(a);
            }
        System.out.printf("e is %2.3f \n", calcEX(3));
        double c = calcE();
        System.out.println(c);
    }

    public static long calcFactorial(int x) {
        long factorial = 1;
        for (int i = x; i > 0; i--) {
            factorial *= i;
        }
        return factorial;
    }

    public static double calcE(){
        double e = 1;
        double olde = 0;
        int b = 1;
        while(e-olde > .001){
            olde = e;
            e += 1.0/calcFactorial(b);
            b++;
        }
        return e;
    }
    public static double calcEX(int x){
        double e = 1;
        double olde = 0;
        int b = 1;
        while(e-olde > .001){
            olde = e;
            e += 1.0*Math.pow(x,b)/calcFactorial(b);
            b++;
        }
        return e;
    }
}

/*
Results:
    Factorials from 1-20:
    1
    2
    6
    24
    120
    720
    5040
    40320
    362880
    3628800
    39916800
    479001600
    6227020800
    87178291200
    1307674368000
    20922789888000
    355687428096000
    6402373705728000
    121645100408832000
    2432902008176640000

    calcE:
    2.7182539682539684

 */
