import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.fibonacciMemoized(10));
    }

    public static int fibonacciRecursive(int num) { //2^n - time
        if (num < 2) {
            return num;
        }

        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }

    public static Map<Integer, Integer> cache = new HashMap<>();

    public static int fibonacciMemoized(int n) {
        if (cache.containsKey(n)) {
            return cache.get(n);
        } else if (n < 2) {
            return n;
        } else {
            cache.put(n, fibonacciMemoized(n - 1) + fibonacciMemoized(n - 2));
            return cache.get(n);
        }

    }


    public static int fibonacciIterative(int num) { //O(n) - time
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for (int i = 2; i <= num; i++) {
            list.add(list.get(i - 1) + list.get(i - 2));
        }

        return list.get(num);
    }
}
