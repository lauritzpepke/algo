package Afleveringer;

import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Pillarjumpers {

    private int pillarjumper(int[] A, int J) {

        int S = 0; // S = minimum strength of jumps

        int currentPos = A[0];
        int targetPos = A[A.length - 1];

        int k = 0; //antal hop

        if (k < J){
            for (int i = 1; i == J; i++){

            }
        }

        return S;
    }

    public static void main(String[] args) throws IOException {
        new Pillarjumpers().run();
    }

    private void run() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        String s[] = in.readLine().trim().split(" ");
        int N = Integer.parseInt(s[0]);
        int J = Integer.parseInt(s[1]);

        int[] A = new int[N];
        StringTokenizer st = new StringTokenizer(in.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        System.out.println((pillarjumper(A, J)));
    }
}
