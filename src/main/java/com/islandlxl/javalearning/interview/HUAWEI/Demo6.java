package com.islandlxl.javalearning.interview.HUAWEI;
import java.util.Scanner;

public class Demo6 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        long number = 0;

        while(scanner.hasNextLong())
        {
            number = scanner.nextLong();
            isPrimerFactors(number);
        }

    }

    private static void isPrimerFactors(long num)
    {
        long number = num;
        while(number != 1)
        {
            for(int i = 2; i <= number ;i++)
            {
                if(number % i == 0)
                {
                    number /= i;
                    System.out.print(i + " ");
                    break;
                }
            }
        }
    }

}
