package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("The sum of the digits in number 125 is "+ sumDigits(125) + "\n");
        System.out.println("The sum of the digits in number -125 is "+ sumDigits(-125)+ "\n");
        System.out.println("The sum of the digits in number 4 is "+ sumDigits(4)+"\n");
        System.out.println("The sum of the digits in number 32123 is "+ sumDigits(32123)+"\n");
    }

    public static int sumDigits(int num) {
        if (num >= 10 && num >= 0) {
            int sum = 0;
           while (num >= 1)
           {
               System.out.println(num +"..."+sum);
               System.out.println();
               sum+= (num%10);
               num = num/10;
           }
           return  sum;
        }

        return -1;
    }
}
