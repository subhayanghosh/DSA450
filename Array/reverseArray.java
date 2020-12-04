package Array;
import java.io.*; 
import java.util.*;

public class reverseArray {
    static Scanner sc;

    reverseArray() {
        try {  
            sc = new Scanner(new FileReader("input.txt"));
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    void solve() {
        int[] a = new int [5];
        for (int i = 0; i < a.length; i++)
            a[i] = sc.nextInt();

        int start = 0, end = a.length - 1;
        int t;

        while (start < end) {
            t = a[start];
            a[start] = a[end];
            a[end] = t;
            start++;
            end--;
        }

        for (int i = 0; i < a.length; i++)
            System.out.print(a[i] + " ");
    }

    public static void main(String[] args) { 
        new reverseArray().solve();
    }
}

/*
Time Complexity: O(N)

Input set:
1 2 3 4 5 6
*/