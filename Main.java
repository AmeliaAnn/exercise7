package exercise7;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();
        
         if (number == Modifier.X || number == Modifier.Y || number == Modifier.Z)
             System.out.print("Данное значение имеется в константах");
        else
             System.out.print("Такой константы нет!" );
         }

    }
