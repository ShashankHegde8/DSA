// Problem Statement: A password manager wants to create new passwords using two strings given by the user, then combined to create a harder-to- guess combination. Given two strings,interleave the characters of the strings to create a new string. Beginning with an empty string, alternately append a character from string a and from string b. If one of the strings is exhausted before the other, append the remaining letters from the other
// string all at once. The result is the new password.

// Example :
// If a = ‘hackerrank’ and b = ‘mountain’,
// The result is hmaocuknetrariannk.

import java.util.*;
public class Stringmerge {
    public static void merge(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String password = "";
        int i, j;
        for (i = 0, j = 0; i < str1.length() && j < str2.length(); i++, j++) {
            password = password + str1.charAt(i) + str2.charAt(j);
        }
        if (i < str1.length())
            password = password + str1.substring(i, str1.length());
        if (j < str2.length())
            password = password + str2.substring(j, str2.length());
        System.out.println(password);
    }
}