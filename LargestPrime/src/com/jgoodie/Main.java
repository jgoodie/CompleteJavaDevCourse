package com.jgoodie;

public class Main {

    public static void main(String[] args) {
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(45));
    }
    public static int getLargestPrime(int number){
        int largestPrime = 0;
        if (number <=1){
            return -1;
        }
        int i;
        for (i = 2; i <= number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return i;
    }














//    public static int getLargestPrime(int number){
//        if (number <=1){
//            return -1;
//        }
//        int largestPrime = 0;
//        for (int i = 1; i<=number; i++){
//            if(number%i==0){
//                for(int j=2; j<i; j++){
//                    if (i%j == 0){
//                        continue;
//                    }
//                    else if(i!=number) {
//                        largestPrime = i;
//                        //System.out.println(i);
//                    }
//                }
//            }
//        }
//        return largestPrime;
//    }
}
