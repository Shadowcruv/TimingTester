import java.util.*;
public class TimingTime {

    public static enum Computation {BRUTE_FORCE, EUCLID}

    private Scanner scanner;

    public static void main(String[] args) {
        TimingTime tester = new TimingTime();
        tester.start();
    }

    public TimingTime() {
        scanner = new Scanner(System.in);
    }

    public void start() {
        long brute_Force, euclidTime;
        int m, n;
        while (iscontinue()) {
            m = getPositiveInteger();
            n = getPositiveInteger();

            brute_Force = timeMethod(m, n, Computation.BRUTE_FORCE);
            euclidTime = timeMethod(m, n, Computation.EUCLID);
            System.out.println("M: " + m);
            System.out.println("N:" + n);
            System.out.println("BruteForceTime " + brute_Force);
            System.out.println("EuclidTime " + euclidTime);
        }
    }

    public boolean iscontinue() {
        boolean response = false;
        String input;
        System.out.print("Run a Test");
        input = scanner.next();
        if (input.equals("Y") || input.equals("y")) {
            response = true;
        }
        return response;
    }

    public int getPositiveInteger() {
        return 1;
    }

    public long timeMethod(int m, int n, Computation type) {
        Date startTime = new Date();
        if (type == Computation.BRUTE_FORCE) {
            gcd_BruteForce(m, n);
        } else {
            gcd_euclid(m, n);
        }
        Date endTime = new Date();
        return endTime.getTime() - startTime.getTime();
    }

    public int gcd_BruteForce(int m, int n) {
        int d = m;
        int y = n;
        int r;
        d = scanner.nextInt();
        y = scanner.nextInt();
        while (d % y!=0) {
           d % y = r;
            d = y; y =r;
        }
        return y;}
        public void gcd_euclid ( int m, int n){
        }
    }


