package day_07;

import java.util.List;

class Linear {

    public int lSearch(int[] a, int find) {
        for (Integer i : a) {
            if (i == find) {
                return i;
            }
        }
        return 0;
    }
}

public class LinearSearch {

    public static void main(String[] args) {
        Linear l = new Linear();
        int[] a = {10, 20, 30, 45, 35, 64, 34, 67, 26, 85};

        if (l.lSearch(a, 45) != 0) {
            System.out.println("Number is present");
        } else {
            System.out.println("Number is absent");
        }
    }
}
