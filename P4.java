import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class P4 {
    static boolean isPrime(int n) {

        for (int i = 2; i < n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;

    }

    static int nearestPrimeNumber(int n) {
        if (isPrime(n))
            return n;
        int left = 0, right = 0;
        for (int i = n - 1; i > 1; i--) {
            if (isPrime(i)) {
                left = i;
                break;
            }
        }
        for (int i = n + 1; i < n + 100; i++) {
            if (isPrime(i)) {
                right = i;
                break;
            }
        }
        System.out.println("n:" + n + "left:" + left + "right:" + right);
        if (left < right)
            return left;
        if (right < left)
            return right;
        return 1;
    }

    static int[][] aesSort(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minInd = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j][1] < arr[minInd][1] ||
                        (arr[j][1] == arr[minInd][1] && arr[j][0] < arr[minInd][0])) {
                    minInd = j;
                }
            }
            int[] temp = arr[i];
            arr[i] = arr[minInd];
            arr[minInd] = temp;
        }
        return arr;
    }

    static int abs(int n) {
        if (n < -1)
            return -1 * n;
        return n;
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 13, 30, 17, 31 };
        int[][] mp = new int[arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            int[] a = { arr[i], abs(arr[i] - nearestPrimeNumber(arr[i])) };
            mp[i] = a;
        }
        int[][] res = aesSort(mp);

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0]);
        }

    }
}
