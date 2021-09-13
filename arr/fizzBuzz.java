package arr;

import java.io.*;
import java.util.*;

public class fizzBuzz {
    static ArrayList<String> main() throws Exception{
        int n= sc.nextInt();
        ArrayList<String> res=new ArrayList<>();
        for (int i = 1; i <=n; i++) {
            if(i%15==0) res.add("FizzBuzz");
            else if(i%5==0) res.add("Buzz");
            else if(i%3==0) res.add("Fizz");
            else res.add(String.valueOf(i));
        }
    return res;
    }
    public static void main(String[] args) throws Exception{
        sc=new MScanner(System.in);
//		sc=new MScanner("altstadt.in");
        pw = new PrintWriter(System.out);
        int tc=1;
//        tc=sc.nextInt();
        for(curt=1;curt<=tc;curt++) {
//			pw.printf("Case #%d: ", i);
            pw.print(main());
        }

        pw.flush();
    }
    static int curt;
    static PrintWriter pw;
    static MScanner sc;
    static class MScanner {
        StringTokenizer st;
        BufferedReader br;
        public MScanner(InputStream system) {
            br = new BufferedReader(new InputStreamReader(system));
        }

        public MScanner(String file) throws Exception {
            br = new BufferedReader(new FileReader(file));
        }

        public String next() throws IOException {
            while (st == null || !st.hasMoreTokens())
                st = new StringTokenizer(br.readLine());
            return st.nextToken();
        }
        public int[] intArr(int n) throws IOException {
            int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
            return in;
        }
        public long[] longArr(int n) throws IOException {
            long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
            return in;
        }
        public int[] intSortedArr(int n) throws IOException {
            int[]in=new int[n];for(int i=0;i<n;i++)in[i]=nextInt();
            shuffle(in);
            Arrays.sort(in);
            return in;
        }
        public long[] longSortedArr(int n) throws IOException {
            long[]in=new long[n];for(int i=0;i<n;i++)in[i]=nextLong();
            shuffle(in);
            Arrays.sort(in);
            return in;
        }
        public Integer[] IntegerArr(int n) throws IOException {
            Integer[]in=new Integer[n];for(int i=0;i<n;i++)in[i]=nextInt();
            return in;
        }
        public Long[] LongArr(int n) throws IOException {
            Long[]in=new Long[n];for(int i=0;i<n;i++)in[i]=nextLong();
            return in;
        }
        public String nextLine() throws IOException {
            return br.readLine();
        }

        public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }

        public char nextChar() throws IOException {
            return next().charAt(0);
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public boolean ready() throws IOException {
            return br.ready();
        }

        public void waitForInput() throws InterruptedException {
            Thread.sleep(3000);
        }

    }
    static void dbg(int[]in) {
        System.out.println(Arrays.toString(in));
    }
    static void dbg(long[]in) {
        System.out.println(Arrays.toString(in));
    }
    static void sort(int[]in) {
        shuffle(in);
        Arrays.sort(in);
    }
    static void sort(long[]in) {
        shuffle(in);
        Arrays.sort(in);
    }
    static void shuffle(int[]in) {
        for(int i=0;i<in.length;i++) {
            int idx=(int)(Math.random()*in.length);
            int tmp=in[i];
            in[i]=in[idx];
            in[idx]=tmp;
        }
    }
    static void shuffle(long[]in) {
        for(int i=0;i<in.length;i++) {
            int idx=(int)(Math.random()*in.length);
            long tmp=in[i];
            in[i]=in[idx];
            in[idx]=tmp;
        }
    }
}