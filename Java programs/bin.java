import java.util.*;

public class bin {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number in integer");
        int n = sc.nextInt();
        sc.close();
        String s = Integer.toBinaryString(n);
        if (s.length() > 8)
            s = s.substring(s.length() - 8, s.length());
        while (s.length() < 8) {
            s = '0' + s;
        }

        System.out.println("string is " + s);
        String ns = s.substring(4, 8) + s.substring(0, 4);
        System.out.println("ns is " + ns);
        System.out.println("Integer value of swaped is " + Integer.parseInt(ns, 2));

    }

}
