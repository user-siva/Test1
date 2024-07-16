import java.util.*;

public class P1 {
    static void desSort(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int smallInd = i;
            int small = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (small > arr.get(j)) {
                    small = arr.get(j);
                    smallInd = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, small);
            arr.set(smallInd, temp);

        }

    }

    static void aesSort(List<Integer> arr) {
        for (int i = 0; i < arr.size(); i++) {
            int bigInd = i;
            int big = arr.get(i);
            for (int j = i + 1; j < arr.size(); j++) {
                if (big < arr.get(j)) {
                    big = arr.get(j);
                    bigInd = j;
                }
            }
            int temp = arr.get(i);
            arr.set(i, big);
            arr.set(bigInd, temp);

        }

    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (((i + 1) % 2) == 0) {
                even.add(arr[i]);
            } else {
                odd.add(arr[i]);
            }
        }
        aesSort(odd);
        desSort(even);

        for (int i = 0; i < arr.length; i++) {
            if (i < odd.size())
                res.add(odd.get(i));
            if (i < even.size())
                res.add(even.get(i));
        }

        System.out.println(res);
    }
}