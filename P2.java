import java.util.HashMap;

public class P2 {

    public static String solution(int n) {
        String res = "";
        int place = 1;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(0, "");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");

        while (n != 0) {
            int rem = n % 10;
            if (place == 1) {
                res = map.get(rem * place) + " " + res;
            } else if (place == 10) {
                if (rem == 1) {
                    res = map.get(rem * place + n % 10) + " ";
                    n /= 10;
                    place *= 10;
                } else {
                    res = map.get(rem * place) + " " + res;
                }
            } else if (place == 100) {
                res = map.get(rem) + " Hundred and " + res;
            } else if (place == 1000) {
                res = map.get(rem) + " Thousand and " + res;
            }
            n /= 10;
            place *= 10;
        }

        return res.trim();
    }

    public static void main(String[] args) {
        int n = 10000;
        System.out.println(solution(n));
    }
}
