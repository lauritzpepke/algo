package Uge1;

import java.util.Scanner;

public class peak1{

    public static int peak1(int A[], int n) {
        if (A[0] >= A[1])
            return 0;
        for(int i = 1; i < A[n-2]; i++) {
            if (A[i] >= A[i - 1] && A[i] >= A[i + 1]) {
                return i;
            }
        }
        if (A[n-2] <= A[n-1])
          return n-1;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int A[] = new int[m];

        for(int i = 0; i < m; i++) {
            A[i] = sc.nextInt();
        }

        int n = A.length;
        System.out.print(peak1(A, n));
    }
}

