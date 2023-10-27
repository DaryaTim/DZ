public class Main {
    public static int duplicates(int a[], int n)
    {
        if (n == 0 || n == 1) {
            return n;
        }

        int[] data = new int[n];
        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (a[i] != a[i + 1]) {
                data[j++] = a[i];
            }
        }

        data[j++] = a[n - 1];

        for (int i = 0; i < j; i++) {
            a[i] = data[i];
        }

        return j;
    }
    public static void main(String[] args)
    {
        int a[] = { 8, 1, 9, 9, 5 };
        int n = a.length;

        n = duplicates(a, n);


        for (int i = 0; i < n; i++)
            System.out.print(a[i] + " ");
    }
}
