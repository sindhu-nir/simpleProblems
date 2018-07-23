/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author root
 */
public class Problems {
 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

//        sortingAsc();
//        sortingDsc();
//        mergeArray();
        int a[] = {2, 5, 3, 4, 6, 1};
        String b[] = {"b", "f", "a", "y", "z", "q"};
//        sortingArrayWithoutBuiltFuction(a);
        rvereseArray(b, 0, 5);
        reverseString();
        PalindroomeCheck();
        checkPrimebetweenRange() ;
        System.exit(0);
    }

    public static void sortingAsc() {
        int a[] = {54, 8, 79, 22, 1, 6};
        Arrays.sort(a);
        System.out.print(a);
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, Arrays.toString(a));

    }

    public static void sortingDsc() {
        int a[] = {54, 8, 79, 22, 1, 6};
        String b[] = {"d", "a", "y", "g"};
        Arrays.sort(b);
        System.out.print(a);
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, Arrays.toString(b));
    }

    private static void sortingArrayWithoutBuiltFuction(int[] a) {
        System.out.println("Hello, World!" + a.length);
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println("array is" + a[i]);

        }

        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, Arrays.toString(a));
    }

    public static void mergeArray() {

        int[] a = {1, 2, 3, 4};
        int[] b = {4, 16, 1, 2, 3, 22};
        int[] c = new int[a.length + b.length];
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, Arrays.toString(c));

    }

    public static void rvereseArray(int arr[], int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, Arrays.toString(arr));
    }

    public static void rvereseArray(String arr[], int start, int end) {
        while (start < end) {
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, Arrays.toString(arr));
    }

    public static void reverseString() {
        String input = "GeeksForGeeks";

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
        char[] n = new char[try1.length];
        int count = 0;
        for (int i = try1.length - 1; i >= 0; i--) {
            n[count++] = try1[i];

        }

        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, Arrays.toString(n));

    }

    public static void PalindroomeCheck() {
        String input = "radar";
        String rev = "";

        // convert String to character array
        // by using toCharArray
        char[] try1 = input.toCharArray();
        char[] n = new char[try1.length];
        int count = 0;
        for (int i = try1.length - 1; i >= 0; i--) {
            //  n[count++] = try1[i];
            rev = rev + try1[i];

        }
        if (input.equals(rev)) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, (rev) + " is a Plaindrome");
        } else {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, Arrays.toString(n) + " is not a Plaindrome");
        }

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void checkPrimebetweenRange() {

        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number : ");
        int start = s.nextInt();
        System.out.print("Enter the second number : ");
        int end = s.nextInt();
        System.out.println("List of prime numbers between " + start + " and " + end);
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
