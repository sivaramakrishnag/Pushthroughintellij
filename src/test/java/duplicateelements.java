
        public class duplicateelements {
            public static void findDuplicatesUsingTwoLoops(String input) {
                char[] characters = input.toCharArray();
                int length = characters.length;

                System.out.print("Duplicate Characters using Two Loops: ");
                for (int i = 0; i < length; i++) {
                    for (int j = i + 1; j < length; j++) {
                        if (characters[i] == characters[j]) {
                            System.out.print(characters[i] + " ");
                            break;
                        }
                    }
                }
            }

        }


        //int x = a[0];
        //for()
      //  for(int i=0; i<l;i++)
        //{
     //       if(a[i]==x){
             //   System.out.println(a[i]);







