import java.util.*;

public class LeftRotation {


    static int[] rotLeft(int[] a, int d) {
        int n = a.length;
        int[] rotArray = new int[n];

        for (int oldIndex = 0; oldIndex < n; oldIndex++) {
            int newIndex = (oldIndex + n - d) % n;
            rotArray[newIndex] = a[oldIndex];
        }

        return rotArray;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int res[] = rotLeft(a, d);
        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
        
        
        scanner.close();
    }
}
