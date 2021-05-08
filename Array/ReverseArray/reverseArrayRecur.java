package ReverseArray;
import java.io.*; 
import java.util.*;

public class reverseArrayRecur {
    static Scanner sc;

    reverseArrayRecur() {
        try {  
            sc = new Scanner(new FileReader("input.txt"));
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    void reverse(List<Integer> arr, int start, int end) {
        int temp;

        if(start >= end)
            return;

        temp = arr.get(start);
        arr.set(start, arr.get(end));
        arr.set(end, temp);
        reverse(arr, start + 1, end - 1);
    }

    public static void main(String[] args) { 
        reverseArrayRecur a = new reverseArrayRecur();
        List<Integer> arr = new ArrayList<Integer>();
        while(sc.hasNext()) {
            arr.add(sc.nextInt());
        }

        a.reverse(arr, 0, arr.size() - 1);
        System.out.print(arr);
    }
}

/*
Time Complexity: O(N)

Input set:
1 2 3 4 5 6
*/