public class PrimeNum {
    public static boolean primCheck (int num )
    {
        if (num<=1)
        {
            return false;
        }
        else
        {
            for (int i=2;i<=Math.sqrt(num);i++)
            {
                if (num%i==0)
                {
                    return false;
                }
            }
            return true;
        }

    }
    public static void main(String[] args) {
        int num = 10;
        if (primCheck(num))
        {
            System.out.println("Yes number is prime ");
        }
        else{
            System.out.println("The num is not prime");
        }
    }
}
