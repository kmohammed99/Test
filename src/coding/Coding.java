/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coding;

import java.util.Scanner;

/**
 * @author k.mohamed
 */
public class Coding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] number = sc.nextLine().split(" ");
        float x = Float.parseFloat(number[0]);
        String s = number[1];
        float y = Float.parseFloat(number[2]);
        String right = "Right";
        String wrong = "Wrong";

        switch (s) {
            case "<":
                 String res =  (x < y) ? right : wrong;
                    System.out.println(res);
                break;
            case ">":
                if (x > y) {
                    System.out.println("Right");
                } else {
                    System.out.println("Wrong");
                }
                break;
            case "=":
                if (x == y) {
                    System.out.println("Right");
                } else {
                    System.out.println("Wrong");
                }
                break;
            default:
                throw new AssertionError();
        }
    }
}
