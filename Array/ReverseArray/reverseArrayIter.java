package ReverseArray;
import java.io.*; 
import java.util.*;

/*
Input => 1 2 3 4 5 6
Output => 6 5 4 3 2 1
*/

public class reverseArrayIter {
    static Scanner sc;

    reverseArrayIter() {
        try {  
            sc = new Scanner(new FileReader("input.txt"));
        } catch(Exception e) {
            System.out.println(e);
        }
    }
    
    void solve() {
        ArrayList<Integer> arr = new ArrayList<>();
        while(sc.hasNext()) {
            arr.add(sc.nextInt());
        }

        int start = 0, end = arr.size() - 1;
        int t;

        while (start < end) {
            t = arr.get(start);
            arr.set(start, arr.get(end));
            arr.set(end, t);
            start++;
            end--;
        }

        System.out.print(arr);
    }

    public static void main(String[] args) { 
        new reverseArrayIter().solve();
    }
}

// Time Complexity: O(N)