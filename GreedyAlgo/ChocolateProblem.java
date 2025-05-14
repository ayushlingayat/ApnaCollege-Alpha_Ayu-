import java.util.*;

public class ChocolateProblem {
    public static void main(String args[]) {
        int n = 4, m = 6;
        // n - rows, m - columns
        Integer costVer[] = {2, 1, 3, 1, 4}; // m-1 cuts
        Integer costHor[] = {4, 1, 2};       // n-1 cuts

        // Sorting in decreasing order
        Arrays.sort(costVer, Collections.reverseOrder());
        Arrays.sort(costHor, Collections.reverseOrder());

        int h = 0, v = 0; // Indexes for horizontal and vertical cuts
        int hp = 1, vp = 1; // Number of horizontal pieces (hp) and vertical pieces (vp)
        int cost = 0;

        while (h < costHor.length && v < costVer.length) {
            if (costVer[v] > costHor[h]) {
                cost += costVer[v] * hp;
                vp++;
                v++;
            } else {
                cost += costHor[h] * vp;
                hp++;
                h++;
            }
        }

        // Remaining horizontal cuts
        while (h < costHor.length) {
            cost += costHor[h] * vp;
            hp++;
            h++;
        }

        // Remaining vertical cuts
        while (v < costVer.length) {
            cost += costVer[v] * hp;
            vp++;
            v++;
        }

        System.out.println("Minimum cost to cut the chocolate is: " + cost);
    }
}
