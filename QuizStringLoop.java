public class QuizStringLoop {
    public static void main(String[] args) {
        //2
        System.out.println("2 task");
        String txt = "ABCD";
        System.out.println(txt.length()); //4

        //3
        System.out.println("3 task");
        String txt2 = "Hello World";
        System.out.println(txt2.toLowerCase()); //hello world

        //4
        System.out.println("4 task");
        String txt3 = "Lorem ipsum dolor sit amet (ipsum), consectetur adipiscing elit ipsum, sed do eiusmod tempor magna aliqua.";
        System.out.println(txt3.indexOf("ipsum")); //the place of substring

        //6
        System.out.println("6 task");
        //Write a Java program to count the numbers of an input string.
        //prints the sum of all digits
        String string = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
                int counter = 0;
        String[] array= string.split("");
        for (int i = 0; i < array.length; i++) {
            if (array[i].matches("(.)*(\\d)(.)*")) {
                counter++;
                //sum += Double.parseDouble(array[i]);
                //System.out.println(sum);
            }
        }
        System.out.println(counter + " is the number of numbers in the string");

        //7
        System.out.println("7 task");
        //Write a Java program to count the letters in input string.

        String string2 = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        String[] array2= string2.split("");
        counter = 0;
        for (int i = 0; i < array2.length; i++) {
            if (array2[i].matches("[^a-zA-Z0-9\\s]")) {
                //System.out.print(array2.[i]);
                System.out.println(String.format("Character %s is matching the REGEX", array2[i]));
                counter++;
            }
        }
        System.out.println(String.format("the number of special characters is %d.", counter));

        //8
        //Write a Java program to count the spaces of an input string.
        String string3 = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        String[] array3= string3.split("");
        counter = 0;
        for (int i = 0; i < array3.length; i++) {
            if (array3[i].matches("[a-zA-Z]")) {
                counter++;
            }
        }
        System.out.println(String.format("the number of letters is %d.", counter));

        //9 count spaces
        String string4 = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
        String[] array4= string4.split("");
        counter = 0;
        for (int i = 0; i < array4.length; i++) {
            if (array4[i].matches(" ")) {
                counter++;
            }
        }
        System.out.println(String.format("the number of spaces is %d.", counter));

        //10 print ascii
        char character = 'Z';
        int ascii = character;
        System.out.println(String.format("The ASCII value of %c is %d ", character, ascii));

    }
}
