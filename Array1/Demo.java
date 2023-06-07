import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<int[]> list = new ArrayList<>();
        int[] a1 = { 1, 2 };
        int[] a2 = { 2, 3 };

        list.add(a1);
        list.add(a2);
        System.out.println(list.get(0)[1]);
    }
}
