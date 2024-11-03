// String to String Array:

public class StrToStrArray
{
    public static void main(String[] args)
    {
        String str = "Hello World to Avinandan";
        String[] strArray = str.split(" ");
        for (String s : strArray)
        {
            System.out.println(s);
        }
    }
}