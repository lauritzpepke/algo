import java.io.*;
import java.util.*;

public class Peak2 {

    private int peak2(int[] A) {
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] > A[max]) max = i;
        }
        return max;
    }

    public static void main(String[] args) throws IOException {
        new Peak2().run();
    }

    private void run() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(in.readLine());

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println((peak2(A)));
    }
}