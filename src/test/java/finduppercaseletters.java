public class finduppercaseletters {

    public static void main(String[] args) {
        String s = "HotChips";
        for (int i = 0; i < s.length(); i++)

            if (Character.isUpperCase(s.charAt(i))) {
                System.out.println(s.charAt(i));
            }

    }
}
