public class Problem05 {

    static int linear(int[] arr, int x) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) return i;
        }
        return -1;
    }

    static int binary(int[] arr, int x) {
        int l = 0, r = arr.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;

            if (arr[m] == x) return m;
            if (arr[m] < x) l = m + 1;
            else r = m - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3};

        System.out.println(linear(arr, 2));
        System.out.println(binary(arr, 2));
    }
}