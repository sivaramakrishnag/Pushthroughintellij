public class Countofrepeatedletters {
    public static void main(String[] args) {
        String s = "ramakrishna";
        int l = s.length();
        int c = 0;
        for (int i = 0; i<l; i++)
        {
            if (s.charAt(i) == 'a') {
                c++;
            }
        }
        System.out.println(c);


    }


}
