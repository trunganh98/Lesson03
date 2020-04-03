package Buoi3;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        String inStr;
        int inStrLen;
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a String: ");
        inStr = in.next();
        inStrLen = inStr.length();

        System.out.print("The reverse is: ");
        for (int inChaIdx = inStrLen - 1; inChaIdx >= 0; --inChaIdx) {
            System.out.print(inStr.charAt(inChaIdx));
        }
        System.out.println();
        in.close();
    }
}
