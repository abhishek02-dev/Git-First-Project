package Array;

import java.util.Scanner;

public class Descending {
        public static void main(String[] args) {
            int n, max = -999999, min = 999999, temp;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }
            for (int i = 0; i < arr.length ; i++) {
                for (int j = 0; j < arr.length ; j++) {
                    if(arr[j]<arr[i]) {
                        temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }

            }

            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i]+" ");
            }
        }
    }


