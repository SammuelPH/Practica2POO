//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

class Capturarinformacion {
    Capturarinformacion() {
    }

    public static int capturarnumeroentero(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextInt();
    }

    public static float capturarFlotante(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextFloat();
    }

    public static double capturarDoble(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextDouble();
    }

    public static String capturarString(String msg) {
        Scanner sc = new Scanner(System.in);
        System.out.print(msg + ": ");
        return sc.nextLine();
    }
}
