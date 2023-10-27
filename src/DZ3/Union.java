import java.util.Arrays;

public class Union {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5, 8, 13};
        int[] b = {4, 9, 1, 2, 3, 888};
        int[] c = new int[a.length + b.length];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i];
            count++;
        }
        for (int j = 0; j < b.length; j++) {
            c[count++] = b[j];
        }
        for (int i = 0; i < c.length; i++)
            System.out.print(Arrays.toString(c));
    }
}
