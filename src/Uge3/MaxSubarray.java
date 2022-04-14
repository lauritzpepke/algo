package Uge3;

import java.io.*;
import java.util.*;

public class MaxSubarray {

    private int maxSubarray(int[] A) {
        int max = Integer.MIN_VALUE, max_end = 0;

        for (int i = 0; i < A.length; i++) {
            max_end = max_end + A[i];
            if (max < max_end)
                max = max_end;
            if (max_end < 0)
                max_end = 0;
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        new Uge3.MaxSubarray().run();
    }

    private void run() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(in.readLine());

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println((maxSubarray(A)));
    }
}