import java.util.*;

public class longest_occurence_of_one {
    static int count(String s) {
        int c = 0, g = 0;
        String p = s;
        for (int i = 0; i < p.length(); i++) {
            if (p.charAt(i) == '1') {
                c++;
            } else {
                g = g < c ? c : g;
                c = 0;
            }

        }
        g = g < c ? c : g;
        c = 0;
        System.out.println(g);
        return g;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();

        int b = 0, gr = 0;
        for (int i = 0; i < s.length(); i++) {
            String ns = "";
            if (s.charAt(i) == '0') {
                ns = s.substring(0, i) + '1' + s.substring(i + 1, s.length());
                System.out.println(ns);
                b = count(ns);
                gr = gr > b ? gr : b;

            }
        }
        System.out.println("The greatest occurence is " + gr);
    }
}
