package com.company;

public class Main {

    public static void main(String[] args) {

        for (int i = 1; i < 6; i++) {
            for (int x = 0; x < i; x++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = 4; i >=0; i--){
            for(int x =  0; x < i; x++){
                System.out.print(" ");
            }
            for(int j = 5; j > i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

