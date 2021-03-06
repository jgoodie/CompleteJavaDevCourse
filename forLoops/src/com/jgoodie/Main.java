package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        //System.out.println(calculateInterest(1000.00, 1.5));
        //for(int i=0; i<=10; i++ ){
         //   System.out.println(calculateInterest(1000.00, 1.0+i/10.0));
        //}
        int primeCount = 0;
        for (int i=50; i<=100; i++){
            if (primeCount == 3){
                break;
            }
            if(isPrime(i)){
                System.out.println("prime: " + i);
                primeCount++;
            }
        }
    }
    public static double calculateInterest(double amount, double interestRate){
        return(amount* (interestRate/100));
    }
    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for (int i=2; i<=n/2; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }

}
