package bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String inputstring = sc.nextLine();
        String output = "";
        for (int i = 0; i < inputstring.length(); i++) {
            if (output.length() == 0) {
                output += inputstring.charAt(i);
            } else {
                if (output.charAt(output.length() - 1) < inputstring.charAt(i)) {
                    output += inputstring.charAt(i);
                }
            }
        }
        System.out.println(output);


    }
}