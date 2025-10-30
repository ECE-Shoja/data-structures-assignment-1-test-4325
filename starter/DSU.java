import java.util.*;

public class DSU {

    static int[] parent, sz;

    static int findSet(int v) {
        // TODO: implement path compression
        return v;
    }

    static void unionSet(int a, int b) {
        // TODO: implement union by size/rank
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int q = sc.nextInt();

        parent = new int[n + 1];
        sz = new int[n + 1];

        for (int i = 1; i <= n; i++) {
            parent[i] = i;
            sz[i] = 1;
        }

        while (q-- > 0) {
            char type = sc.next().charAt(0);
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (type == '+') {
                unionSet(a, b);
            } else { // '?'
                if (findSet(a) == findSet(b)) System.out.println("YES");
                else System.out.println("NO");
            }
        }

        sc.close();
    }
}
