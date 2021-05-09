package MaxMin;
import java.util.*;
import java.io.*;

/*
Input => 1 2 3 4 5 6
Output => Max = 6 || Min = 1

Input => 1
Output => Max = 1 || Min = 1

Input => NULL
Output => Max = 0 || Min = 0
*/

public class maxMin {
    static Scanner sc;
    maxMin() {
        try {  
            sc = new Scanner(new FileReader("input.txt"));
        } catch(Exception e) {
            System.out.println(e);
        }
    }

    static class Pair {
        int max = 0;
        int min = 0;
    }

    static Pair getMaxMin(List<Integer> arr) {
        Pair minmax = new Pair();
        if (arr.size() == 0) 
            return minmax;

        else if (arr.size() == 1) {
            minmax.max = arr.get(0);
            minmax.min = arr.get(0);
            return minmax;
        }

        else {
            if (arr.get(0) > arr.get(1)) {
                minmax.max = arr.get(0);
                minmax.min = arr.get(1);
            } else {
                minmax.max = arr.get(1);
                minmax.min = arr.get(0);;
            }
            for (int i = 2; i < arr.size(); i++) {
                if (arr.get(i) > minmax.max)
                    minmax.max = arr.get(i);
                else if (arr.get(i) < minmax.min)
                    minmax.min = arr.get(i);
            }
            return minmax;
        }
    }

    public static void main(String args[]) {
        maxMin obj = new maxMin();
        List<Integer> arr = new ArrayList<Integer>();
        while(sc.hasNext()) {
            arr.add(sc.nextInt());
        }

        Pair minmax = getMaxMin(arr);
        System.out.println("Max = " + minmax.max);
        System.out.println("Min = " + minmax.min);
    }
}

/*
Time Complexity: O(N)

Total number of comparisons:
Worst case (when the input set is sorted in descending order) =>  1 + 2(n-2)
Best case (when the input set is sorted in ascending order) => 1 + n – 2
*/
