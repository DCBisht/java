import java.util.*;

public class selection_sort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter the elements of array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();
        int min = 0;
        for (int i = 0; i < n; i++) {
            min = a[i];
            int pos = i;
            for (int j = i + 1; j < n; j++) {
                if (min > a[j]) {
                    min = a[j];
                    pos = j;

                }

            }
            a[pos] = a[i];
            a[i] = min;
        }
        for (int i = 0; i < n; i++) {

            System.out.print(a[i] + " ");

        }
    }
}
