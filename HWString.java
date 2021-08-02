public class HWString {
    public static void main(String[] args) {
        /**Write a program where the verification of the palindrome is provided. Palindrome is the sentence which reads the same backward as forward. Please take a look at description of the palindrome: https://en.wikipedia.org/wiki/Palindrome

●      Create the algorithm which will process the sentence and return the result - is this sentence a palindrome or not.

●      Testing sentences:

        a.      Mom

        b.      Was it a car or a cat I saw?

                c.      Madam, in Eden, I’m Adam.

        d.      Yo, banana boy!
--------------------------
         Task 3 (1h)

         Write a program where actions with String formatting as Date, LocalDate and LocalDateTime will be provided.

         Please take a look at this tutorial:

         https://www.journaldev.com/2800/java-8-date-localdate-localdatetime-instant

         ●      Try to repeat the actions in the tutorial;

         ●      Try to ask the user to write the day, month and year of the birthday in the console. Read all values and create a Date, LocalData and LocalDateTime objects and print out these in the console.*/

        String polindrom = "m o m  ";
        char [] array = new char [polindrom.length()] ;
        //String[] arrayString= string.split("");
        //char arrayChar [] = new char[string.length()];
        //int j = 0;
        //char characterFromString;
        int j = 0 ;
        for (int i = 0; (i < polindrom.length() && ("polindrom.charAt(i)".matches("[a-zA-Z]"))); i++) {
            array[j] = polindrom.charAt(i);
            System.out.print(array[j]);
            j++;

        }

         //   if (arrayString[i].matches("[a-zA-Z]")) {
          //      char characterToCheck = arrayString[i].charAt(0);
           //     arrayChar[i] = characterToCheck;
           //     System.out.println(arrayChar[i]);

          //     j++;
          //  }
       // }
        //int i;
        //j= j-1;
        //System.out.println(j + " j");

        /*for(i = 0; i<=j; i++){
            System.out.println(arrayChar[0]+ " " +arrayChar[1]);
            if (arrayChar[i] == arrayChar[j]) {

                j--;
            }else{
                System.out.println(" NO");
                break;
            }
        }
        System.out.println("---------------");
        System.out.println("i" + i + "j" + j);
        if (j<=i){
            System.out.println(" yes");
        }else {
            System.out.println(" No");
        }*/
        /*String inputString = "mom";
        for (int i = 0; i < inputString.length(); i++) {

            char characterToCheck = inputString.charAt(i);
            char[] characterArray = {characterToCheck};

            String stringToCheck = new String(characterArray);

            if (stringToCheck.matches("[^a-zA-Z\\s]")) {
                characterArray[i] =
            }*/

    }
}
