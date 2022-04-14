package Uge2;

import java.io.*;
import java.util.*;

public class BinarySearch {

    private static int binarySearch(int[] A, int i, int j, int x) {
        if (j < i) {
            return -1;
        }
        int m = (i+j)/2;

        if (A[m] == x) {
            return m;
        }
        else if (A[m] < x) {
            return binarySearch(A, m+1, j, x);
        }
        else return binarySearch(A, i, m-1, x);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(in.readLine());
        int[] A = new int[a];
        StringTokenizer st = new StringTokenizer(in.readLine());
        for (int i = 0; i < a; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        int b = Integer.parseInt(in.readLine());
        int[] B = new int[b];
        StringTokenizer stb = new StringTokenizer(in.readLine());
        for (int i = 0; i < b; i++) {
            B[i] = Integer.parseInt(stb.nextToken());
        }
        if (B.length > 0) {
            for (int i = 0; i < B.length; i++) {
                System.out.println(binarySearch(A, 0, A.length-1, B[i]));
            }
        }
        else System.out.println(-1);
    }
}
