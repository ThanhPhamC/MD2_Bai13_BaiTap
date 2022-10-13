package bai3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chuoi");
        String inputString = sc.nextLine();
        List<String> listarray = new ArrayList<>();
        String indexString = "";
        for (int i = 0; i < inputString.length(); i++) {
            if (indexString.length() == 0) {
                indexString += inputString.charAt(0);
            } else {
                if (indexString.charAt(indexString.length() - 1) < inputString.charAt(i)) {
                    indexString += inputString.charAt(i);
                } else {
                    listarray.add(indexString);
                    indexString = "";
                    indexString += inputString.charAt(i);
                }
            }
        }
        int max =listarray.get(0).length();
        for (String string : listarray) {
                if (max<string.length()){
                    max=string.length();
                }
        }
        for (String string : listarray) {
            if (string.length()==max){
                System.out.println(string);
            }
        }
    }
}
