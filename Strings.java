//Strings
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Strings {
    public Strings() {
    }

    public static void main(String[] args) {
        String[] myArray = new String[]{"Copenhagen", "Paris", "Tokyo", "wqe", "Bristol", "Mumbai", "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis"};
        int countFirstLetter = 0;
        int countLastLetter = 0;
        int countLength = 0;
        int countLetter = 0;
        int countElement = 0;

        for(int i = 0; i < myArray.length; ++i) {
            if (myArray[i].charAt(0) == 'C') {
                ++countFirstLetter;
            }

            if (myArray[i].matches(".*i$")) {
                ++countLastLetter;
            }

            if (myArray[i].length() == 5) {
                ++countLength;
            }

            if (myArray[i].matches(".*e.*")) {
                ++countLetter;
            }

            if (myArray[i].matches(".*en.*")) {
                ++countElement;
            }
        }

        System.out.println("The number of values starting from C is " + countFirstLetter);
        System.out.println("The number of values ending with i is " + countLastLetter);
        System.out.println("The number of values with the length of 5 is " + countLength);
        System.out.println("The number of values with letter e in it is  " + countLetter);
        if (countElement != 0) {
            System.out.println("There is an element with \"en\" inside ");
        }

        System.out.println("The lengths array is: ");
        int[] nameLength = new int[myArray.length];

        for(int j = 0; j < myArray.length; ++j) {
            nameLength[j] = myArray[j].length();
            System.out.print(nameLength[j] + " ");
        }

    }
}
