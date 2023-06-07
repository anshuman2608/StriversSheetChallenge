public class buyStock {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        int n = 6;
        System.out.println(maxProfit(arr, n));
    }

    public static int maxProfit(int[] arr, int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    int dif = arr[j] - arr[i];
                    max = Math.max(dif, max);
                }
            }
        }
        return max;
    }
}
