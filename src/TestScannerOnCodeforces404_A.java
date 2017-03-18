import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TestScannerOnCodeforces404_A {

    public static void main(String[] args) {
        FScanner sc = new FScanner(System.in);
        String s;
        int n = sc.nextInt();
        char f;
        int sum = 0;
        while (n-- > 0) {
            s = sc.nextLine();
            f = s.charAt(0);
            switch (f) {
                case 'T' :
                    sum += 4;
                    break;
                case 'C' :
                    sum += 6;
                    break;
                case 'O' :
                    sum += 8;
                    break;
                case 'D' :
                    sum += 12;
                    break;
                case 'I' :
                    sum += 20;
                    break;
                default:
                    break;
            }
        }
        System.out.println(sum);
    }
}

class FScanner {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public FScanner(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public String nextLine() {
        try {
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}