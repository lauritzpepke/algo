import java.io.*;
import java.util.*;

public class Peak3 {

    private int peak3(int[] A, int i, int j) {
        int m = ((i+j)/2);
        if (A[m] >= A[m - 1] && A[m] >= A[m + 1])
            return m;
        else if (A[m-1] > A[m])
            return peak3(A,i,m-1);
        else if (A[m+1] > A[m])
            return peak3(A,m+1,j);
        return m;
    }

    public static void main(String[] args) throws IOException {
        new Peak3().run();
    }

    private void run() throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(in.readLine());
        int[] A = new int[n];
        StringTokenizer st = new StringTokenizer(in.readLine());


        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println((peak3(A)));
    }
}