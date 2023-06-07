import java.util.*;

public class setZero {
    public static void main(String[] args) {
        int[][] arr1 = { { 1, 2, 3 }, { 4, 0, 5 }, { 6, 7, 8 } };
        // setZero1(arr1);
    }

    // Method 1 by storing the cordinates of zero in arraylist of array.

    // public static void setZero1(int[][] arr) {
    // int n = arr.length;
    // int m = arr[0].length;
    // ArrayList<int[]> list = new ArrayList<>();

    // for (int i = 0; i < n; i++) {
    // for (int j = 0; j < m; j++) {
    // if (arr[i][j] == 0) {

    // list.add(new int[] { i, j });
    // }
    // }
    // }
    // for (int i = 0; i < list.size(); i++) {
    // int a = list.get(i)[0];
    // int b = list.get(i)[1];
    // for (int j = 0; j < m; j++) {
    // arr[a][j] = 0;
    // }
    // for (int k = 0; k < n; k++) {
    // arr[k][b] = 0;
    // }

    // }
    // for (int[] a : arr) {
    // for (int b : a) {
    // System.out.println(b);
    // }
    // }

    // }

    // Method 2 by storing the cordiates of zero in set to minimize the work and
    // optimize the code

    public static void setZero2(int[][] arr) {
        int n = arr.length;
        int m = arr[0].length;
        Set<Integer> setrows = new HashSet<Integer>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == 0) {

                    list.add(new int[] { i, j });
                }
            }
        }
        for (int i = 0; i < list.size(); i++) {
            int a = list.get(i)[0];
            int b = list.get(i)[1];
            for (int j = 0; j < m; j++) {
                arr[a][j] = 0;
            }
            for (int k = 0; k < n; k++) {
                arr[k][b] = 0;
            }

        }
    }

}
