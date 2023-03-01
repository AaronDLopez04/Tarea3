package ico.fes.unam;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una cadena de X y O, puedes agregar espacios con un _: ");
        java.lang.String ent = sc.nextLine();
        java.lang.String[] gato = ent.split("|");

        String uno = gato[0];
        String dos = gato[1];
        String tres = gato[2];
        String cuatro = gato[3];
        String cinco = gato[4];
        String seis = gato[5];
        String siete = gato[6];
        String ocho = gato[7];
        String nueve = gato[8];

        System.out.println("_____");
        System.out.println("|" + (gato[0] + gato[1] + gato[2] + "|"));
        System.out.println("|" + (gato[3] + gato[4] + gato[5] + "|"));
        System.out.println("|" + (gato[6] + gato[7] + gato[8] + "|"));
        System.out.println("_____");
    }
}