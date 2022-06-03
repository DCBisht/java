import java.util.*;

public class binaray_palindrome {
    static String dectobin(int n) {
        String b = "";
        while (n != 0) {
            int k = n % 2;
            b = k + b;
            n = n / 2;
        }
        System.out.println(b);
        return b;
    }

    static boolean cheack(String s) {
        String s1, s2;
        s1 = s.substring(0, s.length() / 2);
        if (s.length() % 2 == 0) {
            s2 = s.substring(s.length() / 2, s.length());
        } else {
            s2 = s.substring(s.length() / 2 + 1, s.length());
        }
        System.out.println(s1);
        System.out.println(s2);
        if (s1.equals(s2))
            return true;
        else
            return false;
    }

    public static void main(String ar[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to be checked");
        int N = sc.nextInt();
        sc.close();
        String s, ns = "";
        s = Integer.toBinaryString(N);
        for (int i = 0; i < s.length(); i++) {
            ns = s.charAt(i) + ns;
        }
        if (ns.equals(s))
            System.out.println("Binary Palindrome");
        else
            System.out.println("Not a Binary Palindrome");
        System.out.println("Binary of number is " + dectobin(N));
        System.out.println(cheack(s));
    }
}
