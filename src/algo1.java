import java.io.*;
import java.util.*;

public class algo1 {

    private int peak1(int[] A) {
        if (A[0] >= A[1])
            return 0;

        for (int i = 1; i < A.length - 1; i++) {
            if (A[i] >= A[i - 1] && A[i] >= A[i + 1]) {
                return i;
            }
        }
        if (A[A.length - 2] <= A[A.length - 1])
            return A.length - 1;
        return -1;
    }

    public static void main(String[] args) throws IOException {
        new algo1().run();
    }

    private void run() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(in.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println((peak1(A)));
    }
}
