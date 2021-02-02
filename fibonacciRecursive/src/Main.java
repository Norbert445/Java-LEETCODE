import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Main.finbonacciIterative(5));
    }

    public static int fibonacciRecursive(int num) { //2^n - time
        if(num < 2) {
            return num;
        }

        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);
    }

    public static int finbonacciIterative(int num) { //O(n) - time
        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(1);

        for(int i = 2; i <= num; i++) {
            list.add(list.get(i-1) + list.get(i-2));
        }

        return list.get(num);
    }
}
