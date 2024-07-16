public class P3 {
    public static void main(String[] args) {
        String[][] arr = { { "Paari", "Karikalan" }, { "Udhiran", "Sendhan" }, { "Sendhan", "ArulMozhi" },
                { "Karikalan", "Sendhan" } };
        String grandFather = "ArulMozhi";
        String child = "";
        for (String[] i : arr) {
            if (i[1].equals(grandFather)) {
                child = i[0];
            }
        }
        int count = 0;
        for (String[] i : arr) {
            if (i[1].equals(child)) {
                System.out.print(i[0]);
                count++;
            }
        }
        System.out.println(count);
    }
}
