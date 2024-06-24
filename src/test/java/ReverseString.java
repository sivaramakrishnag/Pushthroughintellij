public class ReverseString {
    public static void main(String[] args)
    {
        String s= "Ganesh";
        String r="";
        int c= s.length();

        for(int i=0;i<c;i++) {
            r = s.charAt(i) + r;

        }
        System.out.println(r);
    }
}
