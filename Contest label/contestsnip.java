import java.util.*;
import java.io.*;

public class Compare_and_Connect {
    public static void main(String[] args) throws IOException {
        FastScanner fs = new FastScanner();
        StringBuilder output = new StringBuilder();

        long t = fs.nextLong();
        while (t-- > 0) {
            
            }
        }

        System.out.print(output.toString());
    }

    static class FastScanner {
        private final BufferedReader br;
        private StringTokenizer st;

        FastScanner() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() throws IOException {
            while (st == null || !st.hasMoreTokens()) {
                st = new StringTokenizer(br.readLine());
            }
            return st.nextToken();
        }

        long nextLong() throws IOException {
            return Long.parseLong(next());
        }
    }
}
