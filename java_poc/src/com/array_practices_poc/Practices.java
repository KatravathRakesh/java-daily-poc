package com.array_practices_poc;

import java.util.Scanner;

public class Practices {

    static int slot(int n, int m, int[] a, int[] b) {
        int count = 0;
        int limit = Math.min(n, m);
        
        for (int i = 0; i < limit; i++) {
            // First condition: elements at same index differ by 1
            boolean cond1 = (a[i] == b[i] + 1 || a[i] == b[i] - 1);
            
            // Second condition: next element in 'a' exists and is >= current a[i] + 2
            boolean cond2 = (i + 1 < n) && (a[i + 1] >= a[i] + 2);
            
            if (cond1 && cond2) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        if (!s.hasNextInt()) return;
        int n = s.nextInt();
        int m = s.nextInt();
        
        int[] a = new int[n];
        int[] b = new int[m];
        
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = s.nextInt();
        }

        System.out.println("Result : "+slot(n, m, a, b));
        s.close();
    }
}