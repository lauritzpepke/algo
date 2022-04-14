package Uge2;

import java.io.*;
import java.util.*;

public class Merge {

    private static int[] merge(int[] A, int[] B) {

        int[] result = new int[A.length + B.length];
        int i = 0;

        for (int element : A) {
            result[i] = element;
            i++;
        }
        for (int element : B) {
            result[i] = element;
            i++;
        }
        return sort(result);
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

        System.out.println(Arrays.toString(merge(A, B)).replace("[", "").replace(",", "").replace("]", ""));
    }
}