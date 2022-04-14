package Uge2;

import java.io.*;
import java.util.*;

public class Stones {

    private int stones(int[] A, int W) {

        int weight = 0;
        int stones = 0;

        do {
            weight += A[stones];
            stones++;
        } while (weight < W && stones < A.length);

        if (weight > W) {
            stones--;
        }
        return stones;
    }

    private static int[] sort(int[] result) {
        boolean sorted = false;
        int j;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < result.length - 1; i++) {
                if (result[i] > result[i+1]) {
                    j = result[i];
                    result[i] = result[i+1];
                    result[i+1] = j;
                    sorted = false;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) throws IOException {
        new Stones().run();
    }

    private void run() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s[] = in.readLine().trim().split(" ");
        int N = Integer.parseInt(s[0]);
        int W = Integer.parseInt(s[1]);

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(in.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println(stones(sort(A), W));
    }
}