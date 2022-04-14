package Uge2;

import java.io.*;
import java.util.*;

public class MergeSort {

    private static int[] ms(int[] A) {
        boolean sorted = false;
        int j;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < A.length - 1; i++) {
                if (A[i] > A[i+1]) {
                    j = A[i];
                    A[i] = A[i+1];
                    A[i+1] = j;
                    sorted = false;
                }
            }
        }
        return A;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(in.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(Arrays.toString(ms(A)).replace("[", "").replace(",", "").replace("]", ""));
    }
}
