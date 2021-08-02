//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Loops {
    public Loops() {
    }

    public static void main(String[] args) {
        System.out.println("FOR: ");

        int i;
        for(i = 10; i >= -10; --i) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------");
        System.out.println("WHILE: ");

        for(i = 10; i >= -10; --i) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("-----------------");
        System.out.println("DO WHILE: ");
        i = 10;

        do {
            System.out.print(i + " ");
            --i;
        } while(i >= -10);

        System.out.println();
        System.out.println("-----------------");
        System.out.println("*****************");
        System.out.println("WHILE: every second number: 1...20: ");

        for(i = 1; i <= 18; i += 2) {
            System.out.print(i + " ,");
        }

        System.out.print(i);
        System.out.println();
        System.out.println("FOR: every second number: 1...20: ");


int j = 0;
        for(j = 1; j <= 18; j += 2) {
            System.out.print(j + " ,");
        }

        System.out.println(j);
    }
}
