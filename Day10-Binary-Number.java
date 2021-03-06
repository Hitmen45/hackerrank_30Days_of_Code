import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
 
public class Solution {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = Integer.toBinaryString(n);
        int maxZeros = 0;
        int consZero = 0;
        for(int i=0; i<binary.length(); i++) {
            char ele = binary.charAt(i);
            if(ele == '1') {
                consZero++;
                maxZeros = Math.max(maxZeros, consZero);
            }else {
                consZero = 0;
            }
        }
        System.out.println(maxZeros);
    }
    }
