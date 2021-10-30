package exercise3;

import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 2;
        boolean a = false;
        while(i < num/2){
          if(num%i != 0)
          {
            a = true;
            i ++;
          }
          else {
            System.out.println("Prime Number: " + a);
            i = num/2;
          }
        }
        if(a == true){
          System.out.println("Prime number: " + a);
        }

        
    }

}