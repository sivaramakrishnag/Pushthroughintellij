public class searchInArray {
    public static void main(String[] args ) {
        //int a[] = new int[5];
        int a[] = {1,2,3,4,5};
        int y = 6;

        for (int x : a) {
            if (x == y) {
                System.out.println(x);

            } else {


                System.out.println(y + "not found");
            }

            }


        }
    }
