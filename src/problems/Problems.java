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

    static int n1 = 0, n2 = 1, n3 = 0;
    static String output = "";

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
        //        rvereseArray(b, 0, 5);
        //        reverseString();
        //        PalindroomeCheck();
        //        checkPrimebetweenRange();
        //        toggleString("dHaKa CoXBazAaR");
        //swapTwoNumbersWithout3rdVariable();
        //fibonacciSeries();
        output = n1 + " , " + n2;//printing 0 and 1 
        fibonacciSerieswithrecursion(10 - 2);//n-2 because 2 numbers are already printed   
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, (output));
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
        char a = input.charAt(0);

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

    public static String toggleString(String sentence) {
        String toggled = "";
        for (int i = 0; i < sentence.length(); i++) {

            char letter = sentence.charAt(i);

            if (Character.isUpperCase(sentence.charAt(i))) {
                letter = Character.toLowerCase(letter);
                toggled = toggled + letter;

            } else if (Character.isLowerCase(sentence.charAt(i))) {
                letter = Character.toUpperCase(letter);
                toggled = toggled + letter;
            }

        }
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, (toggled));
        return toggled;

    }

    public static void swapTwoNumbersWithout3rdVariable() {
        int x = 10;
        int y = 5;
        x = x + y;
        y = x - y;
        x = x - y;
        System.out.println("After swaping:"
                + " x = " + x + ", y = " + y);
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, "Before Swaping x=10,y=5 \n After swaping:"
                + " x = " + x + ", y = " + y);
    }

    public static void fibonacciSeries() {
        int n1 = 0, n2 = 1, n3, i, count = 10;
        String output = "";
        output = n1 + " , " + n2;//printing 0 and 1  

        for (i = 2; i < count; i++)//loop starts from 2 because 0 and 1 are already printed    
        {
            n3 = n1 + n2;
            output = output + " , " + n3;
            n1 = n2;
            n2 = n3;
        }
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog(f, (output));
    }

    static void fibonacciSerieswithrecursion(int count) {

        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            output = output + " , " + n3;
            fibonacciSerieswithrecursion(count - 1);
        }

    }

}
