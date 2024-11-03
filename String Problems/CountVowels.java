public class CountVowels {
    public static void main(String[] args) {
        String str = "Hey I am Avinandan ";
        int count1 = 0;
        int count2 = 0;
        String sh = str.replace(" ","");
        String s = sh.toLowerCase();
        char[] arr = s.toCharArray();
        // Process 1
        String vowel  = "aeiouAEIOU";
        for (char ch: arr)
        {
            if(vowel.contains(Character.toString(ch)))
            {
                count1++;
            }
        }
        System.out.println("The vowels are :  "+count1);
        // Process 2
        for (char c: arr)
        {
            if(c == 'a' || c == 'e' || c == 'i' || c =='o' || c =='u')
            {
                count2++;
            }
        }
        System.out.println("Vowels are: "+count2);


    }
}