
public class Fibonacci {
    public static void main(String[] args) {
        int n = 10;
        int a=0;
        int b = 1;
        System.out.println("Fibonacci Series up to " + n + "th term:");
        System.out.print("0 1 ");
        for (int i=2;i<n;i++)
        {
            int next = a+b;
            System.out.print(next+" ");
            a=b;
            b=next;
        }
    }
}
