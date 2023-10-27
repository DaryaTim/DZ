import java.util.Arrays;
public class Range {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6};
        data = rot(data, -1);
        System.out.println(Arrays.toString(data));
    }
    public static int[] rot(int[] data, int k) {
        while (k < 0)
            k += data.length;
        k = k % data.length;
        int[] m = Arrays.copyOfRange(data, k, data.length + k);
        for (int i = 0; i < k; i++)
            m[m.length - k + i] = data[i];
        return m;
    }
}