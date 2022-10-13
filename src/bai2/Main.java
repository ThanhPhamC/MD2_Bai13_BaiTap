package bai2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap chieu dai mang ");
        int lenght = Integer.parseInt(sc.nextLine());
        int[] arr = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("nhap phan tu thu" + (i + 1));
            arr[i] = Integer.parseInt(sc.nextLine());
        }
        Arrays.sort(arr);
        System.out.print(" mang la: ");
        for (Integer index : arr) {
            System.out.print(index + "\t");
        }
        binarySearch(arr, 3, 5, 5);
    }

    public static void binarySearch(int[] array, int left, int right, int key) {
            int mid = (left + right) / 2;
            if (array[mid] == key) {
                System.out.println("ton tai key trong mang.");
            } else if (array[mid] > key) {
                int[] newArr = new int[mid];
                for (int i = 0; i < mid; i++) {
                    newArr[i] = array[i];
                }
                binarySearch(newArr, left, right, key);
            } else {
                int[] newArr = new int[mid];
                for (int i = 0; i < mid; i++) {
                    newArr[i] = array[i + mid + 1];
                }
                binarySearch(newArr, left, right, key);
            }
        }
    }
